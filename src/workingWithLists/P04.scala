package workingWithLists
// Find the number of elements of a list.
object P04 extends App {

  def length[A](list: List[A], acc: Int = 0): Int =
    if (list.isEmpty) acc
    else length(list.tail, 1 + acc)

  println(length(List(1, 1, 1)))
}
