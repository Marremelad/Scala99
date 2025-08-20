package workingWithLists

import scala.annotation.tailrec
// Remove the Kth element from a list.

//Example:
//
//  scala> removeAt(1, List('a', 'b', 'c', 'd'))
//res0: (List[Char], Char) = (List('a', 'c', 'd'),'b')

object P20 extends App {
  def removeAt[A](n: Int, list: List[A]): Option[(List[A], A)] = {
    @tailrec
    def go(index: Int, remaining: List[A], acc: List[A]): (List[A], A) =
      remaining match {
        case head :: tail =>
          if (index == n) (acc.reverse ::: tail, head)
          else go(index + 1, tail, head :: acc)
      }

    if (n < 0 || n >= list.length) None
    else Some(go(0, list, Nil))
  }

  val someValue = removeAt(100, List('a', 'b', 'c', 'd')).getOrElse(None)
  println(someValue)
}

