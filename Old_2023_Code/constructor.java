import java.util.jar.Attributes.Name;

class student {

	private int age;
	private String name;

    // constructor

    student(String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    // Constructor End


	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}
    
	public int getAge() {
		return age;
	}
}

public class constructor {
	public static void main(String[] args) 
    {
		student st = new student("Abhieee", 19);


	}
}