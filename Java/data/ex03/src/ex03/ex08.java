package ex03;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("초간단 메뉴 만들기");
		System.out.println("1.회원가입 2.로그인 3.종료");
		System.out.println("메뉴 선택");
		int selMenuString = scanner.nextInt();

		switch (selMenuString) {
		case 1:
			System.out.println("회원가입 선택");
			break;
		case 2:
			System.out.println("로그인");
			break;
		case 3:
			System.out.println("종료");
			break;
		default:
			System.out.println("없는 번호입니다.");
		}

	}

}
