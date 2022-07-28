package college

class Student {
  def studentmethod(): Unit = {
    println("Student Method")
  }
}

//We can easily able to extends  Vehicle from oops File
class MyCar extends Vehicle{
  println(brand)
}
// We can extend welcome because it is a sealed class
//class Greeting extends Welcome{
//
//}



  object SMain {
    def main(args: Array[String]): Unit = {
      val stu = new Student() //Calling Student Method stu.studentmethod() // Is there any difference between Student and Student()
      val fac = new Faculty()

      println(hii)

      //Accessing course method from package object without import
      println(course("OS", 2022))

      fac.facultymethod()

      val c = new MyCar
    }

  }




