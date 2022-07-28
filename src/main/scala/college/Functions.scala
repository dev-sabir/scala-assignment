package college

import scala.annotation.tailrec

class Random {
  //This private method is only accessible only this class
  private def Hello(): String = {
    "Welcome to Scala"
  }

  def fun(): Unit ={
    val x = Hello()
    println(x)
  }

}

object Functions {

  //Local Function
  //In Scala, we can define functions inside a function and functions defined inside other functions are called local or nested functions.
  //When we use an Object Oriented approach, it is quite common to create private methods.
  // They are a kind of helper methods, and we make them private because we do not want them to expose to the external world.

  //Scala offers the same notion using the local functions. You can define functions inside other functions.
  // That's what we call as a Local Function. The local functions are visible only in their enclosing block.
  // The notion of a local function and the function literals works hand in hand in functional programming.

  //Function to find factorial using local function and tail rec
  def factorial(num: Int): Int ={
    @tailrec  // Scala automatically removes the recursion in case it finds the recursive call in tail position. The annotation ( @tailrec ) can be added to recursive functions to ensure that tail call optimization is performed.
    def helper(num: Int, acc: Int): Int = {
        if(num ==1 ){
          acc
        }else{
          helper(num-1, acc*num)
        }
      }
    helper(num, 1)
  }

  //Function to find sum of values of list
  def sumOfList(list: List[Int]): Int ={
    @tailrec
    def helper(list:List[Int], acc: Int): Int ={
      if(list.isEmpty){
        acc
      }else{
        helper(list.tail, acc+list.head)
      }
    }
    helper(list, 0)
  }

  //Function to find max value from a list using Local Function and @tailrec
  def maxOfList(list:List[Int]): Int = {
    @tailrec
    def maxOfList(list:List[Int], max:Int): Int ={
      if(list.isEmpty){
        max
      }else{
        if(max > list.head){
          maxOfList(list.tail, max )
        }else{
          maxOfList(list.tail, list.head)
        }

      }
    }
    maxOfList(list, list.head)
  }

  // Main Function
  def main(args: Array[String]): Unit ={
    val f = new Random
    f.fun()
    fun()

    //Finding Factorial of a num using Local Function and tail recursion
    println(factorial(6))

    //Finding Sum of all values of List using Local Function and trail recursion
    println(sumOfList(List(1,2,3,4,10)))

    //Finding Maximum from a list using local function
    println(maxOfList(List(20,15,23,11,19, 9)))


    //PARTIALLY APPLIED FUNCTION

    // The Partially applied functions are the functions which are not applied on all the arguments
    // defined by the stated function i.e, while invoking a function, we can supply some of the arguments
    // and the left arguments are supplied when required.
    // we call a function we can pass less arguments in it and when we pass less arguments it does not throw an exception.
    // these arguments which are not passed to function we use hyphen( _ ) as placeholder.

    //Some important points:
    //    Partially applied functions are helpful in minimizing a function which accepts many arguments to a function that accepts only some arguments.
    //    It can replace any number of arguments defined by a function.
    //    It is easier for users to utilize this method.

    val multiply = (num1: Int, num2: Int, num3: Int) => num1*num2*num3
    val partialFunction = multiply(2,3, _:Int) //It doesn't throw an exception
    println(partialFunction(4)) // 24 //Only when the function get all its value, only then it will return the value

    //A partially applied function can be obtained even when not applied on any of the arguments defined.
//    val Mul = (n1: Int, n2: Int): Int => n1*n2
    val Mul = (n1: Int, n2: Int) => n1*n2

    //Not Giving any value
    val pFun = Mul
    println(pFun(10,10))

    // CURRYING FUNCTION
    // In the Partial Function when we don't provide all the arguments then we have to pass _:DataType i.e.
    //multiply(2,3, _:Int)
    // With the help of Currying Function we can get rid of ' _:DataType'
    def concatString(str1: String)(str2: String) = str1+str2

    val res = concatString("David.") _
    val afterConcat = res("J Malan")
    println(afterConcat)


  }

  def fun(): Unit ={
    def Hello(): String ={
      "Welcome to scala"
    }
    val x  = Hello()
    println(x)
  }

}
