package college

// When object name is the same as the class name than it is known Companion object

//NOTE-> A companion object is defined in the same source file in which the class is defined.
// A companion object is allowed to access both private methods and private fields of the class.

class Companion {

    private val wlcmmessage: String = "Welcome to Scala!!"

    private def method(): String ={
      "You can only access private members to companion Objects"
    }
}

object Companion{

  def main(args: Array[String]): Unit ={

    val msg = new Companion

    //Accessing the private fields
    println(msg.wlcmmessage)

    //Accessing private method
    println(msg.method())

    //This is also a functional object because it doesn't has any mutable state

    //Here we are accessing the from package object
    println(hii)
  }

}

