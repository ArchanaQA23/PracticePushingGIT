package demo;

public class ArrayDemo {
	
	int tarr[][]= {                    
			{10,20,30},  
			{40,50,60},
			{70,80,90}
			
	};

	public void checkArray()   
	{
         System.out.println(tarr.length);   //It will return number of rows
         System.out.println(tarr[1].length);  //It will return respective columns 
         for(int row =0;row<=1;row++)
         {
        	 for(int col=0;col<tarr[row].length;col++)
        	 {
        		 System.out.print(tarr[row][col] +" ");
        	 }
        	 System.out.println();
         }
         
         
         System.out.println("Using enhanced for loop");
         for(int[] k:tarr) {
        	 for(int j:k)
        	 {
        		 System.out.print(j+ " ");
         }
        	 System.out.println();
        	 
        
        	 
         }
        	
	}
	
	public static void main(String[] args) {
		ArrayDemo a = new ArrayDemo();
		a.checkArray();                  //mcuo
		
	}

}
