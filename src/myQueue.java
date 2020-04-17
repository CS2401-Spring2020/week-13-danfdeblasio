class myQueue{
  //holds the elements in the queue
  private String[] data;
  // holds the index *after* the top of the queue
  private int front;
  // keeps track of how many items are in the queue
  private int numElements;
  
  // creates a new instance with data.length == size.
  myQueue(int size){
    data = new String[size];
    front = 0;
    numElements = 0;
  }
  
  // created a new instance so data.length == 10.
  myQueue(){
    this(10);
  }
  
  // Adds s to the end of the queue and increments numElements. 
  // The location to insert the element will be determined based on the position of front and the value numElements 
  // (you will need to use modulus, %). 
  // This method returns true if the element is added, and false if the element cannot be added because the queue is full
  public boolean enqueue(String s) {
    if(!isFull()) {
      
      // figure out the end of the queue (wrapping around if needed), 
      // increment the counter *after* the assignment is made
      data[(front + numElements++)%data.length] = s;
      return true;
    }
    return false;
  }
  
  // Dequeues the front element in the data structure (i.e. the one at front) and updates the value of front. 
  // Returns null if there is nothing to dequeue.
  public String dequeue() {
    if(!isEmpty()) {
      // save the return value while we update the indexes
      String rtn = data[front];
      
      //update indexes (wrap front if needed)
      front = (front + 1) % data.length;
      numElements--;
      
      // return the value we saved
      return rtn;
    }
    return null;
  }
  
  // returns the number of elements in the data structure.
  public int getSize() {
    return numElements;
  }
  
  //returns true if no elements are present in the data structure, returns false otherwise.
  public boolean isEmpty() {
    return (numElements == 0);
  }
  
  //returns true if the number of elements in the data structure is equal to the size of data.
  public boolean isFull() {
    return (numElements == data.length);
  }
}
