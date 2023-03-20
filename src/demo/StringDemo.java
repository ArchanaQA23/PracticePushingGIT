package demo;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String s ="oranium";   
		String s1 ="       Welcome Guys				"	;		
		String s2="Oranium";
		String s3 = "I am Java programming";
		System.out.println(s.concat("Tech"));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s1);
		System.out.println(s1.trim());    // Removes the leading and trialing space 
		char c = s.charAt(2);
		System.out.println(c);  
		
		int i = s.indexOf('o');      
		System.out.println(i);
		System.out.println(s.indexOf('i'));       //4 
		System.out.println(s.lastIndexOf('i'));   //7 Returns the last occurence of char 
		System.out.println(s.contains("Ora"));
		
		System.out.println(s.isEmpty());
		System.out.println(s.endsWith("u"));
		System.out.println(s.startsWith("ran"));
		
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		
		System.out.println(s.length());
		
		System.out.println(s.replace('o', 's'));
		System.out.println(s.replaceAll("oranium","Tech"));
		
		
		// Substring --> slicing the string 
		System.out.println(s.substring(4));  
		System.out.println(s.substring(0, 4));     // Begining is inclusive , ending is exclusive 
		
		char[] ch = s.toCharArray();    //{'o','r','a', 
		
		for(char k:ch)
		{
			System.out.println(k);
		}
		
		System.out.println("Using normal for loop ");
		for(int k =0 ;k<ch.length;k++)
		{
			System.out.println(ch[k]);
		}
		
		
		//{ "I ", "am","Java"
		
		String[] split = s3.split(" ");
		
		for(String r:split)
		{
			System.out.println(r);
		}
		
		//s="oranium"
		String revstr="";
		for (int k = s.length()-1; k>=0;k--)
			        
		{ 
			revstr=revstr+s.charAt(k);   // revstr = mu
		}
		System.out.println(revstr);
		
		

	    
	    
		
	}

}
