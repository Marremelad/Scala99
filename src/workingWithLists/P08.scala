package workingWithLists

import scala.annotation.tailrec
// Eliminate consecutive duplicates of list elements.

//If a list contains repeated elements they should be replaced with a single copy of the element.  The order of the elements should not be changed.
//
//Example:
//
//  scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
object P08 extends App {
  def compress[A](list: List[A]): List[A] = {
    @tailrec
    def go(remaining: List[A], acc: List[A]): List[A] = {
      remaining match {
        case Nil => acc.reverse
        case head :: tail =>
          if (acc.nonEmpty && acc.head == head) go(tail, acc)
          else go(tail, head :: acc)
      }
    }
    go(list, Nil)
  }

  println(compress(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))
}
