fun main(){


    val threeNumbers ={a:Double,b:Double,C:Char->
        when (C){
            '*'->a*b
            '+'->a+b
            '-'->a-b
            '/'->a/b
            else-> println("Invalid operator")
        }

    }
    println("Enter first number:")
    val firstNumber = readln().toDouble()
    println("Enter second number:")
    val secondNumber = readln().toDouble()
    println("Enter operatorNum (* or + or - or /):")
    val operatorNum = readln().first()
    val answer = threeNumbers(firstNumber,secondNumber,operatorNum)
    println(answer)

}