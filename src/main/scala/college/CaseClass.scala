package college

//Case class without a parameter is not allowed if there is no parameter then just put empty i.e CaseClass()
 case class CaseClass(season: String) {
// even in absence of val or var, case class’s constructor parameters will turn out to be class members
  // we can directly access the season variable
//we can't call auxiliary constructor in case class
//  def this(season: String, temp: String){
//    this(season)
//  }

  def fruits(name: String, color: String): String = {
    s"${name} is ${color}."
  }

}

object Case {

  def main(args: Array[String]): Unit ={

    //No need of 'new' keyword to make an instance of the class if we're using case class
    val wSeason =  CaseClass("Rainy")

    //Can directly access the arguments
    println(wSeason.season)

    //We can't reassign the parameters
    //val  hello.season = "abc"

    //Scala compiler also appends a copy() method to case class that is utilized to create a duplicate of the same object with changing some parameters or without altering them.

    //Creating a duplicate of same instance without changing the parameter
    val wSeason2 = wSeason.copy()
    println(wSeason2.season) // Rainy

    //Creating a duplicate instance and changing the parameter
    val wSeason3 = wSeason.copy(season="Winter")
    println(wSeason3.season)  //Winter


    //How to call auxiliary constructor ???
    //Calling the auxiliary constructor
    //val weather =  CaseClass("Summer", "37c")

    println(wSeason.fruits("Mango", "Green"))
    println(wSeason.fruits("Apple", "Pink"))
  }

}
