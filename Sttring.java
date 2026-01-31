public class Sttring {
public static void main(String[] args) {
    //created in a String constant pool;
    String str = "hellow world";
    System.out.println(str);
    String str2 = "hellow world";
    System.out.println(str2);// bothh will in the same location in the string constant pool 

    // craete in the heap memory
    String str1 = new String("hellow world");
    System.out.print(str1);
    String str3 = new String("hellow world");
    System.out.print(str3);// both will be in the different location in the heap memory
}
}