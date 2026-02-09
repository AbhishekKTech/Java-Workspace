// polymorphism Method overriding
class animal {
  void sound() {
    System.out.println("Animal makes a sound");
  }

  void walks(int a) {
    System.out.println("Animal walks " + a + " steps");
  }
}

class dog extends animal {
  void sound() {
    System.out.println("Dog barks");
  }

  void walks (int a){
    System.out.println("Dog walks " + a + " steps");
  }
}

public class polyoverriding {
  public static void main(String[] args) {

 animal myAnimal = new animal();
 animal myDog = new dog();

    myAnimal.sound(); // Output: Animal makes a sound
    myDog.sound();    // Output: Dog barks
    myAnimal.walks(10); // Output: Animal walks 10 steps
    myDog.walks(6);    // Output: Dog walks 6 steps
  }
}