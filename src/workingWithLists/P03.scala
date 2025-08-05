package workingWithLists
// Find the Kth element in a list.
object P03 extends App {
  // Find Kth element recursively.
  def nth[A](n: Int, list: List[A]): A =
    if (n <= 0) {
      if (list.isEmpty) throw new NoSuchElementException
      else list.head
    }
    else nth(n - 1, list.tail)

  println(nth(2, List(1, 2, 3)))
}
