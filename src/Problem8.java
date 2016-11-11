
public class Problem8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner("");
	}
	
	public static String bruteForce(int[] number) {
		String toReturn = "";
		long biggestSoFar = 0L;
		for (int k = 13-1; k < number.length; k++) {
			long product = 1L;
			for (int j = k; j >= k-(13-1); j--) {
				product *= number[j];
			}
			if (product >= biggestSoFar) {
				
			}
		}
	}

	//as expected, more efficient than brute-forcing
	public static String findAnswer(int[] number) {

	}

}
