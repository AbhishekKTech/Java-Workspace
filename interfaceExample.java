// EXAMPLE OF INTERFACE IN JAVA WITH UNIVERSAL REMOTE CONTROL
interface RemoteControl {
  void display(); // Interface Method for display the Remote control

  void on(); // Interface Method for on the device
}

class TV implements RemoteControl{
  public void display() {
    System.out.println("TV Remote control");

  }

  public void on() {
    System.out.println("TV is on now");

  }
}

class AC implements RemoteControl{
  public void display() {
    System.out.println("AC Remote control");

  }

  public void on() {
    System.out.println("AC is on");
  }
}


public class interfaceExample {
  public static void main(String[] args) {
    TV tvremote = new TV();
    tvremote.display();
    tvremote.on();

    AC acRemote = new AC();
    acRemote.display();
    acRemote.on();
  }
}
