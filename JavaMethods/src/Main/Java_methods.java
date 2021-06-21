package Main;

import java.util.Scanner;

public class Java_methods {
	
	public int addNumbers(int a, int b) {
		int sum = a+b;
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num1 = scan.nextInt();
		System.out.println("Enter a number : ");
		int num2 = scan.nextInt();
		
		// creating object of method class
		Java_methods obj = new Java_methods();
		
		//calling method
		int result = obj.addNumbers(num1, num2);
		System.out.println("The sum of "+num1+" and "+num2+ " is "+result);
		
		
		

	}

}
