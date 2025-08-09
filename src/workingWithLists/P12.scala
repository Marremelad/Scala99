package workingWithLists

import scala.annotation.tailrec
// Decode a run-length encoded list.

//Given a run-length code list generated as specified in problem P10, construct its uncompressed version.
//
//Example:
//
//  scala> decode(List((4, 'a'), (1, 'b'), (2, 'c'), (2, 'a'), (1, 'd'), (4, 'e')))
//res0: List[Char] = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')

object P12 extends App {
  def decode(list: List[(Int, Char)]): List[Char] = {
    @tailrec
    def populate(n: Int, a: Char, acc: List[Char]): List[Char] = {
      if (n <= 0) acc
      else populate(n - 1, a, a :: acc)
    }
    @tailrec
    def go(list: List[(Int, Char)], acc: List[Char] = Nil): List[Char] = {
      list match {
        case Nil => acc.reverse
        case head :: tail =>
          if (head._1 > 1)
            go(tail, populate(head._1, head._2, acc))
          else go(tail, head._2 :: acc)
      }
    }
    go(list)
  }

  println(decode(List((4, 'a'), (1, 'b'), (2, 'c'), (2, 'a'), (1, 'd'), (4, 'e'))))
}
