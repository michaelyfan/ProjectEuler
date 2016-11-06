
public class Problem2 {
	public static void main(String[] args) {
		//System.out.println(fibonacciSum(145));
		System.out.println(fibonacciSum(4000000));
	}
	
	//up to and including limit
	public static int fibonacciSum(int limit) {
		int toReturn = 0;
		int first = 1, second = 1;
		int third = first + second;
		while (third <= limit) {
			toReturn += third;
			first = second + third;
			second = third + first;
			third = first + second;
		}
		return toReturn;
	}
	
	/*
	postnote: every third number in a Fibonacci sequence is even, beginning with 2. You can use that to
	get rid of testing for even, which is inefficient compared to just summing every
	third number
	*/
}
