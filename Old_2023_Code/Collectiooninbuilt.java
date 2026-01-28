import java.util.ArrayList;
import java.util.*;
public class Collectiooninbuilt {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();

        al.add(76);
        al.add(43);
        al.add(56);
        al.add(77);
        al.add(33);

        System.out.println(al);

        Collections.sort(al);

        // ***********AFTER SORTIONG************

        System.out.println(al);

        ArrayList<String> al1= new ArrayList<String>();

      al1.add("727");
      al1.add("hii");
      al1.add("pw");

      System.out.println(al1);

      Collections.sort(al1);

      ArrayList al2= new ArrayList();

      al2.add(33);
      al2.add(23);
      al2.add(32);


      // int index = Collections.binarySearch(al2, 33);
      System.out.println(Collections.binarySearch(al2, 33));

    }
}
