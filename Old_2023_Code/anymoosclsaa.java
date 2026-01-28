interface rocket
{
    void fly();
}

public class anymoosclsaa {
 public static void main(String[] args) {
    rocket obj = new rocket() 
    {
        public void fly()
        {
         System.out.println("Flying..");
        }  
    };

    obj.fly();

    } 
}