
// Enums are used to define a set of constants hence the compiler knows all the values at compile time
abstract class A{

}

interface DoColor{
    fun doColor()
}

enum class Color(val colorName: String , val colorValue: Int): DoColor{
    RED("Red", 1) {
        override fun doColor() {
            println("Color is Red")
        }
    },
    GREEN("Green",2) {
        override fun doColor() {
            println("Color is Green")
        }
    },
    BLUE("Blue",3) {
        override fun doColor() {
            println("Color is Blue")
        }
    }
}


fun main() {

    println(Color.RED.colorName)
    println(Color.RED.colorValue)
    Color.RED.doColor()
//    Color.values().forEach {
//        println(it)
//    }
//    val color = Color.RED
//    when(color){
//        Color.RED -> println("Red")
//        Color.GREEN -> println("Green")
//        Color.BLUE -> println("Blue")
//    }
}