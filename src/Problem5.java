
public class Problem5 {

	public static void main(String[] args) {
		System.out.println(bruteForce(20));
	}
	
	//basically LCM
	public static int bruteForce(int cap) {
		boolean bool = true;
		for (int k = cap; k < 999999999; k++) { //999999999 will never be reached
			bool = true;
			for (int j = 2; j <= cap; j++) {
				if (k%j != 0) {
					bool = false;
					break;
				}
			}
			if (bool) return k;
		}
		return 0; //unreachable code
	}
	
	/*
	 * I'll work on a more efficient solution...someday
	 */
	
}
