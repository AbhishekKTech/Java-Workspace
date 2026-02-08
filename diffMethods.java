class Animal {
  void eat() {
    System.out.println("This animal eats food");
  }

  void walk() {
    System.out.println("This animal walks");
  }

  void sleep() {
    System.out.println("This animal sleeps");
  }
}

class Dog extends Animal {
  void bark() {
    System.out.println("This dog barks");
  }

  // This method overrides the eat method of the Animal class
  void eat() {
    System.out.println("This dog eats dog food");
  }

  void sleep(int hours) {
    System.out.println("This dog sleeps in a kennel");
  }
}

public class diffMethods{
  public static void main(String[] args) {
    Dog d1 = new Dog();
    d1.eat(); // This will call the eat method of the dog class
    d1.walk(); // This will call the walk method of the Animal class
    d1.sleep(); // This will call the sleep method of the Animal class
    d1.sleep(8); // This will call the sleep method of the dog class
    d1.bark(); // This will call the bark method of the dog class
  }
}
