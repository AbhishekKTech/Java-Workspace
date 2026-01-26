class calculatr {
    int add(int a, int b){
        return a+b;}
    
    int add( int a , int b, int c){
        return a+b+c;
    }
    double add(double a, double b){
        return a+b;
    }
    
}

public class MethodOverloading {
    public static void main(String []args){
        calculatr calc = new calculatr();

        int res = calc.add(2, 3);
        int res1 = calc.add(2, 7, 8);
        double res2 = calc.add(2.3, 3.7);
        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);
    }
}
