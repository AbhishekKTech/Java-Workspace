class trickyCodeinnar {
  int trickyCode(int n) {
    for(int i = 1; i <= n; i *= 2) {
      for(int j = 1; j <= n; j += i) {
        // do some O(1) operation
      }
    }
    return 0;
  }
}

public class trickyCode {
    public static void main(String[] args) {
        int n = 16; // Example input
        trickyCodeinnar obj = new trickyCodeinnar();
        int result = obj.trickyCode(n);
        System.out.println("Result: " + result);
    }
}