import java.util.LinkedHashMap;

public class LinkedHashMapExample {


  //It is diffrent from the has map beacuse of the order of the insertion is not change the in the result
  public static void main(String[] args) {
    LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
    lhm.put(101, "Abhishek");
    lhm.put(102, "Rohit");
    lhm.put(103, "Abhishek"); // values can be same but the key shuld be diffrent 
    lhm.put(101, "kumar"); // Duplicate keys are not allowed but the value can be same it will get marge with the 101 key
    System.out.println(lhm);

  }
}