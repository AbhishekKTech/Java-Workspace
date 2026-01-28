class overloding{
    private int age;
    private String name;

    public overloding(){
        System.out.println("Null Constructoe called");
        this.name= "name";
        this.age= 19;
    }

    public overloding(String name){
        this.name = name;
        this.age = 18;
    }

    public overloding(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println(age);
        System.out.println(name);

    }
    
}
public class constructorOverloding{
    public static  void main (String[] args){
        overloding method = new overloding();
        method.display();

        overloding method1 = new overloding("abhieee");
        method1.display();

        overloding method2 = new overloding("abhieee", 29);
        method2.display();

    }
}