package Main;

import java.awt.Point;

public class Pt {

	public static void change(Point p) {
		p.x=2;
		p.y=4;
	}
	
	
	public static void main(String[] args) {
		
		Point p1 = new Point();
		
		p1.x=4;
		p1.y=2;
		
		System.out.println("x= "+p1.x+", y= "+p1.y);
		change(p1);
		System.out.println();
		System.out.println("x= "+p1.x+", y= "+p1.y);
	}

}
