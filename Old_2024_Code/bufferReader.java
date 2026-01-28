import java.io.*;

public class bufferReader {
  public static void main(String[] args) throws Exception {
    File dir = new File("Test");
    File file = new File(dir, "Abhi.text");

    FileReader fr = new FileReader(file);
    BufferedReader Br = new BufferedReader(fr);
    String line = Br.readLine();

    while (line != null) {
      System.out.println(line);
      line = Br.readLine();
    }

    Br.close();
  }
}
