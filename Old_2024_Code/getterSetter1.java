class student {
	private int age;
	private String name;

	public void setName(String name) {
		this.name = name;
	}

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
public class getterSetter1 {
    	public static void main(String[] args) {
		student st = new student();
		st.setName("Abhieee");
		st.setAge(19);
		System.out.println(st.getAge() + " " + st.getName());
	}
}
