import java.io.*;

class Student implements Serializable {
  private String name;
  private int age;
  private String address;

  public Student(String name, int age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }

  @Override
  public String toString() {
    return "Student{name='" + name + "', age=" + age + ", address='" + address + "'}";
  }
}

public class serialaztion {
  public static void main(String[] args) throws Exception {
    Student st = new Student("Abhishek", 19, "Noida");

    // Corrected the file name and the type of the second argument
    FileOutputStream fos = new FileOutputStream("File.txt");
    // ObjectOutputStream oos = new ObjectOutputStream(fos);
    BufferedOutputStream oos = new BufferedOutputStream(fos);
    oos.writeObject(st);
    oos.flush();
    oos.close();

  }
}
