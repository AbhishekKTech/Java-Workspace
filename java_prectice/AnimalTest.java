package java_prectice;

abstract class Animal {
  void Sound() {
    System.out.println("Animal makes a sound");
  }
}

class Dog extends Animal {
  void Sound()
  {
    System.out.println("Dog Barks");
  }
}

public class AnimalTest{
 public static void main(String[] args) {
    Animal a1 = new Dog();
    a1.Sound();
  }
}
