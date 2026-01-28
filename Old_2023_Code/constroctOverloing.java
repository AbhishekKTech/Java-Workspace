class constroctor {

    private int age;
    private String name;
    
    public constroctor(){
    
    System.out.println("Defalt Constotor are called");
    this.name = "Rohan";
    age = 18;
    }
    
    public constroctor(String name){
    this.name = "Ravi";
    this.age = 16;
    
    }
    
    public constroctor( String name, int age){
    this.name = "Rony";
    this.age = 26;
    }
    
    public void display(){
    System.out.println(name);
    System.out.println(age);
    }
    }
    
    
    public class constroctOverloing {
    public static void main(String[] args){
    
    constroctor St1 = new constroctor();
    St1.display();
    constroctor St2 = new constroctor("Nisa");
    St2.display();
    constroctor St3 = new constroctor("Janhavi", 20);
    St3.display();
    }
    }