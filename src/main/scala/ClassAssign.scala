object Classes {

  //Class without any default parameter
  class Student1(roll_no: Int, name: String) {
    println(name + " roll no. is " + roll_no)
  }

  //Class with default parameters
  class Student2(roll_no: Int, name: String, year: Int=2018){
      println("Roll No. is: "+ roll_no)
      println("Name is: "+ name)
      println("Year is: "+ year)

      def details(major: String, roll_no:Int=roll_no, Name: String= name, Year:Int= year ): Unit ={
        println("Major is: "+major + " roll_no: "+ roll_no+ " name is: "+name+ " year is: "+year)
       //How to return from here??
      }


  }

  //Our main start from here
  def main(args: Array[String]): Unit ={

    new Student1(121, "Ashish")

    var s_data = new Student2(135, "Sabir")
    s_data.details("CSE")

  }


}
