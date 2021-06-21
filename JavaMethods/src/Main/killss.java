package Main;

import java.util.Scanner;

public class killss {
	
	public static void wel() {
		System.out.println("Hello there, you can do your fav calculations here");
		
	}
	
	public static void multiply(int a, int b) {
		System.out.println(a*b);
	}
	public static void divide(int a,int b) {
		System.out.println(a/b);
	}
	public static boolean equalNumbers(int a,int b) {
		if (a==b) return true;
		else return false;
	}
	
	//get age of user
	public static int getAge(int a ) {
		System.out.println("Please enter your age : ");
	
		return new Scanner(System.in).nextInt();
			
	}
	
	//get name of user
	
	public static String getName() {
		System.out.println("Please enter your name : ");
		Scanner scan = new Scanner(System.in);
		String name=scan.next();
		return name;
	}
	
	public static void main(String[] args) {
		
		
		
		
		wel();
		multiply(23,12);
		multiply(10,100);
		divide(35,5);
		boolean ans= equalNumbers(12,12);
		System.out.println(ans);
		String name=getName();
		System.out.println("hello "+name+" you are welcome");
		
		
		
	}

}
