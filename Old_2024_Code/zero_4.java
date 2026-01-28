public class zero_4{
    public static void main(String[] args) {
        int[] arr = {10, 5, 7, 12, 20, 15};
        int elementToFind = 20;

        int index = -1;
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == elementToFind)
            {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element " + elementToFind + " found at index: " + index);
        } else {
            System.out.println("Element " + elementToFind + " not found in the array.");
        }
    }
}
