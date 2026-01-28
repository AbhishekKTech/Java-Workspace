class hello 
{ 
	static int a;
	static int b;
	  
	int m;
	int n;

	static { 
			System.out.println("it is static" +" ");
			a=10;
			b=20;
		}
		{
			System.out.println("it is called non access-modifier");
			m=30;
			n=40;
 		}

  		static void display1()
		{ 
			System.out.println(a);

	 		System.out.println(b);
		} 
	 	void display2()
		{ 
			System.out.println(m);
			System.out.println(n); 
		}
		}

public class test{
	 public static void main(String[] args) {
		hello d = new hello();
		
		hello.display1();

		d.display2(); 
	} 
	}