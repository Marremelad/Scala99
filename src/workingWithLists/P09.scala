package workingWithLists

import scala.annotation.tailrec
// Pack consecutive duplicates of list elements into sublists.

//If a list contains repeated elements they should be placed in separate sublists.
//
//Example:
//
//  scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List
object P09 extends App {
  def pack[A](list: List[A]): List[List[A]] = {
    @tailrec
    def go(list: List[A], sublist: List[A], result: List[List[A]]): List[List[A]] = {
      list match {
        case Nil => (sublist :: result).reverse
        case head :: tail =>
          if (sublist.head == head) go(tail, head :: sublist, result)
          else go(tail, head :: Nil, sublist :: result)
      }
    }
    go(list.tail, List(list.head), Nil)
  }

  println(pack(List('a', 'a', 'a', 'b', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))
}
