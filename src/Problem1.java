
public class Problem1 {

	public static void main(String[] args) {
		double a, b, c;
		a = System.currentTimeMillis();
		System.out.println(findAnswer(2000000000));
		b = System.currentTimeMillis();
		System.out.println(findAnswer2(2000000000));
		c = System.currentTimeMillis();
		System.out.println("1 time: " + (b-a) + "\n2 time: " + (c-b));
	}

	public static int findAnswer(int limit) {
		int answer = 0;
		for (int k = 0; k < limit; k++) {
			if (k % 3 == 0 || k % 5 == 0) {
				answer += k;
			}
		}
		return answer;
	}
	
	//much more efficient solution below
	public static int findAnswer2(int limit) {
		int answer = 0;
		for (int k = 0; k < limit ; k += 3) {
			answer += k;
		}
		for (int k = 0; k < limit; k += 5) {
			answer += k;
		}
		for (int k = 0; k < limit; k += 15) {
			answer -= k;
		}
		return answer;
	}
	
}
