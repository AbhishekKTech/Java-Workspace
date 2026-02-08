class Constructor {
  Constructor() {
    this(40);
    System.out.println("This is the default constructor");
  }

  Constructor(String name) {
    System.out.println("This is the parameterized constructor with name: " + name);
  }

  Constructor(int age) {
    this("Jagdish");
    System.out.println("This is the parametrized constructor with inters input age: " + age);
  }

  Constructor(String name, int age) {
    System.out.println("This is the parameterized constructor with name: " + name + " and age: " + age);
  }
}

public class ConstructorOverloading {
  public static void main(String[] args) {
    Constructor c1 = new Constructor();
    Constructor c2 = new Constructor("Abhishek Sharma");
    Constructor c3 = new Constructor(25);
    Constructor c4 = new Constructor("Abhishek Sharma", 25);
  }
}
