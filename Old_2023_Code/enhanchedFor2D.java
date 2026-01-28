public class enhanchedFor2D {
    public static void main(String[] args)
    {
        int nums[][] = 
        {
            {2,3,4,4},
            {8,2,5,6},
            {9,1,3,6}
        };

        for(int a[] : nums)
        {
            for(int b : a)
            {
                System.out.print(b + " ");
            }

            System.out.println(" ");
        }
    }
}
