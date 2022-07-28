package college

object FunctionLiterals {
  def main(args: Array[String]): Unit ={
    // A function literal is an alternate syntax for defining a function.
    // It's useful for when you want to pass a function as an argument to a method
    // (especially a higher-order one like a fold or a filter operation) but you don't want to define a separate function.
    // Function literals are anonymous -- they don't have a name by default,
    // but you can give them a name by binding them to a variable. A function literal is defined like so:
    //(a: Int, b: Int) => a+b
    //we can bind them to a variable

    //Function Literals also known as Anonymous Function(A function which does not contain a name is known as an anonymous function)
    //An anonymous function provides a lightweight function definition. It is useful when we want to create an inline function.
    val add = (a: Int, b: Int) => a+b
    println(add(2,3))
  }
}
