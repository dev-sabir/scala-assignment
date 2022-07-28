package college

object Fold {
    def main(args: Array[String]): Unit = {

      //FOLD LEFT
      //foldLeft: Reduces the list from left to right given a starting value and a reduction function.
      //sum of List using foldLeft
      val sum = List(10,20,30).foldLeft(0){(acc,elem) => acc+elem}
      println(sum)

      // Finding maximum from a list using foldLeft
      val list = List(20, 11, 30, 4,49,27)
      val maxVal = list.foldLeft(list.head){(max, elem) => {
        if(max > elem) max else elem
      }}
      println(maxVal) //49

      //Reversing order of List using foldLeft
      val reverseList = list.foldLeft(List[Int]()){(acc, elem) => {
        elem +: acc //Prepending elem to List:acc, Note that for prepending, the element we want to prepend will be on left +: listName and vice versa for appending
      }}
      println(reverseList) // List(27, 49, 4, 30, 11, 20)

      //Removing duplicate element from the list
      val l = List(20, 30, 13, 40, 13, 40, 23)
      val unique = l.foldLeft(List[Int]()){(acc, elem) => {
        if(!acc.contains(elem)) acc :+ elem else acc
      }}
      println(unique) // List(20, 30, 13, 40, 23)

      //FOLD RIGHT
      //foldRight: Reduces the list from right to left given a starting value and a reduction function.
      val l1 = List(20,13, 19, 22, 10, 9, 25)
      val isIncluded = l1.foldRight(false){(elem, acc) => {
        if(acc){
          acc
        }else{
          elem == 21
        }
      }}
      println(isIncluded)

      //FOLD
      //fold: Reduces the list given a starting value and a reduction function.reduction function.
      val prices = List(20.5, 29.5, 30.6)
      val totalPrice = prices.fold(0.0) {(acc, elem) => acc+elem}
      println(totalPrice)

      // The Only things that make different fold and foldLeft is that in case of fold the data type of initial value
      // we are providing in fold(here: 0.0) should be similar to the data types to values of list
      // otherwise it throw type mismatch exception

    }
}
