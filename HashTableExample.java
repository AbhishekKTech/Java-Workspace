import java.util.Hashtable;

public class HashTableExample {
  public static void main(String[] args) {
      Hashtable<String, Integer> ht = new Hashtable<>();

      ht.put("Abhishek", 101);
      ht.put("Rohit", 102);
      System.out.println(ht);
      System.out.println(ht.get("Abhishek"));
  }
}
