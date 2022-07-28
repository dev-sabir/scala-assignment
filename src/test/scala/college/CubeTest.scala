package college

import org.scalatest.matchers.should
import org.scalatest.wordspec.AnyWordSpec


class CubeTest extends AnyWordSpec with should.Matchers {

  val cubeOfNumber = new Arithmatic()

  "Arithmatic " should {

    "Cube of a number" in {
      val result = cubeOfNumber.cube(5)
      result shouldBe 125
    }
  }

}
