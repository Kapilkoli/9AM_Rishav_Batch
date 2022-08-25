package pck1;

public class Swift extends Maruti {

	/*
	 * What is the rule of overriding
	 * 
	 * 1) in the child class method name should be same
	 * 
	 * 2) method inputs data type should be same
	 * 
	 * 3) method output should be same
	 */

	public void carmodel() {

		System.out.println("This is model of TATA car and Model no is SAFARI CLASS A");
	}

	public void carcolors() {

		System.out.println("This is in black color");
	}

	public static void main(String[] args) {

		Swift dp = new Swift();

		// dp.carmodel();

		// dp.carcolors();
		dp.carprice();
		dp.baseprice = 100;

		System.out.println(+dp.baseprice);

	}
}
