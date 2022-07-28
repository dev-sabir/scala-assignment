package college

object Arrays {

    def main(args: Array[String]): Unit = {

      //Array of Characters
      val vowels = Array[Char]('a', 'e', 'i', 'o', 'u')
        //Different Types of Operation on Array
        println(vowels.length)  //5
        println(vowels(2))    // 'i'

      //Creating an array of Strings of Size 4

      val fruit = new Array[String](4)
      //Adding elements in the array
      fruit(0) = "Apple"
      fruit(1) = "Banana"
      fruit(2) = "Orange"
      fruit(3) = "Kiwi"

      println(fruit(1)) //Banana

      //Array is mutable
      fruit(0)= fruit(3)
      println(fruit(0)) //Kiwi

      //Reversing the array
      val rVowels= vowels.reverse
      println(rVowels(0))  //u


      val nums = Array[Int](10,20,30)
      nums.foreach(a => print(a*2 + " "))

      //How is this working??
      nums.foreach(print)


      println()

      //Problem Statement-> Given Two Matrix, if they satisfies the multiplication condition then print the multiplication of the matrix or tell matrix multiplication not possible

      val matrix1: Array[Array[Int]] = Array(Array(1,2,3), Array(4,5,6), Array(7,8,9))
      val matrix2: Array[Array[Int]] = Array(Array(1,2,3), Array(4,5,6), Array(7,8,9))

      matrixMultiplication(matrix1, matrix2)

    }

    def matrixMultiplication(mat1: Array[Array[Int]], mat2: Array[Array[Int]]): Unit= {

      val mat1Rows = mat1.length
      val mat1Cols = mat1(0).length
      val mat2Rows = mat2.length
      val mat2Cols = mat2(0).length

      //if(mat1Cols != mat2Rows) {
        //println("Matrix 1 columns doesn't equals to Matrix 2 Row")
      //} else {

      //Instead of if and else we can use require also
        require(mat1Cols == mat2Rows, "Size of Matrix 1 columns should be equals to Matrix 2 Row")

        for(i <- 0 until mat1Rows){
          for(j <- 0 until mat2Cols){
            var resultVal : Int = 0
            for(k <- 0 until mat1Cols) {
              resultVal += mat1(i)(k) * mat2(k)(j)
            }
            print(resultVal+ " ")
          }
          //For breaking a line
          println()

        //}

      }



    }

}


