class Auxiliary_1(roll_no: Int, id:Int) {

    def this(roll_no:Int, id: Int, name:String){

      //Here after calling the auxiliary constructor we are calling the our main constructor
      this(roll_no, id)
    }

    def details(): Unit ={
      println("Roll No. is: "+ roll_no)
      println("Id is: "+ id)
    }
}

object Main{

  def main(args: Array[String]): Unit ={

    //Here we are calling the auxiliary constructor Line No. 3
    var data = new Auxiliary_1(12, 2, "Abc")
    data.details()
  }

}
