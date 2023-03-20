package staticConcept;

public class StaticDemo {
	
	
	int id ; 
	String name ;
	static String cname ;
	
	static    //static block is used to initialize the static variables .
	{
		cname ="SRM";
	}
	
	public  void displayDetails(int id, String name , String cname)
	{
		
		this.id=id;
		this.name=name;
		this.cname=cname;
		
		System.out.println("Name of the student is : " +name);
		System.out.println("Id of the student is :" +id);
		System.out.println("College name of the student is: "+cname) ;
		System.out.println("==============================");
		System.out.println();
	}
	
	
	
	
	public static void main(String[] args) {
		StaticDemo s = new StaticDemo();
		s.displayDetails(321, "raj",cname);    // 4 10 10 
		s.displayDetails(3241, "raju",cname);  //  4 10 10 
		s.displayDetails(678, "ram",cname );   // 4 10 10 
		
		
	}
	
	

}
