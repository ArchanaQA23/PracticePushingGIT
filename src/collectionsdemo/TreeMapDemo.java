package collectionsdemo;

import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		TreeMap <Integer,String> t =  new TreeMap<>();
		 
		t.put(102,"Ram");
		t.put(34, "Raj");
		t.put(67, "Ram");
		t.put(89, "Raja");
		t.put(78,"Praveen");
		
		// t.put(null,"Raja");
		
		System.out.println(t);
		
		t.keySet();
		
		t.values();
		
		t.entrySet();
		
	}
	
	
}
