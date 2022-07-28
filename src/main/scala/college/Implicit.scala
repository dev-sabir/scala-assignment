package college


case class Rectangle(width: Double, height: Double){

  def area(): Double ={
    width * height
  }

}

//implicit class RectangleMaker(width: Int){
//  def x(height: Int) = Rectangle(width, height)
//}

object LearnImplicit {

    // Implicit parameters are the parameters that are passed to a function with implicit keyword in Scala,
    // which means the values will be taken from the context in which they are called.
    // In simpler terms, if no value or parameter is passed to a method or function,
    // then the compiler will look for implicit value and pass it further as the parameter.
    // For example, changing an integer variable to a string variable can be done by a Scala compiler rather than calling it explicitly.
    // When implicit keyword used in the parameter scope of the function, all the parameters are marked as implicit.
    //Note: A method can only contain one implicit keyword.

    //SYNTAX
    //    def func1(implicit x : Int) // x is implicit
    //    def func2(implicit x : Int, y : Int) // x and y both are implicit
    //    def func3 (x : Int)(implicit y : Int) // only y is implicit
    // implicit class must be defined inside of another trait/class/object
    implicit class RectangleMaker(width: Double){
      def x(height: Double) = Rectangle(width, height)
    }

    implicit class intCube(num:Int){
      def cube = num*num*num
    }



  def main(args: Array[String]): Unit = {

      // IMPLICIT PARAMETER
      val value=10
      implicit val multiplier = 3
      def multiply(implicit by: Int) = value * by
      // With Implicit parameter
      val res = multiply
      println(res) //30
      // if we want we can also give the value
      //Without Implicit parameter
      val res1 = multiply(10)
      println(res1) //100

      //  IMPLICIT CONVERSIONS

//      val k: Int = 3.2   Here it throw exception
      implicit def doubleToInt(x: Double) = x.toInt

      val k:Int = 3.6  //But here it doesn't
      println(k)

    // IMPLICIT CLASS

      val myRectangle = 3.2 x 4.0
      println(myRectangle) //Rectangle(3,4)
      println(myRectangle.area)
      println(3.cube)


  }
}
