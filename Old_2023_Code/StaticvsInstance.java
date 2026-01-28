
class StaticNonstatic{
    static int a;
    static int b;
   
    static
    {
        System.out.println("Static Block");
        a = 87;
        b = 6;
    }

    int m;
    int n;

    {
        System.out.println("Intance Varible");
        m= 344;
        n=83;
    }
}
public class StaticvsInstance {
    public static void main(String[] args){
        
        StaticNonstatic a1 = new StaticNonstatic();
        StaticNonstatic a2 = new StaticNonstatic();

    }
}
