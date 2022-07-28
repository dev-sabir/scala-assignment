package college

object LearnList {

  def main(args: Array[String]) ={

    //We can declare list by two way
    //List of specific data type
    val l1: List[String] = List("Apple", "Banana", "Orange")

    //List of any Type
    val l2 = List("Apple", 32, 'C')
    println(l2)

    //Creating Empty List
    val eList: List[Nothing] = List()
    println(eList.isEmpty)

    val l3 = List(10,20, 30,40, 50)
    //List also support indexing
    println(l3(1)) // 20

    //First Element
    println(l3.head) //10

    //List without the First Element
    println(l3.tail) // List(20, 30, 40, 50)

    println(l3.tail.head) // 20
    println(l3.tail.tail) // List(30, 40, 50)


    // Creating a uniform list
    //Creating a list of length 3 with initial value 0
    val l4 = List.fill(3)(0)
    println(l4)

    //we can reverse the list also
    val l5 = List(1,2,3)
    println(l5.reverse) //List(3,2,1)

    //Take and Drop

    val l6 = List(10,20,30,40,50,60,70,80)
    println(l6.take(3))  // Take the first three element List(10,20,30)
    println(l6.drop(2))  //Drop the First two element List(30,40,50,60,70,80)

    //Adding two list

    val l7 = List(1,2,3)
    val l8 = List(7,8,9)
    println(l7 ++ l8)  //Return a new list List(1,2,3,7,8,9)

    //Mapping in List

    val l9 = List(1,2,3)
    val square = l9.map(a => a*a) // We can also put space instead of dot i.e l9 map(a => a*a*a)
    println(square) //return new List(1,4,9)
    val double = l9.map(_*2)  //We can also write like this 'l9.map(a=> a*2)', which should we follow??
    println(double) // Return a new list List(2, 4, 6)




  }


}
