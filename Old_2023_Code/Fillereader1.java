import java.io.*;

public class Fillereader1 {
  public static void main(String[] args) throws Exception {

    File dir = new File("Test");
    File text = new File("text.txt");

    FileReader reader = new FileReader(text);
    char ch[] = new char[(int) text.length()];

    reader.read(ch);
    for (char data : ch) {
      System.out.println(ch);
    }
  }
}
