package college

class Recursion {

  def NormalWay(num: Int): Int ={
    if(num ==1 ){
      1
    }else{
      num * NormalWay(num-1)
    }
  }
}

object LearRecursion{


  //Tail Recursion
  //Finding Factorial of a number using Tail Recursion
  def TailRecrsionFact(num: Int, acc:Int=1): Int ={

    if(num ==1) acc else TailRecrsionFact(num-1,acc*num)

  }

  //Finding the Sum of values of a List using Tail Recursion
  def TailRecrsionSum(list: List[Int], acc:Int=0): Int ={
    if(list.isEmpty){
      acc
    }else{
      TailRecrsionSum(list.tail, acc+list.head)
    }
  }

  //Finding Maximum value from a list Using Tail Recursion

  def TailRecursionMax(list: List[Int], acc: Int = -111111): Int ={
    if(list.isEmpty){
      acc
    }else{
      if(list.head < acc) {
        TailRecursionMax(list.tail, acc)
      }else{
        TailRecursionMax(list.tail, list.head)
      }
    }
  }



  def main(args: Array[String]): Unit = {


    val rec = new Recursion
    println(rec.NormalWay(5))

    //Problem with all these three(TailRecursionFact, TailRecursionSum, TailRecursionMax) is
    // what is we pass the wrong accumulator value i.e [ TailRecursionFact(5,0), TailsRecursionSum(List(1,2,3), 3),
    // same for TailRecursionMax(List(1,3,2), 5)
    // Solution for all three is Local Function using @tailrec
    println(TailRecrsionFact(6))
    println(TailRecrsionSum(List(1,2,3,4,5)))
    println(TailRecursionMax(List(10,20,15,43,11)))
  }


}

