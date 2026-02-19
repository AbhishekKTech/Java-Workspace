import java.util.HashSet;

class HashsetExample {

  public static void main(String[] args) {
    
    HashSet hashSet = new HashSet();
    hashSet.add("Java");
    hashSet.add("is good language");
    hashSet.add("Html");
    hashSet.add("is not a programing lanugage");
    hashSet.add(53);
    hashSet.add(66 + " woring");// string and the ingerg both are allowed in the hashset 
    hashSet.add("Java"); // Duplicate values are allowed 


    System.out.println(hashSet);

  }
}
