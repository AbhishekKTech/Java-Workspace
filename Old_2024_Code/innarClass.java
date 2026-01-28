class a{
    void upaarClass(){
    System.out.println("a");
    }

    static class b{
        void innarclass(){
            System.out.println("b");
        }
    }
}
public class innarClass {
    public static void main(String[] arsg){
        a up = new a();

        a.b up1 = new a.b();
        
        up.upaarClass();
        up1.innarclass();
    }
}
