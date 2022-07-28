package college

//Base Class or Super Class or Parent Class
class Vehicle {
    val brand: String = "Ford"
    def honk(): Unit ={
      println("Tuut, tuut!! ")
    }
}

//Derived Class
class Car extends Vehicle{
  val model: String = "Mustang"

}

//FINAL
// In Scala, Final is a keyword and used to impose restriction on super class or parent class through various ways.
// We can use final keyword along with variables, methods and classes.

//Final Variable and Final Method

class Shapes{
  // defining final variable
  final val area:Int = 60
  final def calArea(): Unit ={
    println("Calculated Area")
  }
}

class Rect extends Shapes {

  //override area:Int = 100   if we do this then it will throw exception because area cannot override because it is final member
  //  override def calArea(){
  //    println("New calculated area")
  //  }

  //Similarly we can't override final method
  def display(): Unit ={
    println(area)
  }
}


//  FINAL CLASS
//  If the class in Scala is final then it cannot inherit to derived class. Inheritance restriction will be added by final keyword.
//  Here if class Shapes are final then its all members also final and cannot used in derived class.

final class Shape{
  val height: Int = 0
  val width: Int = 0

  def calArea(){}

}

//We can't inherit Shape class because Shape is a final class
//class Rectang extends Shape{
//
//}

//  SEALED CLASS
//  The sealed is a Scala keyword used to control the places where given trait or class can be extended. More concretely,
//  the subclasses and the implementations can be defined only in the same source file as the sealed trait or class.
//  Trying to extends in Student File

sealed class Welcome{
  def greet(): String={
    "Welcome to Scala"
  }
}

//But if we want to extends sealed class here we can but if we want to extend Welcome class in other file we can't
class Greet extends Welcome{
  greet()
}


//ENUMERATION
//  An enumeration refers to a group of named constants. Scala provides an abstract class called Enumeration to create and retrieve enumerations.

object Days extends Enumeration{
  val Monday = Value(1)
  val Tuesday = Value(2)
  val Wednesday = Value(3)
  val Thursday = Value(4)
  val Friday = Value(5)
  val Saturday = Value(6)
  val Sunday = Value(7)

}




object Oops{

  def main(args: Array[String]): Unit ={

    val myCar = new Car
    println(myCar.model)
    myCar.honk()  //Accessing from inherited method

    val rec = new Rect
    println(rec.area)
    rec.calArea()

    val msg = new Welcome
    println(msg.greet())

    new Greet  // Welcome to Scala

    println(Days.values)
    println(Days(1))
    println(Days(4))

  }
}


