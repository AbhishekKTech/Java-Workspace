import java.io.*;

class Student implements Serializable {
  private static final long serialVersionUID = 1L;

  private String name;
  transient private int age;
  private String address;

  public Student(String name, int age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }

  public void display() {
    System.out.println(name);
    System.out.println(age);
    System.out.println(address);
  }
}

public class Deserializatin {
  public static void main(String[] args) throws Exception {
    // Serialization
    Student student = new Student("Abhishek", 19, "Noida");
    FileOutputStream fos = new FileOutputStream("File.txt");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    BufferedOutputStream bos = new BufferedOutputStream(oos);
    oos.writeObject(student);
    bos.close();

    // Deserialization
    FileInputStream fis = new FileInputStream("File.txt");
    ObjectInputStream ois = new ObjectInputStream(fis);
    BufferedInputStream bis = new BufferedInputStream(ois);
    Student deserializedStudent = (Student) ois.readObject();
    bis.close();

    // Displaying deserialized data
    deserializedStudent.display();
  }
}
