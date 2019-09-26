package services

import java.nio.file.Paths

import akka.{Done, NotUsed}
import akka.stream.scaladsl._
import akka.stream._
import akka.actor.ActorSystem
import akka.util.ByteString

import scala.concurrent.duration.DurationDouble
import scala.concurrent.{ExecutionContextExecutor, Future}

object DataStreamer extends App {

  implicit val akkaSys: ActorSystem = ActorSystem("Data Streamer")

  implicit val materializer: ActorMaterializer = ActorMaterializer()

  implicit val sysDispatcher: ExecutionContextExecutor = akkaSys.dispatcher

  val source: Source[Int, NotUsed] = Source(1 to 100)

  val showNum: Future[Done] = source.runForeach(println)

  def lineSink(fileName: String): Sink[String, Future[IOResult]] = Flow[String]
    .map(s => ByteString(s + "\n"))
    .toMat(FileIO.toPath(Paths.get(fileName)))(Keep.right)

  val factorials: Source[BigInt, NotUsed] = source.scan(BigInt(1))((acc, next) => acc * next)

  factorials.map(_.toString).runWith(lineSink("factorials.txt"))

  factorials
    .zipWith(Source(0 to 100))((num, idx) => s"$idx != $num")
      .throttle(1, 1.second)
    .runForeach(println)
}
