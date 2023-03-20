package finalKeyword;

public  class FinalClass {
	
	final int a = 10 ; 
	
	public final void method()
	{
		System.out.println("Method1");
	}
	
	public static void main(String[] args) {
		FinalClass f = new FinalClass();
		//f.a=20;
		System.out.println(f.a);
	}

}
