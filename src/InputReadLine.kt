fun startSuperNiceQuestions(){
    print("Enter name:")
    var name:String = readLine()!!
    print("Enter age:")
    var age:Int = readLine()!!.toInt()
    var motivationalPhrase:String = elaborateMotivationalPhraseFromAging(age)

    print("first run for $name and: $motivationalPhrase")
}

fun elaborateMotivationalPhraseFromAging(age:Int): String{
    return when (age){
        in 1..12 -> {
            "Go sleep"
        }
        in 13..20 -> {
            "Go have sex!"
        }
        in 21..100 -> {
            "Go have sex and destroy capitalism"
        }
        else -> {
            "Go kid someone else"
        }
    }
}
