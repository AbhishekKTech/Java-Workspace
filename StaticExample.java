public class StaticExample {
    int count = 0;        // Will get memory every time new object is created
    static int sharedCount = 0; // Will get memory only ONCE

    StaticExample() {
        count++;
        sharedCount++;
    }

    void show() {
        System.out.println("Count: " + count + " | SharedCount: " + sharedCount);
    }

    public static void main(String[] args) {
        StaticExample s1 = new StaticExample();
        s1.show(); 
        
        StaticExample s2 = new StaticExample();
        s2.show(); 
        
        StaticExample s3 = new StaticExample();
        s3.show();
    }
}