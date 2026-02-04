class Student {
  private String name;
  private int rollNo;

  // Constructor to initialize the name and rollNo
  Student(String name, int rollNo) {
    this.name = name;
    this.rollNo = rollNo;
  }
  
  // Getters for name and rollNo
  public String getName() {
    return name;
  }
  
  public int getRollNo() {
    return rollNo;
  }
}

public class ConstructorExample {
  public static void main(String[] args) {
    Student s1 = new Student("Abhishek Sharma", 115); // Object creation and passing the values to the constructor
    System.out.println("The name is : " + s1.getName());
    System.out.println("The Roll No is : " + s1.getRollNo());
  }  
}
