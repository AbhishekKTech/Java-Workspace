class Human{

    int age;
    void sleep(){
        age=18;
        System.out.println("Humans needs a good sleep");
        System.out.println(age);

    }

}

class Student extends Human{

}

class inheritance {
    public static void main(String[] args){

        Student st1 = new Student();
        st1.sleep();
    }
}