public class SimpleStackTrace {
    public static void main(String[] args) {
        try {
            int a = 50 / 0; // Error!
        } 
        catch (ArithmeticException e) {
            // THE SHORTCUT: Yeh ek line pura cctv footage (error details) print kar degi!
            e.printStackTrace(); 
        }
    }
}