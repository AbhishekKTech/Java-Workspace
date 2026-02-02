public class StringBufferExample {
    public static void main(String[] args) {
        // 1. Create a StringBuffer
        StringBuffer sb = new StringBuffer("Java");

        // 2. Append (Add to end)
        sb.append(" Programming");
        System.out.println("1. Append: " + sb); 
        // Output: Java Programming

        // 3. insert the prgram
        sb.insert(5, " Wrold ");
        System.out.println("2. insert: " + sb);

        // 4. replace 
        sb.replace(5, 11, "core");
        System.out.println("3. replace" + sb);

        //5. dealte
        sb.delete(5, 11);
        System.out.println("4. DELETE: "+sb);

        // 6. reverse 
        StringBuffer name = new StringBuffer("ABHISHEK");
        System.out.println("5: REVERSE: ABHISHEK REVERSE IS - " + name.reverse());       

        // 7. Capcity() 
        StringBuffer gf = new StringBuffer(); // empty
        System.out.println("Defult capacity is :"+gf.capacity());

        gf.append("abcdefg"); // 7 but it will show as the 16 still
        System.out.println("element less then 16 still show the capcity as the 16: "+gf.capacity());

         gf.append("hijkddddgsdslmn"); // more then 16 even one will become double double in sizze in capacity 
         // forumala is (old + 1)*2 
         System.out.println("element more then 16 "+gf.capacity());

        //8.trimToSize()
        StringBuffer sb3 = new StringBuffer(50); // Humne 50 ki capacity di
        sb3.append("HEllo"); // 5 emenent
        System.out.println("without trimoffsize the capacity " + sb3.capacity());

        sb3.trimToSize();
        System.out.println("After thrimofsize the capacity " + sb3.capacity());
        




    }
}