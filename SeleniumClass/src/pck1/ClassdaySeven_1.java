package pck1;

import java.util.Scanner;

public class ClassdaySeven_1 {

	public static void main(String[] args) {

		int empcode ;
		String empname;
		long mobilenumber;
		
		//double phone;
		
		// Initializing scanner class 

		Scanner sc = new Scanner(System.in);
		// Getting Employee details 
		System.out.println("Enter your employee code :");
		empcode = sc.nextInt();
		
		  
		System.out.println("Enter your Name: ");
	    
	    empname = sc.next();
	    
	    
	    mobilenumber=sc.nextLong();
	    
	    
	    // Printing Employee Details 
	    System.out.println("Your Employee Code is :" + empcode);

	    System.out.println("Your name is :" +empname);
	  
	   
	    
	    
	    
		
	}

}
