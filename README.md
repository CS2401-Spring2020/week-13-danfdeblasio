# Week 13

You will build both stacks and queues. 
You will use an array as your storage container for a set of `String`s, and your classes `myStack` and `myQueue` will be given a size limit when they are constructed. 

## What to build
Your taks will be to construct two new classes `myStack` and `myQueue` with the following descriptions. 
`myStack.java` and `myQueue.java` have been created for you in the `src` folder, **do not modify the method and element signatures or access specifiers (i.e. public, private) provied**. 
You can add additional helper methods if neccesary, but these will not be required or graded. 

### `myStack`
Your class should contain the following elements:
* `private String[] data` -- this will be used to hold all of the information in the stack
* `private int top` -- this will hold the index *after* the last element stored in `data`. (If `top == 0` there are no elements in the data structure.)


Your class should have the following constructors:
* `myStack(int size)` -- creates a new instance with `data.length == size`.
* `myStack()` -- created a new instance so `data.length == 10`.

You class will have the following methods:
* `public boolean push(String s)` -- pushes an element into the stack at `top` and increments the pointer. If `top` is out of bound and the element cannot be inserted return false, otherwise return true. 
* `public String pop()` -- pops the top element in the data structure (i.e. the one at `end-1`) and updates the value of `end`. Return `null` if no elements are in the stack. 

### `myQueue`
Your class should contain the following elements:
* `private String[] data` -- this will be used to hold all of the information in the stack.
* `private int front` -- this will contain the index of the front element of the queue.
* `private int numElements` -- keeps track of how many elements are currently in the queue.

Your class should have the following constructors:
* `myQueue(int size)` -- creates a new instance with `data.length == size`.
* `myQueue()` -- created a new instance so `data.length == 10`.

You class will have the following methods:
* `public bool enqueue(String s)` -- adds `s` to the end of the queue and incremenets `numElements`. The location to insert the element will be determined based on the position of `front` and the value `numElements` (you will need to use modulous, `%`). This method returns `true` if the element is added, and `false` if the element cannot be added because the queue is full. 
* `public String dequeue()` -- dequeues the front element in the data structure (i.e. the one at `front`) and updates the value of `front`. Returns `null` if there is nothing to dequeue.

### both `myStack` and `myQueue`
Both classes will contain the following methods, though the implementations will be slightly different. 
* `public int getSize()` -- returns the number of elements in the data structure. 
* `public boolean isEmpty()` -- returns `true` if no elements are present in the data structure, returns `false` otherwise.
* `public boolean isFull()` -- returns `true` if the number of elements in the data structure is equal to the size of `data`.

## What to turn in
You will submit 3 files:
* `myStack.java`, 
* `myQueue.java`, and
* `StackQueueTester.java` which will contain at least 5 test cases for each of the new classes. 

## Grading
* `myStack.java` -- 45 pts.
  * constructors -- 10 pts.
  * `push` -- 10 pts.
  * `pop` -- 10 pts.
  * `getSize`,`isEmpty`,`isfull` -- 5 pts. each
* `myQueue.java` -- 45 pts.
  * constructors -- 10 pts.
  * `enqueue` -- 10 pts.
  * `dequeue` -- 10 pts.
  * `getSize`,`isEmpty`,`isfull` -- 5 pts. each
* `StackQueueTester.java` -- 10 pts (1 pt each for 10 test cases)

## Due Date 
You assignment should be submitted on GitHub by **Monday, 27 April 2020, 11:59PM**
Lateness: -10 pts. 1 day late. -20 pts. 2 days late, 0 credit after. 

## Reccomended Schedule
* Monday, 20 April
  * test cases
  * stack & queue constructors
* Wednesday, 22 April
  * rest of the methods
* Monday, 27 April
  * final testing
