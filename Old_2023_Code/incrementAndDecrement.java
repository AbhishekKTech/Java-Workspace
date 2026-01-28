public class incrementAndDecrement {
    public static void main(String[] args){

        // Post, Pre -Incrementation and Decrementation
        int a=5;
        int b;
        // int b= ++a; // Pre Incrementat
        // System.out.println(b);

        // int b = a++; // the a vale is now 6
        // System.out.println(b); 
        // System.out.println(a);

        b = a++ + ++a - a-- + a++;
        System.out.println(b);

    }
}
