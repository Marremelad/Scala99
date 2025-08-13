package workingWithLists

import scala.annotation.tailrec
// Rotate a list N places to the left.

//Examples:
//
//  scala> rotate(3, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))
//res0: List[Char] = List('d', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'a', 'b', 'c')
//
//scala> rotate(-2, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))
//res1: List[Char] = List('j', 'k', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i')

object P19 extends App {
  def rotate[A](list: List[A], n: Int): List[A] = {
    @tailrec
    def go(list: List[A], n: Int, acc: List[A] = Nil): List[A] =
      if (n <= 0) list ::: acc.reverse
      else go(list.tail, n - 1, list.head :: acc)

    val length = list.length
    go(list, ((n % length) + length) % length)
  }

  println(rotate(List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'), 3))
  println(rotate(List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'), -2))
}
