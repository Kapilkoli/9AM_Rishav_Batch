package pck1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Airthmetic {

	/// Writer the program for   CCCC10+2)+2)-2)*2)/2)
	
	
	/////////////// FOR ADDITION ////////////////////////
	public int sum(int a,int b)
	{
		
		int c= a+b;
		
		return c;
		
	}
	
	////////////////// FOR SUBTRACTION ///////////////////////
	public int sub(int x,int y)
	{
		
		int z=x-y;
		return z;
		
	}
	
	////////////////////// FOR DIVISION ////////////////////////
	
	public int div(int p,int q)
	
	{
		
		int r=p/q;
		
		return r;
	}

    ////////////////////// FOR MULTIPLICATIOM////////////////////////////
	
	public int mul(int m,int n)
     {
     int o=m*n;
     return o;
     }
    
	///////////////////////MAIN METHOD ///////////////////////////////////////////////
     public static void main(String[] args) {
		
    	 // CREATING OBJECTS 
    	 Airthmetic obj=new Airthmetic();
    	 
    	 //CALLING METHOD WITH THE HELP OF REFERANCE VARIABLE 
    	 
    	 // DECLARE GLOBAL VARIABLE AND STORE THE VALUE 
    	 
    	 int addition= obj.sum(10, 2);
    	 
    	 System.out.println("PROBLEM  STATEMENT  FOR ASSIGNMENT 1------- ((((10+2)+2)-2)*2)/2) ");
    	 
    	 // PRINT THE RESULT ADDION 
    	 System.out.println(" RESULT OF ADDITION = "+addition);
    	 
    	  int addnew=obj.sum(addition,2);
    	  
    	  // PRINT THE RESULT ADDITION
    	 
    	 System.out.println("RESULT OF ADDITION ="+addnew);
    	 
    	 int subtract= obj.sub(addnew, 2);
    	 //PRINT THE SUBSTRACTION 
    	 
    	 System.out.println("RESULT OF SUBSTRACTION  ="+subtract);
    	 
    	 
    	 int multiplication = obj.mul(subtract, 2);
    	 
    	 // PRINT THE RESULT MULTIPLICATION
    	 System.out.println("RESULT OF MULTIPLICATION ="+multiplication); 
    	 
    	 int division = obj.div(multiplication, 2);
    	 
    	 // PRINT THE RESULT DIVISION 
    	 System.out.println("RESULT OF DIVISION ="+division);
    	 
    	        
	}
}
