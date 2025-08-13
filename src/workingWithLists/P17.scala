package workingWithLists

import scala.annotation.tailrec
// Split a list into two parts.

//  The length of the first part is given. Use a Tuple for your result.
//
//Example:
//
//  scala> split(3, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))
//res0: (List[Char], List[Char]) = (List('a', 'b', 'c'),List('d', 'e', 'f', 'g', 'h', 'i', 'j', 'k')

object P17 extends App {
  def split[A](list: List[A], n: Int): (List[A], List[A]) = {
    @tailrec
    def go(list: List[A], n: Int, sublist: List[A]): (List[A], List[A]) =
      if (n == 0) (sublist.reverse, list)
      else go(list.tail, n - 1, list.head :: sublist)

    if (n <= 0 || n > list.length) (list, List())
    else go(list, n, Nil)
  }

  println(split(List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'), 5))
}
