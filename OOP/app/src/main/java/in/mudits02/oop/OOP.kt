package `in`.mudits02.oop

fun main()
{
    var name = Person("Mudit" , "Shukla")
    var name2 = Person()
    name.hobby = "Play with girls"
    name2.hobby = "Do nothing"
    name.stateHobby()
    name2.stateHobby()
    //var name3 = Person(lastName = "Guest")
}
class Person (firstName : String = "New" , lastName : String = "Player")
{
    var age : Int? = null
    var name_first : String = firstName
    var hobby : String = "Wander around"
    init {
        println("Class created")
        //println("Used init to initialize the object")
        println("The created class are" + "firstName = $firstName and lastName = $lastName")
    }

    fun stateHobby()
    {
        println("$name_first's hobby is $hobby")
    }
}

