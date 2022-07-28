package college

object Sequence {

  def main(args: Array[String]): Unit = {

    val seq = Seq(1,2,3,1,1)
    println(seq)
    println(seq(0))

    //Predefined Methods in Sequence
    //    def apply(index: Int): A -> To select an element from the sequence
    //    def contains[A1 >: A](elem: A1): Boolean -> To check whether a sequence contains the given element
    //    def count(p: (A)=> Boolean): Int-> To count the number of elements that satisfies a predicate
    //    def length: Int -> gives the length of the Sequence
    //    def copyToArray(xs: Array[A], start: Int, len: Int): Unit -> For copying the elements of Sequence to array
    //    def endsWith[B](that: GenSeq[B]): Boolean-> to check whether a sequence terminates with a given sequence or not
    //    def head: A ->It selects the first element of the sequence.
    //    def indexOf(elem: A): Int-> To find the index of first occurrence of a value in the sequence
    //    def isEmpty: Boolean ->To test the emptiness of the sequence.
    //    def lastIndexOf(elem: A): Int-> To find the index of last occurrence of a value in the sequence
    //    def reverse: Seq[A]-> To return a new sequence with elements in reverse order.

    println(seq.count(a => a==1))
    println(seq.length)
  }

}
