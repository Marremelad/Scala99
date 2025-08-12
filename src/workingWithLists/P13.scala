package workingWithLists

import scala.annotation.tailrec
// Run-length encoding of a list (direct solution).

//Implement the so-called run-length encoding data compression method directly. I.e. don’t use other methods you’ve written (like P09’s pack); do all the work directly.
//
//Example:
//
//  scala> encodeDirect(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'))
//res0: List[(Int, Char)] = List((4,'a'), (1,'b'), (2,'c'), (2,'a'), (1,'d'), (4,'e'))

object P13 extends App {
  val list = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')

  def encodeDirect(list: List[Char]): List[(Int, Char)] = {
      @tailrec
      def go(list: List[Char], acc: List[List[Char]]): List[List[Char]] =
        if (list.isEmpty) acc.reverse
        else {
          val (group, next) = list.span(_ == list.head)
          go(next, group :: acc)
        }

    go(list, Nil).map(subList => (subList.length, subList.head))
  }

  println(encodeDirect(List()))
}
