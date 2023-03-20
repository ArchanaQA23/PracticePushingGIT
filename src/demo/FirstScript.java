package demo;

public class FirstScript {
	
	int a =10 ;               //variables 
	double  b = 20.4;
	
	public void displayValues()    // Method 
	{
		System.out.println("******Displaying the values *******");
		System.out.println(a);       // 10
		System.out.println(b);       //20.4
		
	}
	
	
   public static void main(String args[])
	
	{
		FirstScript f= new FirstScript();     // object creation done 
		f.displayValues();                 //method call using object 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
