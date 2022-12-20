package `in`.mudits02.oop

fun main()
{
    var owner_name = Car("Belwal")
    //owner_name.Car()
}

class Car(name : String)
{
    lateinit var owner : String
    init {
        this.owner = name
        println("The car's owner name is $owner")
    }
    //println("The car's owner name is $owner")
}