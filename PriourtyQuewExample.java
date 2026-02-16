import java.util.PriorityQueue;

public class PriourtyQuewExample {
  public static void main(String[] args) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.add(32);
    pq.add(32);
    pq.add(15);
    pq.add(3);
    pq.remove(); // removes the head of the queue (the smallest element)
    System.out.println(pq);
  }
}
