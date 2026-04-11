// class myThred extends Thread {
//   public void run() {
//     System.out.println("Thred is runing");
//   }
// }

class task implements Runnable
{
  public void run() {
    try{
      System.out.println("Thred is runing");
    }
   catch(Exception e)
   {
    System.out.println(e);
   }
  }
}

public class Multithreading {

  public static void main(String[] args) {
    
      task t = new task();
      Thread t1 = new Thread(t);
      t1.start();
  }

}
