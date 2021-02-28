class queue{
  var list:List[Any] = List()
  var front:Int = -1      //
  var rear:Int = -1

  //method to implement insertion in queue
  def enqueue(key:Int): Unit = {
    if (this.rear == -1) {
      this.front = front + 1
      this.rear = rear + 1
      return
    }
    list = list ::: List(key)
    this.rear = list.length;
  }

  // Method to implement deletion in queue.
  def dequeue(): Unit = {
    // return NULL if queue is empty.
    if (this.front == -1)
      return;

    // Store previous front and increment front node in once
    list = list.drop(1)
    this.front = this.front + 1

    // If front is empty, make rear NULL too
    if (this.front == -1)
      this.rear = -1;
  }

}

object queue_main {
  def main(args: Array[String]): Unit = {
    val q = new queue()
    q.enqueue(1)
    q.enqueue(2)
    q.dequeue()
    q.dequeue()
    q.enqueue(3)
    q.enqueue(4)
    q.enqueue(5)
    q.dequeue()

  }
}