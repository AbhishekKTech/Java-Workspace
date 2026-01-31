public class StringCompersion {
    public static void main (String[] args){
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("helloo");
        
        System.out.println(s1==s2); // true
        System.out.println(s2==s3); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // false
    }
}
