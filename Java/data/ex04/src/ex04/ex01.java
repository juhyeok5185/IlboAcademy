package ex04;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("초간단 메뉴 만들기");
		System.out.println("1.회원가입 2.로그인 3.종료");
		System.out.println("메뉴선택 : ");
//		System.out.println(scanner.hasNextInt());

		if (scanner.hasNext()) {
			int selectMenu = scanner.nextInt();
			switch (selectMenu) {
			case 1:
				System.out.println("회원가입 선택");
				break;
			case 2:
				System.out.println("로그인 선택");
				break;
			case 3:
				System.out.println("프로그램 종료");
				break;
			default:
			}
		} else {
			System.out.println("잘못눌렀습니다.");
		}
	}

}
