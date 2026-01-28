class demo1 {

    static int a;
    static int b;

    int c;
    int d;

    static
    {
        System.out.println("Static Block");
        a=28;
        b=32;
    }

    static void display(){
        System.out.println("Static Block value of a:" + a);
        System.out.println("Static Block value of b:" + b);

    }

    {
        c=2;
        d=42;
        System.out.println("Static Block value of c:" + c);
        System.out.println("Static Block value of d:" + d);
    }


}
public class staticNonstatic {
    public static void main (String[] args)
    {
        demo1 d =  new demo1();

        d.display();
    }
}
