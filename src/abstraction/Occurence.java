package abstraction;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Occurence {
	public static void main(String[] args) {
		
	 String s ="Hello World";
	
	LinkedHashMap<Character,Integer> h = new LinkedHashMap<>();
	
    char[] character = s.toCharArray();
    
    for (char c:character)
    {
    	
    	Integer i = h.get(c);
    	System.out.println(i);
    	
    	if(h.containsKey(c))
    	{
    		h.put(c, h.get(c)+1);
    	}
    	else
    	{
    		h.put(c, 1);
    	}
    }
    System.out.println(h);
    
    
	}
}
