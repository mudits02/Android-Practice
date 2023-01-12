package `in`.mudits02.oop

fun main()
{

}
// in Kotlin , all classes are non - inheritable by default
// so we use 'open' keyword to make it inherit

open class Car_new(val name : String , val car_brand : String)
{

}

class electric_car(name  : String, car_brand : String , battery_life : Double)
    : Car_new(name , car_brand)
{

}