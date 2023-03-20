package demo;

public class MethodDemo {
	

	public int addition(int a , int b  )  //method name with parameters with return type  
	{
		
		return a+b;
	}
	
	
	public static void main(String[] args) {
		MethodDemo m = new MethodDemo();
		System.out.println(m.addition(10,20));   //method call 
//		System.out.println(a);
		
	}

}
