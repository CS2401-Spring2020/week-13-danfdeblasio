class myStack{
  // holds the elements in the stack
  private String[] data;
  // holds the index *after* the top of the stack
  private int top;
  
  // creates a new instance with data.length == size.
  myStack(int size){
    data = new String[size];
    top = 0;
  }
  
  // created a new instance so data.length == 10.
  myStack(){
    this(10);
  }
  
  // Pushes an element into the stack at top and increments the pointer. 
  // If top is out of bound and the element cannot be inserted return false,
  //      otherwise return true.
  public boolean push(String s) {
    if(top < data.length) {
      
      // increments the index *after* the assignment is made
      data[top++] = s;
      return true;
    }
    return false;
  }
  
  // Pops the top element in the data structure (i.e. the one at end-1) 
  // and updates the value of end. 
  // Return null if no elements are in the stack.
  public String pop() {
    if(top > 0) {
      
      // decrements the pointer after the return is made (kind of magic)
      return data[--top];
    }
    return null;
  }
      
  // returns the number of elements in the data structure.
  public int getSize() {
    return top;
  }
  
  //returns true if no elements are present in the data structure, returns false otherwise.
  public boolean isEmpty() {
    return (top == 0);
  }
  
  //returns true if the number of elements in the data structure is equal to the size of data.
  public boolean isFull() {
    return (top == data.length);
  }
}
