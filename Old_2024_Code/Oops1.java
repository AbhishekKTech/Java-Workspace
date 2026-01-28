class Student {
    String name;
    int age;
    String gander;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void printgander(){
        System.out.println(this.gander);
    }

    Student(String name, int age, String gander){
        this.name = name;
        this.age = age;
        this.gander = gander;
    }
}


public class Oops1 {
    public static void main(String[] args){

        Student s1 = new Student("ankit", 22, "Male");

        s1.printinfo();
        s1.printgander();
    }
}
