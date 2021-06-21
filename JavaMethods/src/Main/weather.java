package Main;

import java.util.Scanner;

public class weather {

	public static void printspring() {
		System.out.println("The season is spring ");
		
	}

	public static void printsummer() {
		System.out.println("The season is summer ");
	}
	
	public static void printwinter() {
		System.out.println("The season is winter ");
	}
	public static void printfall() {
		System.out.println("The season is fall ");
	}
	
	public static void printoutofrange() {
		System.out.println("Out of range, please try again ");
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a season [1=spring, 2=summer, 3=winter, 4=fall]");
		int number = scan.nextInt();
		
		if (number ==1) {
			printspring();
		}
		if (number ==2) {
			printsummer();
		}
		if (number ==3) {
			printwinter();
		}
		if (number ==4) {
			printfall();
		}
		if (number>4 || number <1) {
			printoutofrange();
		}
		
		scan.close();
	}

}
