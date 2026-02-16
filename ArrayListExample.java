import java.util.ArrayList;

class ArrayListExample {
  public static void main(String[] args) {
    
    ArrayList<Object> arr = new ArrayList<>();
    arr.add(32);
    arr.add(32);
    arr.add("Hello");
    arr.add(3.14);

    arr.remove(1);
    arr.set(1, "World");

    System.out.println(arr);
  }
}