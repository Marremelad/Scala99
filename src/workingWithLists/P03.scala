package workingWithLists

import scala.annotation.tailrec
// Find the Kth element in a list.

//By convention, the first element in the list is element 0.
//
//Example:
//
//  scala> nth(2, List(1, 1, 2, 3, 5, 8))
//res0: Int = 2
object P03 extends App {
  // Find Kth element recursively.
  @tailrec
  def nth[A](n: Int, list: List[A]): A =
    if (n <= 0) {
      if (list.isEmpty) throw new NoSuchElementException
      else list.head
    }
    else nth(n - 1, list.tail)

  println(nth(2, List(1, 2, 3)))
}
