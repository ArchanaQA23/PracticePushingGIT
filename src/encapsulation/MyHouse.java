package encapsulation;

public class MyHouse {
	
	public static void main(String[] args) {
		
		FriendHouse f = new FriendHouse();
	
//		System.out.println(f.lockerAmt);      // get   //5000 
//		
//		f.lockerAmt=2000;
//		
//		System.out.println(f.lockerAmt);    //set    //2000 
		
		int lockerAmt = f.getLockerAmt();
		System.out.println(lockerAmt);
		
		f.setLockerAmt(3000);
		
		int lockerAmt2 = f.getLockerAmt();
		System.out.println(lockerAmt2);
		
	}

}
