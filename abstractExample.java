abstract class a {
  void display() {
    System.out.println("hellow world");
  }

  abstract void show();
}

class b extends a
{
  void show()
  {
    System.out.println("welcome to java"); // implemantion from the abstract class a
  }

  void display() {
    System.out.println("welcome to marsh "); // overriding the method from the abstract class a
  }
}

public class abstractExample {
  public static void main(String[] args){

    // a obj1 = new a();This will give an eroor abstreact class cannot be create a object becuse of the abstaect class 
    

    b obj = new b();
    obj.display(); // calling the display method from class b
    obj.show(); // calling the show method from class b


    a obj2 = new b(); // we can create a reference of the abstract class and assign it to the child class object 

    obj2.display(); // calling the display method from class b using the reference of class a
    obj2.show(); // calling the show method from class b using the reference of class a
  }
}
