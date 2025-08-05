package workingWithLists
// Flatten a nested list structure.
object P07 extends App {
  val list = List(List(1, List(1)), 2, List(3, List(5, 8)))

  def flatten(list: List[Any]): List[Any] = {
    def aux(list: List[Any], acc: List[Any] = Nil): List[Any] = {
      if (list.isEmpty) acc
      else aux(list.tail, list.head match {
        case sublist: List[_] => aux(sublist, acc)
        case single => single :: acc // Prepend elements to list and then reverse list at the end, O(n) TC.
        })
      }

    aux(list).reverse
  }

  println(flatten(list))
}
