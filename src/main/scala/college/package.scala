//Only one package object is allowed for each package.
// sometimes we want to some variable, definitions, classes or objects to be accessible to entire package.
// But its not possible to keep definitions, data variables and type aliases directly in a package.
// To do so we have package object, so that the common data can be at the top level of the package.
// Package objects were introduced in scala version 2.8.

package object college {

  val hii = "You're in Scala World!!"

  //Accessing this in Student Class
  def course(cName:String, cYear: Int): String= {
    s"Course name is: ${cName} \nYear of Enrollment is: ${cYear}"
  }

}
