package workingWithLists

import scala.annotation.tailrec
// Find the number of elements of a list.

//Example:
//
//  scala> length(List(1, 1, 2, 3, 5, 8))
//res0: Int = 6

object P04 extends App {
  @tailrec
  def length[A](list: List[A], acc: Int = 0): Int =
    if (list.isEmpty) acc
    else length(list.tail, 1 + acc)

  println(length(List(1, 1, 1)))
}
