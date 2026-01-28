import java.io.*;

public class fileWrite {
    public static void main(String[] args) throws IOException {
        File dir = new File("Test");

        File file = new File(dir, "text.txt");
        file.createNewFile();

        FileWriter pv = new FileWriter(file);

        pv.write("PW");
        pv.write("\n");
        pv.write(86);
        pv.write("\n");
        pv.write("Abhishek");
        pv.write("\n");

        char ch[] = { 'A', 'S', 'K' };
        pv.write(ch);

        FileWriter pv1 = new FileWriter(file, true);

        pv1.write("pw");
        pv1.write("\n");
        pv1.write(87);
        pv1.write("\n");
        pv1.write("\n");
        char ch1[] = { 'c', 'j', 'n' };
        pv1.write(ch1);

        pv1.close();

        System.out.println("Opne Test folder to see result");
    }
}
