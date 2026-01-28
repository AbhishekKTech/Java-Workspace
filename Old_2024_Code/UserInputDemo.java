import java.util.*;  
class UserInputDemo   
{  
public static void main(String[] args)  
{  
Scanner s = new Scanner(System.in);    //System.in is a standard input stream  
System.out.print("Enter first number- ");  
int a= s.nextInt();  
System.out.print("Enter second number- ");  
int b= s.nextInt();  
System.out.print("Enter third number- ");  
int c= s.nextInt();  
int d=a+b+c;  
System.out.println("Total= " +d);  
}  
}