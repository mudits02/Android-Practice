package `in`.mudits02.kotlinlang_basics

fun main()
{
    var myName = "Mudit"
    println("Hello " + myName)

    // var name : datatype = value <- this is the syntax for variable
    var number = 31
    var myNum : Int = 56
    var myFloat : Float = 31.46F
    var myDouble : Double = 3.14287658972
    val sentence = "Hello Mudit Shukla"

    var sentence_length = sentence.length
    var char_from_sentence = sentence [sentence_length - 1]


    // String Interpolation Concept
    println("The last letter of the string is $char_from_sentence and the length of it is ${sentence.length}")
    val a = 5.0
    val b = 3
    var result = (a/b).toInt()
    println(result)

    //print(number)
    //print(myNum)

    //when keyword is basically the switch statement in C++/Java

    var seasons = 3
    when(seasons)
    {
        1 -> println("spring")
        2 -> println("summer")
        3 ->
        {
            println("Fall")
            println("autumn")
        }

        4 -> println("Winter")
        else -> println("invalid season")
    }

    // Range when

    var month = 5

    when(month)
    {
        in 3..5 -> println("spring")
        in 6..8 -> println("summer") // we can also use 6,7,8 -> println("summer")
        in 9..11 -> println("autumn")
        in 12 downTo 2 -> println("winter")

        else -> println("invalid season")
    }

    var x : Any = 13.37
    when(x)
    {
        is Int -> println("$x is an Integer")
        is Double -> println("$x is a double")
        is String -> println("$x is a string")
        else -> println("None of the above")
    }

    var y = 0
    while(y <= 10)
    {
        println("$y")
        y += 2
    }

    var nums = 0
    for(nums in 0..10)
    {
        println("$nums")
    }

}