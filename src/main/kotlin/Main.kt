package org.example
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Hello World!")
    val name = "Kotlin"

    val numberOfOrders: Int = 42

    var notificationText: String = "Свободные рабочие, школьники и студенты, вступайте в ряды разработчиков!"

    println(numberOfOrders)
//           println(notificationText)

    notificationText = "Больше разработчикы не нужны! Теперь нужны сварщики"
    println(notificationText)


    //целочисленные
    val intNum1: Int = -2147483648 //32 bit
    val intNum2: Int = 2147483647
    val longNum: Long //64 bit
    val shortNum: Short //16 bit
    val byteNum: Byte //8 bit
    val unsignedNum: UInt = 214747648u //32 bit

    //вещественные
    val doubleNum: Double = 123.23 //64 bit
    val floatNum: Float = 2323.34f //32 bit

    //строковые
    val stringValue: String = "Это строка"
    val charValue: Char = 's'

    //логические
    val trueValue: Boolean = true
    val falseValue: Boolean = false
}