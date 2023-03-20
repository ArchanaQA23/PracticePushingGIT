package demo;

public class JumpingStatement {
	
	public void checkJump()
	{
		for (int num =10; num>=1;--num)
		{
			
			
			System.out.println(num);
		}
		
	}
	
	
	public static void main(String[] args) {
		JumpingStatement j =new JumpingStatement();
		j.checkJump();
		
	}

}
