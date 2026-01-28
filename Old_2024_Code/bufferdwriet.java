import java.io.*;

public class bufferdwriet {
  public static void main(String[] args) throws Exception {
    File dir = new File("Test");
    File f = new File(dir, "Abhi.txt");

    FileWriter fw = new FileWriter(f);
    BufferedWriter bw = new BufferedWriter(fw);

    bw.write("Abhi");
    bw.newLine();
    bw.write(23);
    bw.newLine();
    char ch[] = { 'w', 's', 's', 'g' };
    bw.write(ch);

    bw.flush();

  }
}
