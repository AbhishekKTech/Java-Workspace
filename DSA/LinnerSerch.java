package DSA;
class Search {
  public int search(int arr[], int n, int find) {
    for(int i = 0; i < n; i++) {
      if (arr[i] == find) {
        return i;
      }
    }
    return -1;
  }
}

public class LinnerSerch {
  public static void main(String[] args) {
    int arr[] = {1, 3, 4, 5, 3, 1};
    int find = 5;
    Search S1 = new Search();

    int result = S1.search(arr, arr.length, find);
    if (result == -1) {
      System.out.println("Element not found in the array");
    } else {
      System.out.println("Element found in the array at index: " + result);
    }
  }
}
