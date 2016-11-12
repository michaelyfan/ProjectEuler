
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Problem8 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("Problem8Text.txt"));
		ArrayList<Integer> digits = new ArrayList<Integer>();
		String bigNumber = "";
		while (scanner.hasNext()) {
			String nextLine = scanner.next();
			bigNumber += nextLine;
			for (int k = 0; k < nextLine.length(); k++) {
				digits.add(Integer.parseInt(nextLine.substring(k,k+1)));
			}
		}
		scanner.close();
		
		System.out.println(bruteForce(digits));
		System.out.println(findAnswer(bigNumber));

	}
	
	public static long bruteForce(ArrayList<Integer> digits) {
		long biggestProduct = 0L;
		for (int k = 12; k < digits.size(); k++) {
			long product = 1L;
			for (int j = k; j >= k-12; j--) {
				product *= digits.get(j);
			}
			if (product > biggestProduct) {
				biggestProduct = product;
			}
		}
		return biggestProduct;
	}

	/*
	 * splits the 1000-digit number by its 0's,
	 * ignores all the number pieces that are less than 
	 * length 13, and then processes the remaining number pieces
	 * 
	 * surprisingly less efficient that bruteForce, though this is
	 * practically indistinguishable for just one method call
	 * 
	 * theoretically more efficient for big numbers that are much more than
	 * 1000 digits long
	 */
	public static long findAnswer(String bigNumber) {
		long biggestProduct = 0;
		String[] pieces = bigNumber.split("0");
		for (int k = 0; k < pieces.length; k++) {
			if (pieces[k].length() >= 13) {
				for (int j = 12; j < pieces[k].length(); j++) {
					long product = 1L;
					for (int i = j; i >= j-12; i--) {
						product *= Integer.parseInt(pieces[k].substring(i,i+1));
					}
					if (product > biggestProduct) biggestProduct = product;
				}
			}
		}
		return biggestProduct;
	}
	
	

}
