package workingWithLists

import scala.annotation.tailrec

// Reverse a list.
object P05 extends App {
  def reverse[A](list: List[A]): List[A] =
    if (list.isEmpty) list
    else reverse(list.tail) ++ List(list.head) // O(n²)

  def reverseTailRec[A](list: List[A]): List[A] = {
    @tailrec
    def aux(remaining: List[A], acc: List[A] = Nil): List[A] =
      if (remaining.isEmpty) acc
      else aux(remaining.tail, remaining.head :: acc) // O(n) because of :: (prepend) instead of ++.

    aux(list)
  }

  println(reverse(List(1, 2, 3)))
  println(reverseTailRec(List(1, 2, 3)))
}
