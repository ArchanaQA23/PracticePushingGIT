package demo;

import java.util.*;

public class UserInputMethod {
	
	public static void main(String[] args) {
		
		// Fetching the input from the user 
		System.out.println("Enter the two inputs : ");
		Scanner sc = new Scanner (System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
//		sc.nextDouble();
//		sc.nextLine(); 
		
		System.out.println(num1*num2);
		
		
		
	}

}
