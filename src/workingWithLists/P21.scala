package workingWithLists
// Insert an element at a given position into a list.

//Example:
//
//  scala> insertAt("new", 1, List('a, 'b, 'c, 'd))
//res0: List[Any] = List('a', "new", 'b', 'c', 'd')

object P21 extends App {
  def insert[A](element: A, n: Int, list: List[A]): List[A] = {
    def go(index: Int, list: List[A], acc: List[A]): List[A] = {
      list match {
        case Nil => (element :: acc).reverse
        case head :: tail =>
          if (index == n) acc.reverse ::: element :: head :: tail
          else go(index + 1, tail, head :: acc)
      }
    }
    go(0, list, Nil)
  }

  println(insert('A', 2, List(1, 2, 3, 4, 5)))
}
