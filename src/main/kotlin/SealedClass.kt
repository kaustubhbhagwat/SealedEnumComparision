import kotlin.math.PI
import kotlin.math.pow

// Sealed class represents a restricted class hierarchy

sealed class Shape {
    object None : Shape()
    data class Rectangle(val width: Float, val height: Float) : Shape()
    data class Circle(val radius: Float) : Shape()
    data class Square(val side: Float) : Shape()
}

fun main() {
    val shapeNone: Shape = Shape.None
    println("Area is ${areaOf(shapeNone)}")
    val shapeRectangle: Shape = Shape.Rectangle(5.0f,6.0f)
    println("Area is ${areaOf(shapeRectangle)}")
    val shapeCircle: Shape = Shape.Circle(3f)
    println("Area is ${areaOf(shapeCircle)}")
    val shapeSquare: Shape = Shape.Circle(4f)
    println("Area is ${areaOf(shapeSquare)}")
}

fun areaOf(shape: Shape): Number = when (shape) {
    is Shape.None -> 0
    is Shape.Rectangle -> shape.width * shape.height * 0.5
    is Shape.Circle -> shape.radius.pow(2) * PI
    is Shape.Square -> shape.side.pow(2)
}