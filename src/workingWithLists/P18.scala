package workingWithLists

import scala.annotation.tailrec
// Extract a slice from a list.

//Given two indices, II and KK, the slice is the list containing the elements from and including the IIth element up to but not including the KKth element of the original list.  Start counting the elements with 0.
//
//Example:
//
//  scala> slice(3, 7, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))
//res0: List[Symbol] = List('d', 'e', 'f', 'g')

object P18 extends App {
  def slice[A](list: List[A], i: Int, k: Int): List[A] = {
    @tailrec
    def helper(list: List[A], decK: Int, acc: List[A]): List[A] =
      if (decK == 0) acc.reverse
      else helper(list.tail, decK - 1, list.head :: acc)

    @tailrec
    def go(list: List[A], decI: Int): List[A] =
      if (decI == 0) helper(list, k - i, Nil)
      else go(list.tail, decI - 1)

    go(list, i)
  }

  println(slice(List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'), 3, 7))
}
