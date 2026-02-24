package DSA;

public class palindromeExample {
  static boolean isPaliandrome(int arr[]){
    int start=0;
    int end=arr.length-1;
    while(start<end){
      if(arr[start]!=arr[end]){
        return false;
      } 
      start++;
      end--;
    }
    return true;
  }

  public static void main(String[] args) {
    boolean isPaliandrome = isPaliandrome(new int[]{2, 3, 4, 3, 2});
    System.out.println(isPaliandrome);
  }
}
