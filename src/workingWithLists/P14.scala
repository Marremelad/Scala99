package workingWithLists
// Duplicate the elements of a list.

//Example:
//
//  scala> duplicate(List('a', 'b', 'c', 'c', 'd'))
//res0: List[Char] = List('a', 'a', 'b', 'b', 'c', 'c', 'c', 'c', 'd', 'd')

object P14 extends App {
  def duplicate[A](list: List[A]): List[A] =
    list.flatMap(element => List(element, element))

  println(duplicate(List('a', 'b')))
}
