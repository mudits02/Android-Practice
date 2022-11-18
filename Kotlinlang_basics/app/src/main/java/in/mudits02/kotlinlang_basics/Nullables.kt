package `in`.mudits02.kotlinlang_basics

fun main()
{
    // Concept of Null
    var name: String = "Mudit"
    // if name = null -> Compilation error
    var check: String? = null

    var len = name.length
    var len_check = check?.length
    println(len)
    println(len_check)

    check?.let {println(it.length)}
    //The above line makes he nullable be printed in the new format
    //'?' is basically the safe call operator which checks if the value is Null or not
    /*
    Basically Line 11 means

            if(check != null)
            {
                println(len_check)
            }
            else
            {
                null
            }

     */
    //Elvis Operator -> null containing variable name ?: Statement to be printed
    /*
        Elvis Operator does the folllowing
        if(variable == null)
        {
            print the statement after ?:
        }
        else do the default thing
     */
    var mudit : String?
    mudit = null
    val name_guest = mudit ?: "Guest"
    println("Name is $name_guest")





}