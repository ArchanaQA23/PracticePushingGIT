package demo;

public class IfELseDemo {
	
	int num =11;                    //variable declaration done 
	
	public void evenOddCheck()   //method   
	{
		if (num%2==0) {
			System.out.println(num+ " is an even number");
			
		}
		else 
		{
			System.out.println(num +" is an odd number");
		}
	}
	
	
	public static void main(String[] args) {
		IfELseDemo i =new IfELseDemo();
		i.evenOddCheck();
		
		
	}
	
}
