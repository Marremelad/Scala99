package workingWithLists

import scala.annotation.tailrec
// Drop every Nth element from a list.

//Example:
//
//  scala> drop(3, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))
//res0: List[Char] = List('a', 'b', 'd', 'e', 'g', 'h', 'j', 'k')

object P16 extends App {
  def drop[A](list: List[A], n: Int): List[A] = {
    @tailrec
    def go(list: List[A], dec: Int, acc: List[A]): List[A] =
      if (list.isEmpty) acc.reverse
      else if (dec == 1) go(list.tail, n, acc)
      else go(list.tail, dec - 1, list.head :: acc)

    go(list, n, Nil)
  }

  println(drop(List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'), 3))
}
