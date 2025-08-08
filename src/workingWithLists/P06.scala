package workingWithLists
// Find out if a list is a palindrome.

//Example:
//
//  scala> isPalindrome(List(1, 2, 3, 2, 1))
//res0: Boolean = true

object P06 extends App {
  def isPalindrome[A](list: List[A]): Boolean = {
    list == P05.reverseTailRec(list) // Use the reverse function from previous problem.
  }

  println(isPalindrome(List(1, 2, 3, 2, 1)))
}
