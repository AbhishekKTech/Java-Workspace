class Train {
  int availibleSeats = 1;

  public synchronized void bookSeat(String name) {
    if (availibleSeats > 0) {
      System.out.println("Booking is successful");
      availibleSeats--;
    } else {
      System.out.println("Sorry, No seats are available");
    }
  }
}

class BookingCounter implements Runnable {
  String name;
  Train t;

  BookingCounter(String name, Train t) {
    this.name = name;
    this.t = t;
  }

  public void run() {
    t.bookSeat(this.name);
  }
}
class synchronizedThrerading {
  public static void main(String[] args) {
    Train t = new Train();
    
    BookingCounter b1 = new BookingCounter("Abhishek", t);
    BookingCounter b2 = new BookingCounter("Rahul", t);
    Thread th1 = new Thread(b1);
    Thread th2 = new Thread(b2);
    th1.start();
    th2.start();
  }
}