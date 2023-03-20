package demo;

public class LocalVsGlobal {
	
	int a = 34;       //global variables 
	
	public void display() {
		
		int b = 90;         //local variable 
		
		System.out.println(a);    //global variable 
		System.out.println(b);    //local variable 
	}
	
	
	public void show ()
	{
		
		System.out.println(a);   // global variable can be accesible 
		System.out.println(b);   // we cannot access the local variable which is inside the 
		                          // another method 
	}
	
	
	public static void main(String[] args) {
		LocalVsGlobal l =new LocalVsGlobal();
		l.display();
		l.show();   
	}

}
