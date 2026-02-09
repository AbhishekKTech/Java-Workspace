// Polymophism method overloading
class calculator {
  int add(int a, int b) {
    return a + b;
  }

  int add(int a, int b, int c) {
    return a + b + c;
  }
}


public class poly {
    public static void main(String[] args) {
      
      calculator calc = new calculator();

      
      System.out.println("the sum of 2 and 3 number is: " + calc.add(2, 4));
      System.out.println("the sum of 2, 3 and 5 number is: " + calc.add(3, 4, 5));

    }
}