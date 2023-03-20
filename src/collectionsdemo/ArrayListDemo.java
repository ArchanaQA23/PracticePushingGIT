package collectionsdemo;

import java.util.*;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		LinkedList<Object >  a= new LinkedList<>();
		
		a.add("Oranium");  
		a.add("Tech");
		a.add(78);
		a.add(89.7);
		a.add(true);
		a.add(null);
		a.add("Oranium");  
		
		System.out.println(a);  // [Oranium, Tech, 78, 89.7, true, null, Oranium]
		
		int in = a.indexOf(78);
		System.out.println(in );  // 2
		int lastIndexOf = a.lastIndexOf("Oranium");   
		System.out.println(lastIndexOf);   // 6
		
		System.out.println(a.get(5));   // null
		boolean contains = a.contains("Oranium");
		System.out.println(contains);
		
		a.remove(5);
		System.out.println(a);   // [Oranium, Tech, 78, 89.7, true, Oranium]
		
		a.remove(true);
		System.out.println(a);  // [Oranium, Tech, 78, 89.7, Oranium]
		
		a.set(3, "Chrompet");
		System.out.println(a);   // [Oranium, Tech, 78, Chrompet, Oranium]
		
		int size = a.size();
		
		System.out.println("Number of elements in a list :" +size );  // 5 
		
		
		System.out.println("*******Using normal for loop***** ");
		
		for (int i =0; i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		System.out.println("**Using enhanced for loop***");
		
		for (Object k : a )

		{
			System.out.println(k);
		}
		
		
		System.out.println("***Using iterator method *****");
		
		Iterator<Object> i = a.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		System.out.println("using lambda expression ..");
		
		a.forEach(k->System.out.println(k));
		
		//cloning 
		
		LinkedList <Object> b = new LinkedList<>();
		b = (LinkedList) a.clone();
		
		System.out.println(b);  // [Oranium, Tech, 78, Chrompet, Oranium]
				
		LinkedList <Object > c = new LinkedList<>();
		c.addAll(a);
		System.out.println(c);
		
		b.clear();
		System.out.println(b);   // []
		
		c.clear();
		System.out.println(c);   // [] 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
