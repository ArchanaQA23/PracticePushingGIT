package inheritance;

public class Son extends Father {
	
	public void ktmBike()
	{
	   System.out.println("This is son's ktm bike ");  //syso --> ctrl space 
	}
	
	public void audiCar()
	{
		super.bicycle();
		System.out.println("This is son's audi car ");
	}
	
	public static void main(String[] args) {
		
		Son s = new Son();
		s.ktmBike();    //own
		s.audiCar();    //own
		//s.bicycle();    //father 
		s.fortunerCar();   //father 
		System.out.println(s.wheels);  //father variable 
		
	}
	
}
