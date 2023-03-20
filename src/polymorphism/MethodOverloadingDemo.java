package polymorphism;

public class MethodOverloadingDemo {
	
	public void add(int a , int b) {
		System.out.println(a+b);
		
	}
	
	public int add(int x, int y,int z )
	{
		return x+y+z;
	}
	
	public double add(double a, int b )
	{
		return a+b;
	}
	
	public double  add(int a, double b)
	{
		return a+b;
	}

	public static void main(String args[])
	{
		MethodOverloadingDemo m= new MethodOverloadingDemo();
		double a = m.add(100.0, 89);
		System.out.println(a);
	
		m.add(10, 20);
		
		double add = m.add(23, 78.9);
		System.out.println(add);
		
		int add2 = m.add(10, 20,30);
		System.out.println(add2);
	}

}
