import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class StackQueueTester {
  
  private String[] strings = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine",
      "Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Ninteen",
      "Twenty","Twenty One","Twenty Two","Twenty Three","Twenty Four","Twenty Five","Twenty Six","Twenty Seven","Twenty Eight","Twenty Nine",
      "Thirty","Thirty One","Thirty Two","Thirty Three","Thirty Four","Thirty Five","Thirty Six","Thirty Seven","Thirty Eight","Thirty Nine",
      "Fourty","Fourty One","Fourty Two","Fourty Three","Fourty Four","Fourty Five","Fourty Six","Fourty Seven","Fourty Eight","Fourty Nine",
      "Fifty","Fifty One","Fifty Two","Fifty Three","Fifty Four","Fifty Five","Fifty Six","Fifty Seven","Fifty Eight","Fifty Nine",
      "Sixty","Sixty One","Sixty Two","Sixty Three","Sixty Four","Sixty Five","Sixty Six","Sixty Seven","Sixty Eight","Sixty Nine",
      "Seventy","Seventy One","Seventy Two","Seventy Three","Seventy Four","Seventy Five","Seventy Six","Seventy Seven","Seventy Eight","Seventy Nine",
      "Eighty","Eighty One","Eighty Two","Eighty Three","Eighty Four","Eighty Five","Eighty Six","Eighty Seven","Eighty Eight","Eighty Nine",
      "Ninty","Ninty One","Ninty Two","Ninty Three","Ninty Four","Ninty Five","Ninty Six","Ninty Seven","Ninty Eight","Ninty Nine", "One Hundred",
      "One Hundred and One"};
  
  @Test
  public void stackEmpty(){
    myStack s = new myStack(0);
    assertTrue(s.isEmpty());
    assertTrue(s.isFull());
    assertFalse(s.push("C"));
    assertNull(s.pop());
  }
  
  @Test
  public void queueEmpty(){
    myQueue q = new myQueue(0);
    assertTrue(q.isEmpty());
    assertTrue(q.isFull());
    assertFalse(q.enqueue("C"));
    assertNull(q.dequeue());
  }
  
  
  @Test
  public void stackDefaultSize(){
    myStack s = new myStack();
    assertTrue(s.isEmpty());
    assertFalse(s.isFull());
    for(int i=0; i<10; i++) {
      assertFalse(s.isFull());
      assertTrue(s.push(strings[i]));
      assertFalse(s.isEmpty());
    }
    assertTrue(s.isFull());
    assertFalse(s.push(strings[10]));
    assertTrue(s.isFull());
    for(int i=9; i>=0; i--) {
      assertFalse(s.isEmpty());
      assertEquals(strings[i], s.pop());
      assertFalse(s.isFull());
    }
    assertNull(s.pop());
    assertTrue(s.isEmpty());
  }
  
  @Test
  public void queueDefaultSize(){
    myQueue q = new myQueue();
    assertTrue(q.isEmpty());
    assertFalse(q.isFull());
    for(int i=0; i<10; i++) {
      assertFalse(q.isFull());
      assertTrue(q.enqueue(strings[i]));
      assertFalse(q.isEmpty());
    }
    assertTrue(q.isFull());
    assertFalse(q.enqueue(strings[10]));
    assertTrue(q.isFull());
    for(int i=0; i<10; i++) {
      assertFalse(q.isEmpty());
      assertEquals(strings[i], q.dequeue());
      assertFalse(q.isFull());
    }
    assertNull(q.dequeue());
    assertTrue(q.isEmpty());
  }
  
  
  @Test
  public void stackLargeSize(){
    myStack s = new myStack(100);
    assertTrue(s.isEmpty());
    assertFalse(s.isFull());
    for(int i=0; i<100; i++) {
      assertFalse(s.isFull());
      assertTrue(s.push(strings[i]));
      assertFalse(s.isEmpty());
    }
    assertTrue(s.isFull());
    assertFalse(s.push(strings[100]));
    assertTrue(s.isFull());
    for(int i=99; i>=0; i--) {
      assertFalse(s.isEmpty());
      assertEquals(strings[i], s.pop());
      assertFalse(s.isFull());
    }
    assertNull(s.pop());
    assertTrue(s.isEmpty());
  }
  
  @Test
  public void queueLargeSize(){
    myQueue q = new myQueue(100);
    assertTrue(q.isEmpty());
    assertFalse(q.isFull());
    for(int i=0; i<100; i++) {
      assertFalse(q.isFull());
      assertTrue(q.enqueue(strings[i]));
      assertFalse(q.isEmpty());
    }
    assertTrue(q.isFull());
    assertFalse(q.enqueue(strings[100]));
    assertTrue(q.isFull());
    for(int i=0; i<100; i++) {
      assertFalse(q.isEmpty());
      assertEquals(strings[i], q.dequeue());
      assertFalse(q.isFull());
    }
    assertNull(q.dequeue());
    assertTrue(q.isEmpty());
  }
  
  
  @Test
  public void stackLargeSizeAtLimit(){
    myStack s = new myStack(100);
    assertTrue(s.isEmpty());
    assertFalse(s.isFull());
    for(int i=0; i<100; i++) {
      assertFalse(s.isFull());
      assertTrue(s.push(strings[i]));
      assertFalse(s.isEmpty());
    }
    for(int j=0; j<200; j++) {
      assertTrue(s.isFull());
      assertFalse(s.push(strings[100]));
      assertFalse(s.isEmpty());
      assertEquals(strings[99], s.pop());
      assertFalse(s.isEmpty());
      assertFalse(s.isFull());
      assertTrue(s.push(strings[99]));
    }
  }
  
  @Test
  public void queueLargeSizeAtLimit(){
    myQueue q = new myQueue(100);
    assertTrue(q.isEmpty());
    assertFalse(q.isFull());
    for(int i=0; i<100; i++) {
      assertFalse(q.isFull());
      assertTrue(q.enqueue(strings[i]));
      assertFalse(q.isEmpty());
    }
    for(int j=0; j<=100; j++) {
      assertTrue(q.isFull());
      assertFalse(q.enqueue(strings[100]));
      assertFalse(q.isEmpty());
      assertEquals(strings[j], q.dequeue());
      assertFalse(q.isEmpty());
      assertFalse(q.isFull());
      assertTrue(q.enqueue(strings[100]));
    }
  }
  
  @Test
  public void stackSmallSizeAtLimit(){
    myStack s = new myStack(1);
    assertTrue(s.isEmpty());
    assertFalse(s.isFull());
    for(int i=0; i<1; i++) {
      assertFalse(s.isFull());
      assertTrue(s.push(strings[i]));
      assertFalse(s.isEmpty());
    }
    for(int j=0; j<200; j++) {
      assertTrue(s.isFull());
      assertFalse(s.push(strings[100]));
      assertFalse(s.isEmpty());
      assertEquals(strings[0], s.pop());
      assertTrue(s.isEmpty());
      assertFalse(s.isFull());
      assertTrue(s.push(strings[0]));
    }
  }
  
  @Test
  public void queueSmallSizeAtLimit(){
    myQueue q = new myQueue(1);
    assertTrue(q.isEmpty());
    assertFalse(q.isFull());
    for(int i=0; i<1; i++) {
      assertFalse(q.isFull());
      assertTrue(q.enqueue(strings[i]));
      assertFalse(q.isEmpty());
    }
    for(int j=0; j<100; j++) {
      assertTrue(q.isFull());
      assertFalse(q.enqueue(strings[100]));
      assertFalse(q.isEmpty());
      assertEquals(strings[j], q.dequeue());
      assertTrue(q.isEmpty());
      assertFalse(q.isFull());
      assertTrue(q.enqueue(strings[j+1]));
    }
  }
  
  @Test
  public void stackAtLowerLimit(){
    myStack s = new myStack();
    assertTrue(s.isEmpty());
    assertFalse(s.isFull());
    for(int i=0; i<1; i++) {
      assertFalse(s.isFull());
      assertTrue(s.push(strings[i]));
      assertFalse(s.isEmpty());
    }
    for(int j=0; j<200; j++) {
      assertFalse(s.isFull());
      assertFalse(s.isEmpty());
      assertEquals(strings[0], s.pop());
      assertTrue(s.isEmpty());
      assertFalse(s.isFull());
      assertTrue(s.push(strings[0]));
    }
  }
  
  @Test
  public void queueAtLowerLimit(){
    myQueue q = new myQueue();
    assertTrue(q.isEmpty());
    assertFalse(q.isFull());
    for(int i=0; i<1; i++) {
      assertFalse(q.isFull());
      assertTrue(q.enqueue(strings[i]));
      assertFalse(q.isEmpty());
    }
    for(int j=0; j<100; j++) {
      assertFalse(q.isFull());
      assertFalse(q.isEmpty());
      assertEquals(strings[j], q.dequeue());
      assertTrue(q.isEmpty());
      assertFalse(q.isFull());
      assertTrue(q.enqueue(strings[j+1]));
    }
  }
  
  
  
}
