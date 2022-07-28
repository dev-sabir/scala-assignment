package college

import org.scalatest.funsuite.AnyFunSuite

class UnitTest extends AnyFunSuite{

    //Test Case For Finding Fist Repeating Char and Its Index From a given String
    test("Finding Fist Repeating Char and Its Index From a given String"){
      val method = new StringProblem
      val res = method.FirstRepeatingChar("wxyzzx")
      assert(res === ('x', 1))
    }
}
