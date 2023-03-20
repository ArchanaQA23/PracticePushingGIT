package abstraction;

public class Son extends Father {
	
	public void bike()
	{
		System.out.println("This is son's bike ");
	}

	
	@Override
	public void bicycle() {
		System.out.println("Son's implementation provided for father bicycle ");
		
	}
	
	public static void main(String[] args) {
		
		Son s = new Son();
		s.bicycle();
		s.bike();
		
		
		
	}


	
}
