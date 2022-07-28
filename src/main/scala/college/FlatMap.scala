package college

object FlatMap {

  def main(args: Array[String]): Unit ={

    val list = List(2,3,4)
    def f(n: Int)= List(n-1, n, n+1)

    val res = list.map( a=> f(a))
    println(res) // List(List(1, 2, 3), List(2, 3, 4), List(3, 4, 5))

    val res2 = list.flatMap((a => f(a)))
    println(res2) // List(1, 2, 3, 2, 3, 4, 3, 4, 5)

  }

}
