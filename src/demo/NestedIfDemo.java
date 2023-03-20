package demo;

public class NestedIfDemo {
	
	int num = 8 ; 

	public void checkDivisible()
	{ 
		if (num%2==0)     
		{
			System.out.println(num +" is completely divisible by 2 ");
			if(num%4==0)
			{
				System.out.println(num +" is completelty divisible by 4 ");
				if(num%8==0)
				{
					System.out.println(num +" is completely divisble by 8 ");
					if(num%16==0)
					{
						System.out.println(num +" is completely divisble by 16");
						if(num%32==0)
						{
							System.out.println(num +" is completely divisble by 32 ");
						}
						else
						{
							System.out.println(num+"is not divisble by 32 ");
						}
					}
					else
					{
						System.out.println(num+ "is not divisble by 16");
					}
				}
				else
				{
					System.out.println(num+"is  not divisble by 8");
				}
				
			}
			else
			{
				System.out.println(num+"is not divisble by 4");
			}
		}
		else
		{
			System.out.println(num+ "is not divisble by 2 ");
		}
	}
	
	public static void main(String[] args) {
		NestedIfDemo n = new NestedIfDemo() ; 
		
		n.checkDivisible();
	}

}
