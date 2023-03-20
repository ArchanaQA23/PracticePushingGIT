package demo;

public class NestedLoopDemo {
	
	public void printStars()
	{
		for (int row =1;row<=5;row++)  //row =2
		{
			for(int col=row;col<=5;col++)  //col =2          
			{
				System.out.print("* ");   
			}                           
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		
		NestedLoopDemo n = new NestedLoopDemo();
		n.printStars();
		
		
	}

}
