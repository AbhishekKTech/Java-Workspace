public class array_2d {
    
     public static void main(String[] args)
    {

        // int nums[][] = new int [3] [2];
        // nums[0][0] = 4;
        // nums[0][1] = 3;
        // nums[1][0] = 5;
        // nums[1][1] = 7;
        // nums[2][0] = 5;
        // nums[2][1] = 8;

        int nums[][] = 
        {
            {2,3},
            {8,2},
            {9,1}
        };

        for(int i=0; i<=2; i++)
        {
            for(int j =0; j<=1; j++)
            {
                System.out.print(nums[i][j] + " ");
            }
              System.out.println("");

        }
    }
}
