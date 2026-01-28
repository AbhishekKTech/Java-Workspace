import java.io.*;

public class fileCraetion1 {
    public static void main(String[] args) throws IOException {

        File dir = new File("Test");
        // System.out.println(dir.isDirectory());
        dir.mkdir();
        System.out.println("dir is refring to:" + dir.isDirectory());

        File file = new File(dir, "Abhi.txt");
        file.createNewFile();
        System.out.println("File is refering to" + file.isFile());

    }
}
