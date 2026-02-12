class OuterClass {
  int number = 19;

  //Member Inner class

  // class InnerClass{
  //   void dispaly() {
  //     System.out.println("The number is : "+ number);
  //   }
  // }

  // -------------------------------
  //Static Inner class

  static class InnerClass {
    void dispaly() {
      System.out.println("The number is : ");
    }
  }
}

public class InnerClassExample{
  public static void main(String[] args){

    OuterClass out = new OuterClass();
    // OuterClass.InnerClass in = out.new InnerClass();
    // in.dispaly();

    // OuterClass.InnerClass in = new OuterClass.InnerClass();
    // in.dispaly();

  }
}