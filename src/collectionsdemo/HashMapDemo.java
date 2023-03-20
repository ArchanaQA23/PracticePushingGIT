package collectionsdemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<String,Integer> h= new LinkedHashMap<>();
		
		h.put("English", 89);
		h.put("Math", 78);
		h.put("Science", 90);
		h.put("English", 67);
		h.put(null, 90);
		h.put("ComputerScience", 90);		
		
		System.out.println(h);
		
		System.out.println("ITerating the keys using keySet () method ");
	   Set<String> k = h.keySet();
	   
	   for (String a : k)
	   {
		   System.out.println(a);
	   }
	   System.out.println("Iterating all the values using values() method ..");
	   Collection<Integer> c = h.values();
	   
	   for(Integer l:c)
	   {
		   System.out.println(l);
	   }
	   
	   Set<Entry<String, Integer>> e = h.entrySet();
	   
	   for(Entry<String, Integer> o:e)
	   {
		   if(o.getKey()=="Science")
		   {
			   System.out.println("Science value is :" +o.getValue());
		   }
		   
	   }
		
	}

}
