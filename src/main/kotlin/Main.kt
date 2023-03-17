fun main(){
    odd()

    println()
    println( find(arrayOf("Star", "Fine","dichotomous Key", "Derivative","Gallant","Akira", "Jeff","fi")))

    println()
    robot(32)
    robot(2)
    robot(10)

    println()
    numbers()

}


//1.Create a function that prints out all the odd numbers between 1 and 100 (2pts)

fun odd(){

    for (num in 1..100)
    if (num%2==1)
    println(num)
}


//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts)
fun find(arrayOfNames: Array<String>): Int {
    var sumLonger = 0

    for (i in arrayOfNames) {
        if (i.length > 5) {
            sumLonger++

        }

    }
    return sumLonger}

//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of cocacola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age. (2pts)
fun robot(ageCheck:Int) {
    when (ageCheck) {
        in 0..5 -> println("Glass Of Milk")
        in 7..14 -> println("Fanta Orange")
        else -> println("CocaCola")
    }
}
//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number.
fun numbers(){
    for (num in 1..100) {
        when {
            num % 5 == 0 && num % 3 == 0 -> println("FizzBuzz")
            num % 3 == 0 -> println("Fizz")
            num % 5 == 0 -> println("Buzz")
            else -> println(num)
        }
    }
    }




