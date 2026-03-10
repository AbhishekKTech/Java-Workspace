package java_prectice;

class Example {

  void display()
  {
    System.out.println("HEllo");
  }

  void display(int x, int y)

  {
    System.out.println("Addition is :"+ x+y);
  }
}

public class metodOverload {
  public static void main(String[] args) {
    //Method overloading example
    
    Example s1 = new Example();

    s1.display();
    s1.display(1, 3);

  }
}
