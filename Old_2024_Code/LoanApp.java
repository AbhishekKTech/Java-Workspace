import java.util.Scanner;

class farmer {

	int ammount;
	int time;
    static float rateIntrest = 4.7f;
	float si;

	

	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("How Much ammount you need: ");
		 ammount = scan.nextInt();
		System.out.println("Time Duration: ");
		 time = scan.nextInt();
		
	}

	public void calculate() {
		si = (ammount * time * rateIntrest) / 100;
	}

	public void display() {
		System.out.println("Simple intrest is: " + si);
	}

};

public class LoanApp {
	public static void main(String[] args) {
		farmer f1 = new farmer();
		farmer f2 = new farmer();

		f1.input();
		f1.calculate();
		f1.display();
	}
}