import java.io.*;

public class fileReader {
  public static void main(String[] args) throws Exception {

    File div = new File("Test");
    File file = new File(div, "Abhi.txt");

    FileReader fd = new FileReader(file);

    char ch[] = new char[(int) file.length()];
    // int i = fd.read();

    fd.read(ch);

    for (char data : ch) {
      System.out.print(ch);
    }

    // while (i != -1) {
    // System.out.println(i + ("------>"));
    // System.out.println((char) i);
    // i = fd.read();
    // }
  }
}
