
// Kotlin break and continue

fun main(args : Array<String>){
    //1. BREAK
    for(i in 1..5)
    {
        if(i==3)
        {
            break
        }
        println(i)
    }

    //2. Continue
     var j : Int = 1
    for (i in 1..3) {
        println("i = $i")
        
        if (j == 2) {
            continue
        }
        println("this is below if")
    }
}