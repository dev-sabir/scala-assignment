package college

class Factorial(n: Int) {
  require(n >=0, "Factorial of -ve values are not possible")
  var result: Int=1;
  if(n > 0){
    for(i <- 1 to n){
      result = result *i
    }

  }
  println(result)

}

object Fac{

  def main(args: Array[String]): Unit ={
    new Factorial(6)
  }

}
