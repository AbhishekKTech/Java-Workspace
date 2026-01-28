import java.io.*;

public class printWriter {
  public static void main(String[] args) throws Exception {

    FileWriter fw = new FileWriter("File");
    PrintWriter pw = new PrintWriter(fw);

    pw.write("Hii");
    pw.write('-');
    pw.write(76);
    pw.write('a');
    pw.println(50.5);
    pw.println(true);
    pw.flush();

  }
}
