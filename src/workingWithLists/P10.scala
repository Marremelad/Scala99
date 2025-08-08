package workingWithLists
// Run-length encoding of a list.
object P10 extends App {
  def encode[A](list: List[A]): List[(Int, A)] = {
    P09.pack(list).map(x => (x.length, x.head))
  }
  println(encode(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))

}
