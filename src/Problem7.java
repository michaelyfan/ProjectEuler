import java.util.ArrayList;

public class Problem7 {

	public static void main(String[] args) {
		System.out.println(findNthPrime(10000));
	}
	
	/*
	 * A prime number has no prime factors.
	 * Using the above property is more efficient than testing division by EVERY number, in certain cases.
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
	
	/*
	 * According to the overview, the following principles could aid the creation of a potentially more efficient solution:
	 * -All primes greater than 3 can be written in the form 6k +/- 1
	 * -Any number n can have only one prime factor greater than Math.sqrt(n)
	 */
	
}
