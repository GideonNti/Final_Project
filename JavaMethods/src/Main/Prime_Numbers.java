package Main;

public class Prime_Numbers {

	
	public static boolean isPrime(int n) {
		for (int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			
			} 
		}return true;
	}
	
	public static void primebetween(int start, int end) {
		for (int i=start;i<=end;i++) {
		if (isPrime(i)) {
			System.out.print(i+", ");
		}
		}
	}
	
	public static void main(String[] args) {
		primebetween(12,46);

	}

}
