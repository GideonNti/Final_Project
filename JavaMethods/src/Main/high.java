package Main;

public class high {
	//a method with no parameter
	public void display1() {
		System.out.println("A method without parameters");
	}
	// a method with a parameter
	public void display2(int a) {
		System.out.println("A method with a single parameter "+a);
	}
	
	public static void main(String[] args) {
		//creating object of method class
		high obj = new high();
		
		//calling a method with no parameter
		obj.display1();
		
		//calling a method with one parameter
		obj.display2(25);
		
		

	}

}
