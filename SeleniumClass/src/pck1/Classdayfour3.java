package pck1;

public class Classdayfour3 {

	int kapil;

	public void m1(int kapil) {

		// Third Use of THIS keyword Calling the global variable when local variable and
		// global variable is the same name

		this.kapil = 23;

	}

	public static void main(String[] args) {

		Classdayfour3 obj = new Classdayfour3();

		obj.m1(123);

		System.out.println("Hi this is kapil" + obj);
	}
}
