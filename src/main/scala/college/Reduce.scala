package college

object Reduce {

  def main(args: Array[String]): Unit ={

    val list = List(2, 9, 13, 14, 10, 16,7)
    //Sum of the list
    val listSum = list.reduce{(acc, elem)=> { //Remember here acc will be the first value and elem will start from second value, returning value store in acc
//      println(elem)
      acc + elem}}
    println(listSum)

    //Finding maximum from the list


    val maxList = list.reduceLeft{(acc, elem) => {
      if(acc > elem) acc else elem
    }}
    println(maxList) //16

    val l = List(1,2,3,4,5,6,7)
    var newList: List[Int] = List()
    var seq = scala.collection.mutable.Seq[Int]()
    //seq += 1    //Why this is showing error
//    println(seq)
    val reverseList = l.reduceLeft{(acc, elem) => {
      //println(elem)
       seq :+
    } }
   // println("Hi")
//    println(reverseList)

  }
}
