package college

object Loops {

    def main(args: Array[String]): Unit ={
      for(i <- 0 to 7){  //include 7
        println(s"Day $i")
      }

      for(i<-0 until 3) println(i) // exclude 3

      // for-loop that iterates over the sequence
      val days = Vector("Mon", "Tue", "Wed", "Thus", "Fri", "Sat")
      for(day <- days) println(day)

      //for-loop that iterates over map
      val cars = Map[String, String]("Kia" -> "Sonet", "Hyundai"-> "Verna", "Mahindra"-> "XUV-700")
      for(car <- cars){
        println(car)
      }
      //Accessing Key and Value
      for(car <- cars){
        println(s"Car Name: ${car._1}, Car Model: ${car._2}")
      }

      //Or better way to do is
      for((carName, carModel) <- cars){
        println(s"Car Name: $carName, Car Model: $carModel")
      }

      //for-loop with conditions
      //Like a pattern guard in a match expression, an iterator guard (also known as a filter) adds an if expression to an iterator.
      // When an iterator guard is used, an iteration will be skipped unless the if expression returns true.
      // for-loop allows you to filter some elements from the given collection using one or more if statements in for-loop.
      var listOfThrees = scala.collection.mutable.Set[Int]()

      // For loop with a condition or we can say filter
      for(i <- 0 to 30 if i%3 == 0){
        listOfThrees += i
      }
      println(listOfThrees) //Note: Here we are using the mutable set so the order is not fixed when we add elements to listOfThrees


      //for-loop with yield
      //The main advantage of using yield is, it automatically add elements to the vector
      val threes = for(i <- 0 to 30 if i%3==0) yield i  //Vector(0, 3, 6, 9, 12, 15, 18, 21, 24, 27, 30)


      println(threes)

    }

}
