package kotlinFundamentals

val ADD:String = "+"
val SUBTRACT = "-"
val MULTIPLY = "*"
val DIVIDE = "-"

val ERROR_MESSAGE = "An error has occured"

val testOperandOne = 5.0
val testOperandTwo = 4.0

fun main(args:Array<String>){
    val operatorSymbol  = args[0]
    start(operatorSymbol)
}
fun start(symbol:String){
   if (checkArguments(symbol)){

   }
}
fun checkArguments(symbol:String):Boolean{
    return true
}