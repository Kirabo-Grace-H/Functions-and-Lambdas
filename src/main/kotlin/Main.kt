fun main() {
    println("Enter first number:")
    val firstNumber = readln().toDouble()
    println("Enter second number:")
    val secondNumber = readln().toDouble()
    println("Enter operatorNum (* or + or - or /):")
    val operatorNum = readln().first()
    threeNumbers(firstNumber,secondNumber,operatorNum)

}
fun threeNumbers(a:Double,b:Double,c:Char){
    if (c=='*'){
        println(a*b)
    }else if (c=='+'){
        println(a+b)
    }else if (c=='-'){
        println(a-b)
    }else if (c=='/'){
        println(a/b)
    }else{
        println("invalid operator")
    }

}