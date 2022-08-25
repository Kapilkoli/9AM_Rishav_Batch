package pck1;

public class Classdaythree2 {

	/*
	 * Assignment2----(using this keyword) Assignment2----(using this keyword)
	 * Output should be in the below sequence three parameterized method default
	 * method four parameterized method one parameterized method two parameterized
	 * method
	 * 
	 */
	void DefaultMethod() {
		this.ThreeParaMethod(5, 7, 7);

		System.out.println("This is default Method ");

		this.FourParaMethod(5, 6, 4, 20);

		this.SingleParaMethod(43);
	}

	void SingleParaMethod(int a) {

		System.out.println("This is Single parameter Method ");

		this.TwoParaMethod(23, 43);
	}

	void TwoParaMethod(int a, int b) {

		System.out.println("This is Two parameter Method ");

	}

	void ThreeParaMethod(int a, int b, int c) {

		System.out.println("This is Three parameter Method ");

	}

	void FourParaMethod(int a, int b, int c, int d) {

		System.out.println("This is Four parameter Method ");

	}

	public static void main(String[] args) {

		Classdaythree2 obj1 = new Classdaythree2();

		obj1.DefaultMethod();

	}
}
