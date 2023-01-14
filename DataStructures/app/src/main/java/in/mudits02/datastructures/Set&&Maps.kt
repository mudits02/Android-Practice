package `in`.mudits02.datastructures

fun main()
{
    /*
    List is an immutable data structure that does not count duplicate values
    that property is shown in the following syntax
     */
    val fruit = setOf("Apple" , "Orange" , "Loda" , "Apple")
    //println(fruit.size)
    //println(fruit.toSortedSet())


    val newFruit = fruit.toMutableList()
    newFruit.add("Pear")
    newFruit.add("Water Melon")
    println(newFruit)
    println(newFruit.elementAt(index = 2))


    //HashMaps
    //Same as Ordered Map in C++
    val weekdays = mapOf(1 to "Mon" , 2 to "Tue" , 3 to "Wed" , 4 to "Thur")
    for (key in weekdays.keys)
    {
        println("$key is for the day of ${weekdays[key]}")
    }

    //Mutable maps
    val newWeekday = weekdays.toMutableMap()
    newWeekday[5] = "Fri"
    newWeekday[6] = "Sat"
    newWeekday[7] = "Sun"

    for(key in newWeekday.keys)
    {
        println("$key is the number of the day of ${newWeekday[key]}")

    }



}
