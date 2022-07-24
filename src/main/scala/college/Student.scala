package college

class Student {
  def studentmethod(): Unit = {
    println("Student Method")
  }
}

  object SMain {
    def main(args: Array[String]): Unit = {
      val stu = new Student() //Calling Student Method stu.studentmethod() // Is there any difference between Student and Student()
      val fac = new Faculty()

      println(hii)

      println(course("OS", 2022))

      fac.facultymethod()
    }

  }




