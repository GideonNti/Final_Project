package Main;

import java.util.Scanner;

public class Area {
	
	public int findArea(int b, int h) {
		int area = b*h/2;
		return area;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the base of the area : ");
		int b = scan.nextInt();
		System.out.println("Enter the height of the area : ");
		int h = scan.nextInt();
		
		//create an object of method class Area
		Area obj = new Area();
		
		double result = obj.findArea(b, h);
		System.out.println("The area of the triangle of height "+h+" and base "+h+" is "+result);
		
	}

}
