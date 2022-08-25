package pck1;

public class Airthmatic1 {

	/////////////// FOR ADDITION ////////////////////////
	public int sum(int a, int b) {

		int c = a + b;

		return c;

	}

	////////////////// FOR SUBTRACTION ///////////////////////
	public int sub(int x, int y) {

		int z = x - y;
		return z;

	}

	////////////////////// FOR DIVISION ////////////////////////

	public int div(int p, int q)

	{

		int r = p / q;

		return r;
	}

	////////////////////// FOR MULTIPLICATIOM////////////////////////////

	public int mul(int m, int n) {
		int o = m * n;
		return o;
	}

	/////////////////////// MAIN METHOD
	/////////////////////// ///////////////////////////////////////////////
	public static void main(String[] args) {

		// CREATING OBJECTS
		Airthmatic1 obj = new Airthmatic1();

		// CALLING METHOD WITH THE HELP OF REFERANCE VARIABLE

		// DECLARE GLOBAL VARIABLE AND STORE THE VALUE

		// int addition= obj.sum(10, 2);

		System.out.println("PROBLEM  STATEMENT  FOR ASSIGNMENT 2 -- ((((10-2)+2)-2)*2)/2) ");
		// PRINT THE RESULT ADDION

		int subtract = obj.sub(10, 2);

		// PRINT THE RESULT OF SUBSTRACTION

		System.out.println(" RESULT OF SUBSTRACTION = " + subtract);

		int addition = obj.sum(subtract, 2);

		// PRINT THE RESULT OF Addition

		System.out.println(" RESULT OF ADDITION = " + addition);

		int subtract2 = obj.sub(addition, 2);

		//// PRINT THE RESULT OF SUBSTRACTION
		System.out.println(" RESULT OF SUBSTRACTION = " + subtract2);

		int multiplication = obj.mul(subtract2, 2);
		// PRINT THE MULTIPLICATIOM
		System.out.println(" RESULT OF MULTIPLICATION =" + multiplication);

	}
}
