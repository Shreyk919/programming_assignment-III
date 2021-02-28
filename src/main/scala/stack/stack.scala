class stack {
  var top:Int = -1
  var list:List[Any] = List()

  def push(element:Any):Unit={
    top = top + 1
    list = list ::: List(element)

  }

  def isEmpty:Boolean = {
    if(top < 0) true
    false
  }

  def peek():Any={
    if(!isEmpty) list(top)
    else "Stack is Empty"
  }

  def pop():Unit= {
    if (top < 0) "Stack Underflow"
    else{
      top = top - 1
      list = list.dropRight(1)
    }

  }

  def display():Any={
    if (top < 0) "Stack Underflow"
    else {
      var temp:Int = top
      while (temp > 0) {
        print(list(temp)+"->")
        temp = temp - 1
      }
    }
  }
}
object stack_main {
  def main(args: Array[String]): Unit = {
    val operation = new stack()
    operation.push(10)
    operation.push(5)
    operation.push(23)
    operation.push(69)
    operation.push(42)
    operation.push(13)

    operation.display()    //print the stack

    println("\nTop element is =" + operation.peek())   // print the top element of the stack

    /*describing the delete (pop) operation on stack
    => since stack using LIFO approach the element last inserted will be removed
     */
    operation.pop()
    operation.pop()

    // print Stack elements
    operation.display()

  }
}
