import scala.+:

1+2

val m = Map("k1"-> "v1", "k2"-> "v2", "k3"->"v3")
m.filter(kv => kv._1 == "k1")

val x = List(1,2,3,4)

val y = Seq(1,2,3,4)
val x = Array('a', 'e', 'i', 'o', 'u')
y
y :+ 5

val l = List(1,2,3)

def fmax(list: List[Int], max: Int): Int ={
 list match{
  case Nil => max

  case head::tail =>
     if(head >max) fmax(tail, head) else fmax(tail, max)

 }
}

fmax(List(12,11,5,6,17,8), 0)