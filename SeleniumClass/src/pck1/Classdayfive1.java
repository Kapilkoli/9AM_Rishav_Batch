package pck1;

public class Classdayfive1 {
   
	
	/* 
	 * *****************Static polymorphism*****************Example 1 
	 * 
	so there are some rules for static polymorphism

	method name------should be same
	method inputs----always different
	method output----can be same/can't be same
	 */
	
	public void perforaddition(int a,int b)
	{
		
		int c=a+b;
		System.out.println("Addition of two no"+c);
	}
	
	 public int perforaddition(float a,int b)
	 {
		 float c=a+b;
		 
		 System.out.println("Addition of two no with different data type and non void method"+c);
         return (int) c;
		 
	 }
	 
	 
	 public void performaddition(int a,int b,int c)
	 {
		 int v=a+b+c;
		 
		 System.out.println("Addition of three no "+v);
		 
	 }
	 
	 public static void main(String[] args) {
		
		 Classdayfive1 ob = new Classdayfive1();
		 ob.perforaddition(10, 20);
		 ob.perforaddition(25.45F, 25);
	     ob.performaddition(133, 32, 24);
	 
	 }
	
}
