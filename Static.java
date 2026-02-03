public class Static {
    
        static class demo {
        static int a;
        static int b;

        int m;
        int n;

        static {
            System.out.println("1. Control is in static block");
            a = 10;
            b = 20;
        }

        {
            System.out.println("2. Control is in non-static block");
            m = 13;
            n = 73;
        }

        static void display() {
            System.out.println("Value of static variable a: " + a);
            System.out.println("Value of static variable b: " + b);
        }

        void display2() {
            System.out.println("Value of non-static variable m: " + m);
            System.out.println("Value of non-static variable n: " + n);
        }
    }

    public static void main(String[] args) {
        // Static method ko bina object banaye call kar sakte hain
        demo.display(); 

        System.out.println("-----------------");

        // Non-static method ke liye Object banana zaroori hai
        demo d = new demo(); 
        d.display2(); // Corrected: d.display2() instead of demo.display2()
    }
}