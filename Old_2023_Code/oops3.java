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

    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
        this.gander = s2.gander;
    }

    Student(){

    }

}

public class oops3 {
    public static void main(String[] args){

        Student s1 = new Student();
        s1.name ="Abhishek";
        s1.age = 19;

        Student s2 = new Student(s1);
        s2.printinfo();
        s2.printgander();
    }
}
