import java.util.*;
public class ArrayDequee {
    public static void main(String[] args){
        ArrayDeque aq1=new ArrayDeque();

        aq1.add(334);
        aq1.add(7667);

        System.out.println(aq1);

        // System.out.println("********************");
        
        aq1.addFirst(73);
        aq1.addLast(87);

        System.out.println(aq1);

        aq1.offer(836);

        aq1.offerFirst(74);
        aq1.offerLast(83);

        System.out.println(aq1);

    }
}
