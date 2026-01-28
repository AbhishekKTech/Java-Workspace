public class Logical {
    public static void main(String[] args){
        int a = 5;
        int b = 4;
        int c = 3;
        System.out.println(a==b && a>b && a<=c);
        System.out.println(a<b && a>c && b<c && a<=c); // And Operators
        System.out.println(a==b  | a>b || a<b); // Or Operators
    
    }
}
