  class ArithClass {

    def add(value1: Int, value2: Int): Int ={
      value1+value2
    }

    def subtract(value1: Int, value2: Int): Int ={
      value1-value2
    }

    def multiply(value1: Int, value2: Int ): Int ={
      value1*value2
    }

   def division(value1: Int, value2: Int): Int ={
      value1/value2
   }

   def modulus(value1: Int, value2: Int): Int ={
     value1%value2
   }

   def square(value: Int): Int={
     value*value
   }

   def cube(value: Int): Int={
     value*value*value
   }




}

object MainClass{

  def main(args: Array[String]): Unit ={
    var cls = new ArithClass

    //Adding Two Values
    println(cls.add(1,2))

    //Subtracting two Values
    println(cls.subtract(10,3))

    //Multiplying two no.
    println(cls.multiply(4, 3))

    //Division of two no.
    println(cls.division(17,9))

    //Modulus of Two no.
    println(cls.modulus(17,9))

    //Square of a No.
    println(cls.square(7))

    //Cube of a No.
    println(cls.cube(4))

  }
}

