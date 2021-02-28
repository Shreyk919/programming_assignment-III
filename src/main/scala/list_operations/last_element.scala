//Recursive solution to find the element at the last index of a list.

class last_element {

  //method to find the last list element
  def last(input: List[Any]): Any = input match {
    case head :: Nil => head    /*divides the list in two parts with a head and empty tail.
                                  => When input has only one element
                                */
    case _ :: tail => last(tail)    //storing list tail and recursively call for the remaning values of the list
  }
}

object main {
  def main(args: Array[String]): Unit = {
    val list = new last_element
    println("Last element in the list is is: " + list.last(List(5, 9, 8, 1, 3)))
  }
}
