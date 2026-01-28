public class FinaLinharitance{
    public static void main(String[] args){
        animal s1 = new Sheep();

        s1.Sleep();
    }
}


 class animal{
    final int age = 19;
     void Sleep() //Method
    {
        System.out.println("Sleeping...");
        System.out.println(age);
    }
}

class Sheep extends animal{
    // void Sleep(){
    //     System.out.println("Sheep Seeping");
    // }
}

