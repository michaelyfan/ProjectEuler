import java.util.ArrayList;
import java.util.Collections;


public class Problem4 {
	
	public static void main(String[] args) {
		System.out.println(findAnswer2());
	}
	
	public static int findAnswer() {
		ArrayList<Integer> palins = new ArrayList<Integer>();
		for (int k = 999; k >= 100; k--) {
			for (int j = k; j >= 100; j--) {
				if (isPalindrome(k*j)) {
					palins.add(k*j);
				}
			}
		}
		Collections.sort(palins);
		return palins.get(palins.size()-1);
	}
	
	//slightly more efficient, uses isPalindrome2()
	public static int findAnswer2() {
		int toReturn = 0;
		for (int k = 999; k >= 100; k--) {
			for (int j = k; j >= 100; j--) {
				if (isPalindrome2(k*j) && k*j > toReturn) {
					toReturn = k*j;
				}
			}
		}
		return toReturn;
	}
	
	public static boolean isPalindrome(int num) {
		String n = Integer.toString(num);
		for (int k = 0, j = n.length()-1; k < n.length() && j >= 0; k++,j--) {
			if (k > j) break;
			if (n.charAt(k) != n.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	
	//slightly more efficient palindrome test
	public static boolean isPalindrome2(int num) {
		int original = num; //store original value
		int reversedNum = 0;
		while (num > 0) {
			reversedNum *= 10;
			reversedNum += num%10;
			num /= 10;
		}
		return original == reversedNum;
	}

}
