package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		Random random = new Random();

		Scanner scanner = new Scanner(System.in);

		int cnt = 1;
		int min = 1;
		int max = 100;
		int number = 0;
		int answer = 0;
		while (true) {

			if (cnt == 1) {
				answer = random.nextInt(100) + 1;
				System.out.println("수를 결정하였습니다. 맞추어 보세요.");
				System.out.println(cnt);
			}
			System.out.println(min + "-" + max);
			System.out.print(cnt + ">>");
			number = scanner.nextInt();

			cnt++;

			if (number == answer) {
				cnt = 1;
				min = 1;
				max = 100;

				System.out.println("맞았습니다");
				System.out.println("다시하시겠습니까(y/n)");

				if (scanner.next().equals("n")) {

					break;
				} else {
					cnt = 1;
				}
			} 
			else if (answer > number) {
				System.out.println("더 높게");
				if (number >= min) {
					min=number;
				}
			} 
			else {
				System.out.println("더 낮게");
				if (number <= max) {
					max=number;
				}
			}
		}
		scanner.close();
	}
}