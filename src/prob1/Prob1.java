package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		int[] bills = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int[] cnt = new int[bills.length];
		int money = 0;
		System.out.print("금액 : ");

		Scanner scan = new Scanner(System.in);
		money = scan.nextInt();

		for (int i = 0; i < bills.length; i++) {
			cnt[i] = money / bills[i];
			money = money % bills[i];
			System.out.println(bills[i] + "원 : " + cnt[i] + "개");
		}
		scan.close();
	}
}