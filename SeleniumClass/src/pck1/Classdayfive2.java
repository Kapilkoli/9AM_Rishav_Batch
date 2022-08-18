package pck1;

public class Classdayfive2 {
	
	
	
	/* 
	 * *****************Static polymorphism*****************Example 2 
	 * 
	so there are some rules for static polymorphism

	method name------should be same
	method inputs----always different
	method output----can be same/can't be same
	 */
	
	public void sub(float a,float b)
	{
     float c=a-b;
     
    System.out.println("Subtration of two no with two input parameter"+c);
	}
	
    
    
    public void sub(int a,int b)
    {
    	int c = a-b;
    	
    	System.out.println("Subtraction of two no with two parameters "+c);
    	
    }
  
    public static void main(String[] args) {
		
    	Classdayfive2 ob = new Classdayfive2();
    	 
    	ob.sub(392.20F, 50F);
    	ob.sub(50, 10);
    	
	}

}
