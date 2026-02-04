class myClass {
  private int data;
  // private String name;

  int input(int data) {
    this.data = data;
    return this.data;
  }
  
  int display() {
    System.out.println("Data: " + data);
    return data;
  }


}
class EncapsulationTest{
  public static void main(String[] args) {
  
    myClass obj = new myClass();
    obj.input(5);
    obj.display(); 
  }
}