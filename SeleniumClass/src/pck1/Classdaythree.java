package pck1;

public class Classdaythree {

	
	public Classdaythree()
	{
		
		System.out.println("This is default Constructor ");
		
	}
	

	public Classdaythree(int a)
	{
		
		System.out.println("This is Single parameter Constructor ");
		
	}
	
	public Classdaythree(int a,int b)
	{
		
		System.out.println("This is Two parameter Constructor ");
		
	}
	public Classdaythree(int a,int b,int c)
	{
		
		System.out.println("This is Three parameter Constructor ");
		
	}
	
	public Classdaythree(int a,int b,int c,int d)
	{
		
		System.out.println("This is Four parameter Constructor ");
		
	}

	
	
	public static void main(String[] args) {
		
  System.out.println(" ASSIGNMENT TO DISPLAY OUTPUT IN BELOW ORDER :\n *************************** \n 4 parmaeterized consturctor \n Default consturctor \n 1 parmaeterized consturctor\n 2 parmaeterized consturctor\n 3 parmaeterized consturctor\n****************************");
  
  System.out.println("\n");
		 	
		Classdaythree obj1= new Classdaythree(10,2,3,2);
		Classdaythree obj2= new Classdaythree();
		Classdaythree obj3= new Classdaythree(12);
		Classdaythree obj4= new Classdaythree(3,2);
		Classdaythree obj5= new Classdaythree(12,3,2);
	}
}
