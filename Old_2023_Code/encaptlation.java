class Student
{
    private int age;
    private String name;

    public void feature()
    {
        name = ("abhishek");
        System.out.println("Hiii " + name);
    }

    public void feature2()
    {
        age = 19;
        System.out.println("Your age is " + age);

    }
}

public class encaptlation {

    public static void main(String[] ars){
        Student obj = new Student();

        Student obj1 = new Student();
        

        obj.feature();
        obj1.feature2();
    }
}
