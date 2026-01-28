import java.util.Scanner;

// Compaile Steps -- 
// 1. Onpen Terminl 
// 2. javac FileName.java
// 3. java FileName 

class tryCatch{
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        try{

            int num = myObj.nextInt();  // Read user input
            System.out.println("Username is: " + num);

            }
        catch(Exception ee){

            System.out.println("Somting want wrong");
        }

        finally{
            myObj.close();
        }
    }
}