package pck1;

public class Classdaysix2 extends Classdaysix1 {

	public Classdaysix2() {

		System.out.println("This is child defualt consturctor ");
	}

	public Classdaysix2(int a)

	{
		super(34);
		System.out.println("This is child one parameterized consturctor ");
	}

	public Classdaysix2(int a, int b) {

		System.out.println("This is child two parameterized consturctor ");
	}

	public Classdaysix2(int a, int b, int c) {

		System.out.println("This is child three parameterized consturctor ");
	}

	public static void main(String[] args) {

		Classdaysix2 obj = new Classdaysix2();
		Classdaysix2 obj1 = new Classdaysix2(23);

	}

}
