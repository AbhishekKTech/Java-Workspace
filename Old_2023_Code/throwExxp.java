import java.rmi.server.ExportException;

class Demo{

    public void a(){
        try{
        b();
        }

        catch(Exception vv){
            System.out.println("Eroor");
        }

    }

    public void b() throws Exception{
        int a = 61; 
        int b = 0; 
        int result = a / b; 
        System.out.println(result);
    }
} 
public class throwExxp {
    public static void main(String[] args){
        a obj = new a();
        obj.a()
    }
}
