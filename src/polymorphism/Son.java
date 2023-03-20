package polymorphism;

public class Son extends Father  {

	
	public void fortunerCar()
	{
		
		super.fortunerCar();
		System.out.println("This is son's fortuner car ");
	}
	
	public void ktmBike()
	{
		System.out.println("This is son's ktm bike ");
	}
	
	public static void main(String[] args) {
		
		Son s = new Son() ;
		
		s.ktmBike();
		s.goldWatch();
		s.fortunerCar();    
		
		System.out.println();
		
		Father f = new Father (); 
		f.goldWatch();  
		f.fortunerCar();
		
	
		Father f1 =new Son();   //upcasting 
		
		f1.fortunerCar();
		f1.goldWatch();  
		
		
		// Son s1 = new father();  //Invalid 
	      
		
		
		
	}
}
