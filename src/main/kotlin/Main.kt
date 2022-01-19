import java.awt.Color
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

fun main() {
    drawSquare()
}
fun drawSquare() {
    val height: Int = 500
    val width: Int = 500
    val image = BufferedImage(height, width, BufferedImage.TYPE_INT_RGB)
    val imageFile = File("src/black_box.jpg")
    val graphics = image.createGraphics()
    graphics.color = Color.RED
    graphics.drawRect(100,100,300,300)
    ImageIO.write(image, "jpg", imageFile)
}