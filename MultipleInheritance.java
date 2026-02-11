interface Father {
  void hight();
}

interface Mother {
  void color();
}

class Child implements Father, Mother {
  public void hight() {
    System.out.println("Child hight is 5.9 Ft");
  }

  public void color() {
    System.out.println("child color is fair");
  }
}


public class MultipleInheritance{
  public static void main(String[] args) {
    Child abhishek = new Child();
    abhishek.hight();
    abhishek.color();
  }
}