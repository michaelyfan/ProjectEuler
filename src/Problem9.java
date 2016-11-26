
public class Problem9 {

	public static void main(String[] args) {
		System.out.println(bruteForce());
	}
	
	//bruteforce method
	//tolerably quick for the values of the problem
	//the alternate solution goes into "parametrisation". Please no. 
	public static int bruteForce() {
		for (int c = 1; c <= 1000; c++) {
			for (int b = 1; b <= c; b++) {
				for (int a = 1; a <= b; a++) {
					if (a*a + b*b == c*c && a+b+c == 1000) {
						return a*b*c;
					}
				}
			}
		}
		return -1;
	}
	
}
