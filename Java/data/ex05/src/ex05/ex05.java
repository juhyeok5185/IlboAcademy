package ex05;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		out: while (true) {
			System.out.println("초간단 반복 메뉴 만들기");
			System.out.println("1.회원가입 2.로그인 3.종료");
			System.out.print("메뉴선택 : ");
			if (scanner.hasNextInt()) {
				int numInput = scanner.nextInt();
				switch (numInput) {
				case 1:
					System.out.println("회원가입 선택");
					break;
				case 2:
					System.out.println("로그인 선택");
					break;
				case 3:
					System.out.println("종료 선택");
					break out;
				default:
					System.out.println("없는번호입니다.");
					continue;
				}
			} else {
				System.out.println("문자는 안돼용");
				scanner.nextLine();
				continue;
			}
			System.out.println("프로그램종료");
		}
	}

}
