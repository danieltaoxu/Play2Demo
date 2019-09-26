package controllers

import javax.inject.Inject
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents}

class Barcode @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  val ImageResolution = 144
  def barcode(ean: Long): Action[AnyContent] = Action {
    val MimeType = "image/png"
    try {
      val imageData = esn13BarCode(ean, MimeType)
      Ok(imageData).as(MimeType)
    }
    catch {
      case e: IllegalArgumentException =>
        Action
          BadRequest("Couldn’t generate bar code. Error: " + e.getMessage)
    }
  }

  def esn13BarCode(esn: Long, mimeType: String): Array[Byte] = {
    import java.io.ByteArrayOutputStream
    import java.awt.image.BufferedImage
    import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider
    import org.krysalis.barcode4j.impl.upcean.EAN13Bean
    val output: ByteArrayOutputStream = new ByteArrayOutputStream
    val canvas: BitmapCanvasProvider =
      new BitmapCanvasProvider(output, mimeType, ImageResolution,
        BufferedImage.TYPE_BYTE_BINARY, false, 0)
    val barcode = new EAN13Bean()
    barcode.generateBarcode(canvas, String.valueOf(esn))
    canvas.finish
    output.toByteArray
  }
}
