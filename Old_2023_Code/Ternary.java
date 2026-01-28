public class Ternary {
    public static void main(String[] args){
        int a= 10;
        int b = 20;
        int c = 40;

        // int result = (a<b)? a : b; // if a less then b then print a, else print b.
        // System.out.println(result);
        // String res = (a>b)? "a is less" : "b is less";
        // System.out.println(res);

        int num= (a>b)? (a>c? a: c): (b>c? b: c);
        System.out.println(num); 

    }
}
