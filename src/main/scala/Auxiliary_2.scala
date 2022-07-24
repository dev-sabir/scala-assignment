class Auxiliary_2{

    val roll_no: Int = 0
    val s_name: String = ""
    val id: Int= 0
    val major: String = ""
  def details(): Unit ={
//    println("Hii")
    println(roll_no)
    println(s_name)
    println(id)
    println(major)
  }
  def this(roll_no: Int){
    //calls the primary constructor
    this()
    //this.roll_no = roll_no
  }

  def this(roll_no: Int, s_name: String){
    this(roll_no)
  }

  def this(roll_no: Int, s_name: String, id: Int){
    this(roll_no, s_name)
  }

  def this(roll_no: Int, s_name: String, id: Int, major: String){
    this(roll_no, s_name, id)
  }

}

object Aux_Learn{

  def main(args: Array[String]): Unit ={
    var data = new Auxiliary_2(100)
    println("First Auxiliary Call")
    data.details()

    data = new Auxiliary_2(100, "Sabir")
    println("Second Auxiliary Call")
    data.details()

    data = new Auxiliary_2(13, "Bob", 5)
    println("Third Auxiliary Call")
    data.details()

    data = new Auxiliary_2(35,"Rob", 13, "CSE")
    println("Fourth Auxiliary Call")
    data.details()

  }
}
