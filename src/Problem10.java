import java.util.ArrayList;


public class Problem10 {

	public static void main(String[] args) {
		System.out.println(bruteForce(2000000));
		System.out.println(findAnswer(2000000));
	}

	//a bruteforce method, as always. More efficient solution at bottom
	public static long bruteForce(int max) {
		long sum = 5;
		for (int k = 5; k < max; k += 2) {
			if (isPrime(k)) {
				sum += k;
			}
		}
		return sum;
	}
	
	public static boolean isPrime(int num) {
		if (num <= 1) return false;
		for (int k = 2; k <= Math.sqrt(num);k++) {
			if (num % k == 0) return false;
		}
		return true;
	}
	
	//All primes greater than 3 can be written in the form 6k +/- 1
	//I did this just to try it. It's actually slower than bruteForce
	public static long findAnswer(int max) {
		long sum = 5;
		for (int k = 1; 6*k <= max; k++) {
			if (isPrime(6*k-1)) {
				sum += 6*k-1;
			}
			if (isPrime(6*k+1)) {
				sum += 6*k+1;
			}
		}
		return sum;
	}
	
	//sieve of Eratosthenes. Google it
	//most efficient if optimized properly
	public static long findAnswerSieve(int max) {
		
	}
	
}
