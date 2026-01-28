import java.io.*;

public class fileCreation {
    public static void main(String[] args) {
        File file1 = new File("Hello.txt");

        System.out.println(file1.exists());

        // file1.createNewFile();
        System.out.println(file1.exists());

        File dir = new File("Abhi");
        System.out.println(dir.exists());

        dir.mkdir();
        System.out.println(dir.exists());

    }
}
