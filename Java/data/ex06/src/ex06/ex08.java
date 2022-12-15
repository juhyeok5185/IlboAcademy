package ex06;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		out: while (true) {
			System.out.println("1.중식 2.한식 3.종료");
			int inputNum = scanner.nextInt();
			switch (inputNum) {
			case 1:
				System.out.println("1.짜장면 2.짬뽕 3.만두");
				int chFood = scanner.nextInt();
				switch (chFood) {
				case 1:
					System.out.println("짜장면선택");
					continue;
				case 2:
					System.out.println("짬뽕선택");
					continue;
				case 3:
					System.out.println("만두선택");
					continue;
				}
			case 2:
				System.out.println("1.불고기 2.한정식 3.갈비");
				int koFood = scanner.nextInt();
				switch (koFood) {
				case 1:
					System.out.println("불고기선택");
					continue;
				case 2:
					System.out.println("한정식선택");
					continue;
				case 3:
					System.out.println("갈비선택");
					continue;
				}
			case 3:
				System.out.println("프로그램종료");
				break out;
			}
		}
	}

}
