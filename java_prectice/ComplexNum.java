package java_prectice;

class Complex {
  double real;
  double imaginary;

  Complex() {
    this.real = 0;
    this.imaginary = 0;
  }

  Complex(double real, double imaginary) {
    this.real = real;
    this.imaginary = imaginary;
  }

  void display() {
    if (imaginary >= 0) {
      System.out.println(real + " + " + imaginary + "i");
    } else {
      System.out.println(real + " - " + Math.abs(imaginary) + "i");
    }
  }
}

public class ComplexNum {
  public static void main(String[] args) {
    Complex c1 = new Complex();
  }
}

