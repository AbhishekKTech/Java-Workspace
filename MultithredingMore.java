class MovieThred implements Runnable {
  public void run() {
    System.out.println("Thred 1: Movie is downloading");
    try{
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      System.out.println("Thred 2: Movie is fully downloaded");
    }
  }
}

public class MultithredingMore {
  public static void main(String[] args) {
    MovieThred t = new MovieThred();
    Thread t1 = new Thread(t);
    System.out.println("Main: Is movie still downloading? " + t1.isAlive());
    t1.start();
    System.out.println("Main: Is movie still downloading? " + t1.isAlive());

    try{
      t1.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Download is complete");

  }
  
}
