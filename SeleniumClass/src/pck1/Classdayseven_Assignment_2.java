package pck1;

import java.util.Scanner;

public class Classdayseven_Assignment_2 extends Classdayseven_Assignment_1 {

	/*
	 * ((((a1*a2)+a3)+a4)-a5)/a6)
	 * 
	 * */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Assignement 2 :   ((((a1*a2)+a3)+a4)-a5)/a6)  ");
		
		System.out.println("Enter No A1");
		int a = sc.nextInt();

		System.out.println("Enter No A2");
		int b = sc.nextInt();

		System.out.println("Enter No A3");
		int c = sc.nextInt();

		System.out.println("Enter No A4");
		int d = sc.nextInt();

		System.out.println("Enter No A5");
		int e = sc.nextInt();

	  System.out.println("Enter No A6");
	   int f = sc.nextInt();
		
		
		/*   Assignment 2   
		 * ((((a1*a2)+a3)+a4)-a5)/a6)
		 * 
		 * */
		Classdayseven_Assignment_1 assign2= new Classdayseven_Assignment_1();
		
		int mulitplication = assign2.mul(a, b);
		
		System.out.println("Muliplication of Two no"+mulitplication);
		
		int addition = assign2.sum(mulitplication, b);
		
		System.out.println("Addition into existing number "+addition);
		
        int addition1 = assign2.sum(addition, c);
		
		System.out.println("Addition into existing number "+addition1);
		
        int Substraction = assign2.sub(addition1, d);
		
		System.out.println("Substraction from existing number "+Substraction);
		
		float division=assign2.div(Substraction, e);
		
		System.out.println("Division result "+division);
	
		
	    
		
	}
	
	
	
}
