package workingWithLists

import scala.annotation.tailrec

// Eliminate consecutive duplicates of list elements.
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
