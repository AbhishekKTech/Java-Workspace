
public class prectice {

//1. Write a program to demonstrate method overloading with 3 different parameters.

// static class calculator{
//     int add( int a, int b){
//     return  a+b;
//   };

//   int add( int a, int b, int c){
//     return  a+b+c;
//   };
//   int add( int a, int b, int c, int d){
//     return  a+b+c+d;
//   };
// }

//  public static void main(String[] args) {
//   calculator twoNum = new calculator();
//   calculator threeNum = new calculator();
//   calculator fourNum = new calculator();

//   System.out.println("sum of two parmanetr is : " + twoNum.add(5,10));
//   System.out.println("Sum of three parmanetr is : " + threeNum.add(5,10,15));
//     System.out.println("Sum of four parmanetr is : " + fourNum.add(5,10,15,20));
//     }


// ------------------------------
// 2. Write a program to create an object of an class which contain a method and call that class method in
// main method.

//     static class massage{
//     String greet(){
//         return "Hello, Good Morning!";
//     }
// }

// public static void main(String[] args) {
//     massage msg = new massage();
//     System.out.println(msg.greet());
// }

//-----------------------------
//3. Write a Java program to calculate the sum of all elements in an integer array?

// public static void main(String[] args) {
//     int numbr[] = {10,20,30,40,50};
//     int sum = 0;
//     for(int total : numbr){
//         sum = sum + total;
//     }
//     System.out.println("Sum of all elements in the array: " + sum);

//4. Write a Java program to find the index of a specific element in an integer array.
public static void main(String[] args) {
    int number[] = {10,20,30,40,50};
    int serchElment = 40;
    boolean found = false;
    for (int i = 0; i < number.length; i++){
        if (number[i] == serchElment){
            System.out.println("Index of " + serchElment + " is: " + i);
            found = true;
            break;
        }
    }
    if (!found){
        System.out.println("Element not found");
    }
}
}
