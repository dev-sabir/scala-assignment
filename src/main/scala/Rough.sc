val x = List(1,2,3)
val y = List(2,3,4)
x ++ y

val x = Array(1,2,3,4)
x.drop(2) ++ x.take(2)
val a:Option[Int] = Some(1)
val b: Option[Int] = Some(2)
val c:Option[Int] = Some(a.get + b.get)
List.fill(3)(2)
List.fill(-1)(2)
val res = "Hello World Hello".split(" ")
//res.foldLeft(Map()[String, Int]){(acc,elem) => {
//  acc[elem] = 1
val m = collection.mutable.Map("H"-> 2, "I" -> 1)
m.contains("H")
val mutableMap = scala.collection.mutable.Map("Bob" -> 29, "Sam" -> 33, "David"-> 45)
println(mutableMap("Bob")) //29

//Bob turn 30 today
mutableMap("Bob") = 30
println(mutableMap("Bob")) // 30

//l.foldLeft(Map()[String, Int]){(acc, elem) => {
//        if(acc.contains(elem)){
//          acc[elem] = acc[elem] + 1
//        }else{
//          acc[elem] = 1
//////        }
//var m = scala.collection.mutable.Map()[String,Int]
//res.foldLeft(m){(acc, elem) => {
//  if(acc.contains(elem)){
//    acc(elem) = acc(elem) +1
//    acc
//  }else{
//    acc(elem) = 1
//    acc
//  }
//}}
val res= Array("hii", "Hello", "Wel")
//for(elem <- res){
//  println(elem)
//}

val l = List("abc","abc","cbe","cab")
//val a = l.groupBy(identity).Map((a) => Map(a) => b.)
val list = List("Anish is working on BigData Technologies","Hello Anish","BigData")
val words = list.flatMap(line => line.split(" "))
val keyData = words.map(word => (word,1))
val groupedData = keyData.groupBy(_._1)

val result = groupedData.mapValues(list=>{
  list.map(_._2).sum
})
result.foreach(println)

3%2

var map1: Map[String,Int]= Map("hello" -> 1 , "hi" -> 2)
val map2: Map[String, Int] = Map("hi" -> 2, "you" -> 1)
map2.foldLeft(map1){(acc,elem) => {
  if(!acc.contains(elem._1)){
    acc + elem
  }else{
    acc + (elem._1 -> (elem._2 + acc(elem._1)))
  }
}}

val li: List[(String,Int)] = Nil
//x + ("Hii",2)
li :+ ("Hii", 3)

val xx: List[Int] = List()
val  l2 = List(1,2,3)
l2 :+ 4


val newL = List(1,2,3,4)
4 :: newL
5 +: newL

new java.io.File("/Users/mohdsabir/STUDY/CERTIFICATES").listFiles().size
//File file = new File("")

val str = "hello how are you hello".split(" ")
val a = str.groupBy(identity => identity)
val z = a.map(a => a._1 -> a._2.length)
//val zz =a.map(a => Map(a._1 -> a._2.length))
val x = Array(1,2,3,4)
x.drop(2) ++ x.take(2)
val y = Array(1,2,3,4)
y.drop(4) ++ y.take(4)