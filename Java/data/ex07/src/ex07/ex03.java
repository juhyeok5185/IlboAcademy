package ex07;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		int cnt = 0;

		System.out.println("누적 평균값 구하기");
		while (true) {
			System.out.println("숫자입력 [종료(q)]");
			if (scanner.hasNextInt()) {
				total += scanner.nextInt();
				cnt++;
			} else {
				if (scanner.nextLine().equals("q")) {
					break;
				} else {
					System.out.println("숫자만 입력해주세요");
					scanner.nextLine();
				}
			}
		}

		System.out.printf("총합 : %d 평균 : %d / %d = %.2f", total, total, cnt, (float) total / cnt);

	}

}
