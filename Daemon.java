// 1. The Background Helper Thread
class AutoSaveThread extends Thread {
    public void run() {
        // Infinite loop! It wants to run forever.
        while (true) { 
            System.out.println("Daemon: Auto-saving document in background...");
            try {
                Thread.sleep(500); // Pauses for half a second
            } catch (Exception e) {}
        }
    }
}

// 2. The Main Program
public class Daemon {
    public static void main(String[] args) {
        
        AutoSaveThread backgroundTask = new AutoSaveThread();
        
        // ⭐ THE MOST IMPORTANT LINE ⭐
        backgroundTask.setDaemon(true); // Making it a Daemon thread BEFORE starting
        
        backgroundTask.start();

        // Main Thread doing its work (Simulating typing for 2 seconds)
        System.out.println("Main: User is typing the document...");
        try {
            Thread.sleep(2000); 
        } catch (Exception e) {}
        
        // Once Main reaches here and ends, the JVM will ruthlessly kill the infinite Daemon thread!
        System.out.println("Main: Typing finished. Closing MS Word now!");
    }
}