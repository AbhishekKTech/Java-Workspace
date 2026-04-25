class orderAboveValueException extends Exception {
  public orderAboveValueException(String message) {
    super(message);
  }
}

class Zamato {
  void placeOrder(int orderValue) throws orderAboveValueException {
    if (orderValue < 100) {
      throw new orderAboveValueException("Order value is below the minimum 100");
    }
  }
}

public class customeExceptionExample {
  public static void main(String[] args) {
    Zamato z = new Zamato();
    try {
      z.placeOrder(50);
    } catch (orderAboveValueException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
