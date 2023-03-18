public class Prime{
public static void main(String[] args) {
	 int min = 1;
		int max = 100;
		for(int p=min;p<=max;p++) {
			if(isPrime(p)) {
				System.out.println(p);
			}
		}
	}
	public static boolean isPrime(int num) {	
		for(int i = 2; i <= num/i; ++i) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
