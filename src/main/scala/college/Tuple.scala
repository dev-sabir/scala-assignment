package college

//class Problem(val st: String) {
//  import scala.util.control.Breaks._
//  var s = st
//
//  def sol(): (Char,Int) ={
//    var res: (Char, Int) = (' ', -1)
//      println(s)
//    var flag= false // Using flag because I'm not able to break
//    for( i<- 0 until s.length if flag == false){
//      val ch = s(i)
//      for(j <- i+1 until s.length if (s(j) == ch)){
//        if(s(j) == ch){
//          res = (ch ,i)
//          flag = true
//        }
//      }
//    }
//    res
//  }
//}

object LearnTuple {

  def main(args: Array[String]): Unit ={
    //Tuple is a collection of elements.
    // Tuples are heterogeneous data structures, i.e., is they can store elements of different data types.
    // A tuple is immutable, unlike an array in scala which is mutable.
    //We can store only 22 data in a single tuple

    val data =("Bob", 22, true)
    println(data._1) //Bob
    println(data._2) //22
    println(data._3) //true

    //we can also deconstruct it
    val (name, age, isMarried) = ("David",55, true)
    println(s"Data: $name, $age, $isMarried")

    //Above we say that Tuples are heterogeneous data structure

    val l1 = List("Apple", 30, 2.0) //See, we can say that list is also heterogeneous??

    //No the difference is Tuples "remember" the 'Data types' of heterogeneous data while list is not, in the above example
    //l1 the data types for "Apple" , 30 , 2.0 is Any  while in case of tuple the data type of name, age and isMarried is know by compiler


    //Tuples are very useful when we have to return a different type of data from a single function and method

    //WRITE A FUNCTION WHICH TAKE A STRING AS AN ARGUMENT AND RETURN THE FIRST REPEATING CHARACTER AND ITS INDEX??

    val res = new StringProblem
    println(res.FirstRepeatingChar("abcdbx"))

  }

}

class StringProblem{
  import scala.util.control.Breaks._
//  var s = st

  def FirstRepeatingChar(st: String): (Char,Int) ={
    var s = st
    var res: (Char, Int) = (' ', -1)
    println(s)
    var flag= true // Using flag because I'm not able to break the loop without flag
    //Difference btw until and to is, to is inclusive while until is not, to the last end value(here s.length)
    for( i<- 0 until s.length if flag == true){
      val ch = s(i)
      for(j <- i+1 until s.length if (s(j) == ch)){
        if(s(j) == ch){
          res = (ch ,i)
          flag = false
        }
      }
    }
    res
  }
}

