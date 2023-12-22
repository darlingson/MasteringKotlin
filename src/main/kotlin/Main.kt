fun main(args: Array<String>) {
    println("Hello Kotlin World! from the code Shinobi")
    println(stringFunction())
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}
fun stringFunction():String{
    val word:String  = "Hello"
    return word
}