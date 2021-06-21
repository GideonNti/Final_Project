package Main;

public class recursion {

	public static int factorial(int n) {
		if (n !=0) {
			int sum =n*factorial(n-1);
			return sum;
		}
		else return 1;
	}
	
	public static void reducebyone(int n) {
		if (n>=0) {
			reducebyone(n-2);
		}
		System.out.println("call completed : "+n);
	}
	
	
	public static void main(String[] args) {
		int num = 3;
		
		int result = factorial(num);
		System.out.println(num+" factorial is "+result);
		System.out.println();
		
		reducebyone(10);

	}

}
