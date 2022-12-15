package ex06;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("초간단 메뉴 만들기");
		out:
		while (true) {
			System.out.println("1.회원가입 2.로그인 3.종료");
			System.out.println("메뉴선택 : ");
			if (scanner.hasNextInt()) {
				int menuNum = scanner.nextInt();
				switch (menuNum) {
				case 1: System.out.println("회원가입");
				case 2: System.out.println("로그인");
				case 3: System.out.println("종료");break out;
				default:
				}
				
			}
			else {
				System.out.println("문자만 입력해주세요");
				scanner.nextLine();
				continue;
			}
		}
	}

}
