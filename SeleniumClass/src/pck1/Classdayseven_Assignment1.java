package pck1;

import java.util.Scanner;

public class Classdayseven_Assignment1 {

	/*
	 * Assignment1 ((((a1+a2)+a3)*a4)-a5)/a6)
	 */

	public static void main(String[] args) {

		int a, b, c, d;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the First No :");
		a = sc.nextInt();
		System.out.println(+a);
		System.out.println("Enter the Second No :");
		b = sc.nextInt();

		System.out.println(+b);

		int addition = a + b;
		System.out.println("Addtion of first two no is :" + addition);

		System.out.println("Adding no into existing sum :");
		c = sc.nextInt();
		int sum = addition + c;

		System.out.println("Adding no into existing sum :" + sum);

		System.out.println("Multiply new no with existing sum :");
		d = sc.nextInt();
		int multi = sum * d;

		System.out.println("Mulitplication with existing sum :" + multi);
		
		System.out.println("Subract new no from existing no :" + multi);
		int s=sc.nextInt();
		int sub=multi-s;
		System.out.println("Substraction from existing no is :"+sub);
		
		
		System.out.println("Divide by new no with existing value");
		float p=sc.nextInt();
		float div=sub/p;
		System.out.println("Substraction from existing no is :"+div);
		

	}
}
