class Animal
{
    int age;
    void sleep()
    {
        System.out.println("Animal sleep");
    }
}

class tiger extends Animal{

    {
        System.out.println("Constroctor");
    }

}

class monkey  extends tiger{

}

class mouse extends monkey{

}
public class inharitancnc1 {
    public static void main(String[] args){

    mouse m1 = new mouse();
    m1.sleep();
    }
}
