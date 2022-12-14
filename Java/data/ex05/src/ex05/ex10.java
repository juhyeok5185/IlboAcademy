package ex05;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class ex10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int answer = new Random().nextInt(10) + 1;
		int count = 0;
		System.out.println("숫자 Up&Down 게임!");
		System.out.println("1부터 10사이의 숫자를 입력해주세요! : ");

		while (true) {
			if (scanner.hasNextInt()) {
				int num = scanner.nextInt();
				if (num > answer) {
					System.out.println("더 작은수를 입력하세요");
					count += 1;
				} else if (num < answer) {
					System.out.println("더 큰수를 입력하세요");
					count += 1;
				} else if (num == answer) {
					count += 1;
					System.out.println("정답입니다.");
					System.out.printf("시도한 횟수 : %d%n", count);
					break;
				}else {
					System.out.println("범위내에 숫자를 입력해주세요");
					continue;
				}
			} 
			else {
				System.out.println("1~10사이의 숫자를 입력해주세요");
				scanner.nextLine();
				continue;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");

	}
}
