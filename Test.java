// Reverses a positive integer (variable 'input' in the main method). For example, returns 4321 if 'input' is 1234.
// Two different approaches are used to arrive at the same result. 

public class Test {

	public static void main(String[] args) {
		int input = 1234;
		System.out.println(reverse(input));
		System.out.println(reverseSecondApproach(input));
	}

	private static long reverse(int input) {
		Integer inputAsInteger = input;
		String asStr = inputAsInteger.toString();
		String inReverse = "";
		for (int i = asStr.length() - 1; i > -1; i--) {
			inReverse += asStr.charAt(i);
		}
		return Long.parseLong(inReverse);
	}
	
	private static long reverseSecondApproach(int input) {
		long newNum = 0;
		while(input > 0) {
			newNum *= 10;
			newNum += input % 10;
			input /= 10;
		}
		return newNum;
	}
}
