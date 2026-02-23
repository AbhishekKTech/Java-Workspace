import java.util.*;
class hasmap{
    public static void main(String[] args) {
        HashMap<Integer, String> ah = new HashMap<Integer, String>();

        ah.put(4, "Abhshek");
        ah.put(1, "hii");
        ah.put(3, "Third");
        ah.put(2, "Second");
        ah.remove(4);

        System.out.println(ah);
    }
}