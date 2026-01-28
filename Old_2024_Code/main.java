
class student {
    private int age;
    private String city;
    private String name;

    public student(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String toString() {
        return "age:" + age + "|name :" + name + "| city :" + city;
    }
}

class main {
    public static void main(String[] args) {
        student st1 = new student("abhishek", 3, "noida");

        System.out.println(st1);

        student st2 = new student("ravi", 30, "delhi");

        System.out.println(st2);

    }
}