class Demo
{
    static void display1(){
        System.out.println("Statitc Method");
    }

    void display2(){
        System.out.println("Not Static Method");
    }
}
public class StaticMethod {
    public  static void main(String[] args){
        Demo.display1();

        Demo h = new Demo();
        h.display2();
        h.display2();
    }
}
