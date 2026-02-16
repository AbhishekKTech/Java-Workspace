import java.util.ArrayDeque;

public class ArrayDequeExample {
  
  public static void main(String[] args) {
    
    ArrayDeque<Object> ar = new ArrayDeque<>();
  
  ar.addLast(32);
  ar.addLast(32);
  ar.addLast("Hello");
  ar.addLast(3.14);
  ar.removeLast(); // removes the last element (3.14)
  ar.removeFirst(); // removes the first element (32)
  ar.addFirst("World"); // adds "World" to the front of the deque


  System.out.println(ar);
  
  
  }
}
