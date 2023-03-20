package collectionsdemo;

import java.util.TreeSet;

public class TreeSetDemo {
	
	
	public static void main(String[] args) {
		
		
		TreeSet< Object> t = new TreeSet <>();
		
		t.add("oranium");
		t.add("tech");
		
		t.add("Chrompet");
		t.add("velachery");
		
//		t.add(null);    // null pointer exception 
//		
//		t.add(90);     // Class cast exception
	
		
		System.out.println(t);
		
		
		
	}

}
