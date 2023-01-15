package `in`.mudits02.datastructures


/*
    A lambda function is function with no name

    they are function literals i.e. functions that are not declared but passed as
    an expression

    Open keyword -> in Kotlin we need to manually make the class inheritable by using keyword called open
 */

    //Next will be the app , the age in minutes app

fun main()
{
    // addition of two numbers using lambda function
    val sum : (Int , Int) -> Int = {a : Int , b : Int -> a + b}
    println(sum(10 , 5))
    // even shorter

    val shorter_sum = {a : Int , b : Int -> println(a + b)}
    println(shorter_sum(10 , 10))

}

/*
    4 types of visibilty modifiers
    1. Public
    2. Private
    3. Protected
    4. Internal
    Now internal is something new which makes the use of all the variables and functions inside the internal class onyl
 */