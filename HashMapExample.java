import java.util.HashMap;

public class HashMapExample {
  public static void main(String[] args) {
    HashMap<Integer, String> hashMap = new HashMap<>();
    hashMap.put(101, "Abhishek"); // Stored in the key value pair formate
    hashMap.put(102, "Rohit");
    System.out.println(hashMap);
    System.out.println(hashMap.get(101));  
  }
}
