import java.util.ArrayList;

public class Problem7 {

	public static void main(String[] args) {
		System.out.println(findNthPrime(3));
	}
	
	/*
	 * A prime number has no prime factors.
	 * Using the above property is much more efficient than testing division by EVERY number.
	 */
	public static int findNthPrime(int n) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		int currentNumber = 3;
		while(primes.size() < n) {
			boolean isPrime = true;
			for (int k = 0; k < primes.size(); k++) {
				if (currentNumber%primes.get(k) == 0) { 
					isPrime = false;
					break;
				}
			}
			if (isPrime == true) {
				primes.add(currentNumber);
			}
            currentNumber++;
		}
		return primes.get(n-1);
	}

}
