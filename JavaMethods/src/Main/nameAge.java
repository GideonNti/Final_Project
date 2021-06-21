package Main;

import java.util.Scanner;

/*
 * a method that prints name and age of a person
 */
public class nameAge {
	// a method for Age of the person
	public int Age_op(int a) {
		int age =a;
		return age;
	}
	// a method for name of the person
	public void getName() {
		
		return ;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age : ");
		int age = scan.nextInt();
		//creating an object of method class
		
		nameAge obj = new nameAge();
		
		 int ages = obj.Age_op(age);
		 System.out.println("The age of the person is "+ages);

	}

}
