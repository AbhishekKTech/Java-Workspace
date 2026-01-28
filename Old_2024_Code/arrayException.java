public class arrayException {
    public static void main(String[] args){
        int nums[] = {7,5,2,8,4};

        // System.out.println(nums[5]); // 5 will show the the Error:ArrayIndexOutOfBoundsException
        System.out.println("Hiii");

        // for(int i=0; i<nums.length; i++)
        // {
        //     System.out.println(nums[i]);
        // }


//--------Enhanched for loop --------

        for( int n : nums)
        {
            System.out.println(n);
        }



    }
}
