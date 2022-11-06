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

    println("Concept of Nullability")

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





}