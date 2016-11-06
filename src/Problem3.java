
public class Problem3 {
	
	public static void main(String[] args) {
		System.out.println(findLargestPrime(600851475143L));
	}
	
	/*
	 * The smallest factor of a number is prime. 
	 * Divide your "evil big number" by its smallest factor to get a new "evil big number"
	 * Repeat until your "evil big number" is one. The last "smallest factor" is the largest prime factor of the original "evil big number"
	 * 
	 */
	public static long findLargestPrime(long num){
		long currentEBN = num; //EBM = "evil big number"
		long previousFactor = 0;
		for (long k = 2; k <= num; k++) {
			if (currentEBN == 1) return previousFactor;
			if (currentEBN%k == 0) {
				currentEBN /= k;
				previousFactor = k;
				k = 2;
			}
		}
		return 0;
	}



}
