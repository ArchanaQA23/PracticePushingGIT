package constructor;

public class ConstructDemo extends Parent  {
	
	int a ; 
	public ConstructDemo()
	{
	    this(20,90);
		System.out.println("This is my default constructor ");
		a=10;  
		
	}
	
	public ConstructDemo(int a, int b )
	{
		this("oranium","tech");
		System.out.println(a+b);
	}
	
	public ConstructDemo(double a, int b)
	{
		this("oranium","tech","velachery");
		System.out.println(a+b);
	}
	
	public ConstructDemo(String a, String b)
	{    
		this(34.9,90);
		System.out.println(a+b);
	}
	
	public ConstructDemo(String a, String b , String c )
	{ 
		
		super();
		System.out.println(a+b+c);
	}
	
	
public static void main(String[] args) {
		
		ConstructDemo c = new ConstructDemo();
//		ConstructDemo c1 = new ConstructDemo(89,90);
//		ConstructDemo c2= new ConstructDemo(67.9,90);
//		ConstructDemo c3= new ConstructDemo("oranium","Tech");
//
//		ConstructDemo c4= new ConstructDemo("oranium","Tech", "Chrompet");
		
		
		
//		System.out.println(c.a);

	}

}
