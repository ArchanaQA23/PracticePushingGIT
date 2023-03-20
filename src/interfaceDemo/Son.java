package interfaceDemo;

public class Son implements Father,Mother {
	
	public void ktmBike()
	{
		System.out.println("This is son's ktm bike ");
	}

   public void r15Bike()
   {
	   System.out.println("This is son's r15 bike ");
   }

@Override
public void goldWatch() {
	System.out.println("This is son's gold watch"); 

}
@Override
public void goldJewels() {
	// TODO Auto-generated method stub
	
}


public static void main(String[] args) {
	
	Son  s= new Son();
	s.ktmBike();
	s.r15Bike();
	s.goldWatch();  
	System.out.println(s.wheels);
	//s.wheels=78698.89;   //we cannot change the value of variable which is present in an interface 
	                        // it will act like static constants
	
	//Father f = new Father();   // we cannot instantiate an object for an interface , because it has abstract methods . 
	
	
	s.goldJewels();                 
}




}
