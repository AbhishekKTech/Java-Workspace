class ExceptionHandlingExample {
      int a = 2;
      int b = 0;
      int c;
      int arr[] = { 2, 4, 5, 2, 5 };

  void display() {
    try {
      c = a / b;
      System.out.println(c);
      System.out.println(arr[6]);
    } catch (ArithmeticException e) {
      System.out.println("Don't divide by zero");
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array index value is out of bounds");
    }
    finally {
      System.out.println("Execution completed");
    }

  }
}
public class ExceptionHandling {
  public static void main(String[] args) {
    ExceptionHandlingExample ex = new ExceptionHandlingExample();
    ex.display();
  }
}
