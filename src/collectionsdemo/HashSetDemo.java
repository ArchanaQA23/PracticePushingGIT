package collectionsdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		HashSet <Object> h = new HashSet <>();
		
		h.add("Oranium");
		h.add("Tech");
		h.add("Velachery");
		h.add("oranium");
		h.add(67);
		h.add(true);
		h.add(null);
		h.add(null);
		h.add(89.67);
		h.add('t');
	    h.add("67");
	    
	    System.out.println(h); 
	    
	    System.out.println(h.contains(true));  //true 
	    
	    System.out.println(h.contains("good"));   //false
	    
	    int size = h.size();
	    
	    System.out.println("Number of items in a set : " +size);
	    

	        h.remove("oranium");
	        System.out.println(h);
	    
	        //Convert the set into array 
	        Object[] arr = h.toArray();
	        
	        System.out.println("Using normal for loop ");
	        
	        for (int i =0;i<arr.length;i++)
	        {
	        	System.out.println(arr[i]);
	        }
	        
	        for(Object a:arr)
	        {
	        	
	        	if(a=="Oranium")
	        	{
	        		System.out.println(a);
	        	}
	        }
	        
	        
	        System.out.println("Using iterator method..");
	        Iterator<Object> i = h.iterator();
	        
	        while(i.hasNext())
	        {
	        	System.out.println(i.next());
	        }
	    
	        
	        System.out.println("Using lambda expressionn...");
	        
	        h.forEach(k->System.out.println(k));
		
		
		
	}

}
