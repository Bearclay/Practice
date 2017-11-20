public class arrayFun {

	public static void main(String[] args) {
		
		
		int[] hand = new int[5];
		
		hand[0] = 54;
		hand[1] = 4;
		hand[2] = 2;
		hand[3] = 10;
		hand[4] = 123;
		
		sortArray(hand);
		for (int i = 0; i < hand.length; i++) {
			System.out.println(hand[i]);
		}
	}

	public static int[] sortArray(int[] x) {
		for (int i = 0; i <= x.length - 1; i++) {
			for (int j = 0; j <= x.length - 2; j++) {
				if (x[j] > x[j + 1]) {
					int temp = x[j];
					x[j] = x[j + 1];
					x[j + 1] = temp;
				}
			}
		}
		return x;
	}
}
