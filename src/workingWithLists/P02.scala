package workingWithLists
// Find the last but one element of a list.
object P02 extends App {
  // Built in solutions.

  //          found it --- v
  val list = List(1, 2, 3, 4, 5)
  println(list.init.last)
  println(list.reverse.tail.head)
  println(list(list.length - 1 - 1))
  println(list.indexOf(list.length)) // Think about it.
  println(4)

  def lastButOne[A](list: List[A]): A = {
    def aux(list: List[A], previous: A): A = {
      if (list.tail.isEmpty) previous
      else aux(list.tail, list.head)
    }
    if (list.isEmpty) throw new NoSuchElementException
    aux(list, list.head)
  }
  println(lastButOne(List()))
}
