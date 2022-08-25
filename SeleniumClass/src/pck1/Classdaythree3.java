package pck1;

public class Classdaythree3 {

	Classdaythree3() {

		this(5, 3);
		System.out.println("This is default parameter consturctor");

	}

	Classdaythree3(int a) {

		System.out.println("This is single parameter consturctor");

	}

	Classdaythree3(int a, int b) {

		this(1);

		System.out.println("This is Two parameter consturctor");

	}

	public static void main(String[] args) {

		Classdaythree3 vp = new Classdaythree3();
	}
}
