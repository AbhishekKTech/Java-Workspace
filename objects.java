class calc {
    public int add(int n1, int n2){
        int res = n1 + n2;
        return res;
    }

    public int max(int m1, int m2){
        if (m1 > m2) {
            return m1;
        }else{
            return m2;
        }
    }

    
}

public class objects {
    public static void main(String []args){
        calc obj = new calc();
        int add = obj.add(11, 3);
        System.out.println("Sum is " + add);

        int max = obj.max(4, 3);
        System.out.println("max is "+max);
    }
}
