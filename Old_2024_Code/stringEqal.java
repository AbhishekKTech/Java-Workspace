public class String1 {
    public static void main(String[] args){

        //-------------inmutable strig -------------

        String brand = ("Mc Donlads");    

        StringBuilder brand1 = new StringBuilder("Mc Donlads");   // it will save in same heap outshide Scp memory and shows false


        if(brand == brand1)  // ------( == oprator ) use to compaere string 
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
