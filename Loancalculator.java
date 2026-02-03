import java.util.Scanner;

public class Loancalculator {

    static class farmar{
        int loanamount;
        int duaration;
        float interest = 7.5f;

        void input(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the loan ammount: " );
            loanamount = sc.nextInt();
            System.out.println("Enter the duaration:");
            duaration = sc.nextInt();
            
        }

        void calculate(){
            interest = ( loanamount * duaration * interest )/100;
            
        }

        void display(){
            System.out.println("The interest is: " + interest);
        }
    }
    
    public static void main (String[] args){
        farmar f1 = new farmar();
        farmar f2 = new farmar();

        f1.input();
        f1.calculate();
        f1.display();
        f2.input();
        f2.calculate();
        f2.display();
    }
}
