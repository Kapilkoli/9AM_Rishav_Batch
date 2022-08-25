package pck1;

import java.util.Scanner;

public class Classdayseven_Assignment_1 {

	/////////////// FOR ADDITION ////////////////////////
	public int sum(int a, int b) {

		int c = a + b;

		return c;

	}

	////////////////// FOR SUBTRACTION ///////////////////////
	public int sub(int a, int b) {

		int z = a - b;
		return z;

	}

	////////////////////// FOR DIVISION ////////////////////////

	public int div(int a, int b)

	{

		int r = a / b;

		return r;
	}

	////////////////////// FOR MULTIPLICATIOM////////////////////////////

	public int mul(int a, int b) {
		int o = a * b;
		return o;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A1");
		int a = sc.nextInt();

		System.out.println("Enter A2");
		int b = sc.nextInt();

		System.out.println("Enter A3");
		int c = sc.nextInt();

		System.out.println("Enter A4");
		int d = sc.nextInt();

		System.out.println("Enter First No A5");
		int e = sc.nextInt();

		System.out.println("Enter First No A6");
		int f = sc.nextInt();

		Classdayseven_Assignment_1 test = new Classdayseven_Assignment_1();

		/*
		 * Assignment1 ((((a1+a2)+a3)*a4)-a5)/a6)
		 */
		int addition = test.sum(a, b);

		System.out.println("Addition of Two no Numbers " + addition);

		int sum1 = test.sum(addition, c);

		System.out.println("Addition new Number into existing no " + sum1);
		
		int multi = test.mul(sum1, d);
		
		System.out.println("Mulitiply by new number "+multi);

	    int substract =test.sub(multi, e);
	    		
	    		System.out.println("Substract by new number"+substract);		
		
		float division=test.div(substract, f);
	    System.out.println("Divide by new number"+division);
	    
	    
	
	}

}
