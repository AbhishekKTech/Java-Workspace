public class jagged {
    
     public static void main(String[] args)
    {
        int nums[][] = 
        {
            {2,3,5,7,2},
            {8,2},
            {9,1,6}
        };

        for(int i=0; i<=2; i++)
        {
            for(int j =0; j<nums[i].length; j++)
            {
                System.out.print(nums[i][j] + " ");
            }
              System.out.println("");

        }
    }
}
