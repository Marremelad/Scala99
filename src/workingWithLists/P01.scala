package workingWithLists

import scala.annotation.tailrec
// Find the last element of a list.

//Example:
//
//  scala> last(List(1, 1, 2, 3, 5, 8))
//res0: Int = 8
object P01 extends App {
  // Built in solutions.
  val list = List(1, 2, 3, 4, 5)
  println(list.last)
  println(list.reverse.head) // Why not.
  println(list.foldLeft(0)((_, current) => current))
  println(list.reduce((_, current) => current)) // More elegant. Also, n - 1 operations compared to foldLeft.
  list.foreach(x => if (x == list.last) println(x)) // 😎

  // Find the end of the list recursively.
  @tailrec
  def last[A](list: List[A]): A = { // O(n) time complexity.
    if (list.isEmpty) throw new NoSuchElementException
    if (list.tail.isEmpty) list.head
    else last(list.tail)
  }

  println(last(List(1, 2, "Hello", 3, 'a')))
}
