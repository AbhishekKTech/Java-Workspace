package DSA;

public class ReverseArray {
  static int arr[] = { 1, 2, 3, 4, 5 };

  public static void reverseLogic(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;

      start++;
      end--;
    }
  }

  public static void main(String[] args) {
    reverseLogic(arr);

    System.out.print("Reversed Array:");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
