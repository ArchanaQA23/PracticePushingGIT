package demo;

public class IfElseIf {
	
	int mark =67;    //global variable
	char c;                //variable declaration 
	

	public char checkIfElse()
	{
		if(mark>=91 && mark<=100)
		{
			c ='A';
		}
		else if (mark>=81 &&mark<=90)
		{
			c='B';
		}
		else if (mark>=71 && mark <=80)
		{
			c='C';
		
		}
		else if (mark>=61  && mark<=70)

		{
			c='D';
		}
		else 
		{
			System.out.println("FAIL");
		}
		
		return c ;
	}
	
	public static void main(String[] args) {
		IfElseIf i =new IfElseIf();
		char c = i.checkIfElse();
		System.out.println(c);
	}

}
