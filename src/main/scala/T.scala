
import college.Faculty
import college.Singleton
object  T {

  def main(args: Array[String]): Unit ={
    val fac = new Faculty
    fac.facultymethod()

    val sing = Singleton
    println(sing.msg)
  }
}
