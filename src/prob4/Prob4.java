package prob4;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		char[] c1 = reverse("Hello World");

		printCharArray(c1);

		char[] c2 = reverse("Java Programming!");

		printCharArray(c2);

	}

	public static char[] reverse(String str) {
		char[] reverse = str.toCharArray();

		int num = str.length() / 2;

		char tmp = ' ';

		for (int i = 0; i < num; i++) {

			tmp = reverse[i];

			reverse[i] = reverse[reverse.length - i - 1];
			reverse[reverse.length - i - 1] = tmp;
		}
		return reverse;
	}

	public static void printCharArray(char[] array) {
		System.out.println(array);
	}
}
