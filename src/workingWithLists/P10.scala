package workingWithLists
// Run-length encoding of a list.

//Use the result of problem P09 to implement the so-called run-length encoding data compression method.  Consecutive duplicates of elements are encoded as tuples (N, E) where NN is the number of duplicates of the element EE.
//
//Example:
//
//  scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
object P10 extends App {
  def encode[A](list: List[A]): List[(Int, A)] = {
    P09.pack(list).map(x => (x.length, x.head))
  }

  println(encode(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))
}
