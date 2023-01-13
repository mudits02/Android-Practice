package `in`.mudits02.datastructures

fun main()
{
    //Array
    //val numbers = arrayOf(1 , 2 , 3 , 4 , 5 , 6)
    //numbers[0] = 0
    //List
    val months = listOf("January" , "Feb" , "March")
    val any_dataType = listOf(1 , 2 , true , false , "Chutiya" , "Amazon")

    println(any_dataType.size)
    val month = 0
    for(month in months)
    {
        println(month)
    }

    /* Lists are immutable
       So to convert them into mutable list ,
       we use the following syntax
     */

    val addMonths = months.toMutableList()
    val newMonths = arrayOf("Apr" , "May" , "June")
    addMonths.addAll(newMonths)
    addMonths.add("July")
    println(addMonths)

    val days = mutableListOf<String>("Mon" , "Tue" , "Wed")
    days.add("Thur")
    println(days)

    addMonths.removeAt(index = 3)
    println(addMonths)
    val removeList = mutableListOf<String>("Mon" , "Wed")
    days.removeAll(removeList)
    println(days)
}