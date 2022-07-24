package college

//A Singleton object is an object which defines a single object of a class.
// A singleton object provides an entry point to your program execution.
// If you do not create a singleton object in your program, then your code compile successfully but does not give output.
// So you required a singleton object to get the output of your program.
// A singleton object is created by using object keyword.

object Singleton {
  //IMPORTANT POINTS ABOUT SINGLETON OBJECT
      //The method in the singleton object is globally accessible.
      //You are not allowed to create an instance of singleton object.
      //You are not allowed to pass parameter in the primary constructor of singleton object.
      //In Scala, a singleton object can extend class and traits.
      //In Scala, a main method is always present in singleton object.
      //The method in the singleton object is accessed with the name of the object(just like calling static method in Java), so there is no need to create an object to access this method.
  val msg = "Hello World!!"

  def model(): String ={
    "Model C50-A"
  }
}

object Sing{
  def main(args: Array[String]): Unit= {

    //We can access the S
    println(Singleton.msg)
    println(Singleton.model())
  }

}
