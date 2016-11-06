
public class Problem6 {
	
	public static void main(String[] args) {
		System.out.println(findAnswer(100));
	}
	
	public static int findAnswer(int cap) {
		return squareOfSums(cap) - sumOfSquares2(cap);
	}
	
	//bruteforce
	public static int sumOfSquares(int cap) {
		int toReturn = 0;
		for (int k = 1; k <= cap; k++) {
			toReturn += Math.pow(k, 2);
		}
		return toReturn;
	}
	
	/*
	 * -sumOfSquares(n) = n(n+1)(2n+1)(1/6)
	 * -see Overview of Problem 6 for derivation of this equation
	 * -more efficient
	 */
	public static int sumOfSquares2(int cap) {
		return cap*(cap+1)*(2*cap+1)/6;
	}
	
	//sum(n) = n(n+1)/2
	public static int squareOfSums(int cap) {
		int sum = cap*(cap+1)/2;
		return (int) Math.pow(sum, 2);
	}
}
