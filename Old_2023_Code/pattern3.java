public class pattern3 {
    public static void main(String[] args)
    {
        // H Pattern 
        int n=5;

        for(int i=0; i<5; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(j==0 || j == 4 || i == (n-1)/2 )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
