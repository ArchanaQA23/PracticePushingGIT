package collectionsdemo;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String s ="Oranium";   // String literal 
		String s1="Oranium";
		
		String s2= new String("Oranium");  // Heap memory 
		
		
		//equals --> content comparision 
		
		// == ---> address comparision 
		
		System.out.println(s.equals(s2));   //true 
		
		System.out.println(s==s2);  //false 
		
		System.out.println(s==s1);  //true 
		
		
		
	}

}
