package demo;

public class StringBuffDemo {
	
	public static void main(String[] args) {
		
		StringBuilder s= new StringBuilder("oranium");    
		System.out.println(s);
	      System.out.println(s+"Tech");
	      System.out.println(s.hashCode());    // 292938459 
//	      StringBuffer reverse = s.reverse();
//	      System.out.println(reverse);
//	      System.out.println(reverse.hashCode());
	      
	      s.replace(1, 4, "oran");
	      System.out.println(s);
	      s.insert(1, 'y');
	      System.out.println(s);
	      s.append("Tech");
	      System.out.println(s);
	      
	      
	      
		
	}

}
