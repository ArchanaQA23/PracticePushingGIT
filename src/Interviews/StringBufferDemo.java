package Interviews;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		StringBufferDemo  s = new StringBufferDemo();
		String names[] = {"oranium","tech","velachery","chrompet"};
		
		s.combineWords(names);
	}
	
	private void combineWords(String [] str) {
		
	 String sentence = "";
	 
	 StringBuffer sb =new StringBuffer();
	 	 
	 for (String name : str)
	 {
		sentence =sentence+name; 
		sb.append(name);
		System.out.println(sentence.hashCode());
		System.out.println(sb.hashCode());
	 }
	 System.out.println(sentence);
	 System.out.println(sb);
	 sb.insert(1,'c');  
	 sb.insert(5, "Address");
	 sb.reverse();
	 
	 System.out.println(sb);
	 
	 
	 
	
		
		
	}

}
