class demo {
	public int i;
	private int j;
    

	public demo(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public void desply() {
		System.out.println(i);
		System.out.println(j);
	}

}

public class Constructor1 {
	public static void main(String[] args) {

        demo abhieee = demo();
		demo abhie = new demo(8, 7);

		abhie.desply();

	}
}