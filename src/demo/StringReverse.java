package demo;

public class StringReverse {
	
	public static void main(String[] args) {
		String s = "Welcome Java Programming OOp concept";  
		
		String[] split = s.split(" ");
		String revword="";
		for (int i=0;i<split.length;i++)  //0  0<5
		{
			String word="";     
			if(i%2==0)   
			{
			
			word=" "+split[i];    
		
		     char[] character = word.toCharArray();      //w e l c o m e 
		     for(int j= character.length-1 ;j>=0;j--)
		     {
		    	 revword=revword+character[j];
		     }	
		}
			else
			{
				revword=revword+split[i]+" ";
			}
			 
		}
		System.out.println(revword);
	
		
	}

}
