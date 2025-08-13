package workingWithLists

import scala.annotation.tailrec
// Duplicate the element of a list a given number of times.

//Example:
//
//  scala> duplicateN(3, List('a', 'b', 'c', 'c', 'd'))
//res0: List[Char] = List('a', 'a', 'a', 'b', 'b', 'b', 'c', 'c', 'c', 'c', 'c', 'c', 'd', 'd', 'd')

object P15 extends App {
  def duplicateN[A](list: List[A], n: Int): List[A] = {
    list.flatMap(element => (1 to n).map(_ => element))
  }

  println(duplicateN(List('a', 'b'), 10))
}
