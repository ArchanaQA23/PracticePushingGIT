package staticConcept;

public class StaticMethodDemo {
	
	static int a ;
	
	public static  void display()
	{
		System.out.println("display method ");
	}
	
	
	public static void main(String[] args) {
	
		StaticMethodDemo.display();
		System.out.println(a);
		
	}

}
