class Employee{
  private String name;
  private int id;

  //Setter for name and id

  public void setName(String name) {
    this.name = name;
  }

  public void setId(int id) {
    this.id = id;
  }

  //Getter for name ans id
  public String getName() {
    return name;
  }

  public int getId() {
    return id;

  }
}
public class GetterSetterExample {
  public static void main(String[] args) {
    Employee emp = new Employee();


    // Step 1: Set value to setters
    emp.setName("Abhishek Sharma");
    emp.setId(115);

    // Step 2: Get value from getters
    System.out.println("Employee Name: " + emp.getName());
    System.out.println("Employee Id: " + emp.getId());
  }
}
