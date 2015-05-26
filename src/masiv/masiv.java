package masiv;

import java.util.Scanner;

public class masiv {

	public static void main(String[] args) {
		int[] arr1 = { 100, 2, 8, 4, 5, 56, 16, 45 };

		System.out.println(naiGoliamo(arr1));

	}

	public static int naiGoliamo(int[] arr1) {

		Scanner input = new Scanner(System.in);
		System.out
				.print("Въведете индекса от който искате да се изведе най-голямото число нататък:");
		int n = input.nextInt();
		int max = Integer.MIN_VALUE;
		for (int i = n; i < arr1.length; i++) {
			if (arr1[i] > max) {
				max = arr1[i];
			}
		}
		return max;
	}

}
