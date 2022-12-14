package ex05;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean i = true;

		while (i) {
			System.out.println("초간단 반복 메뉴 만들기");
			System.out.println("1.회원가입 2.로그인 3.종료");
			System.out.print("메뉴선택 : ");
			int numInput = scanner.nextInt();
			if (numInput == 1) {
				System.out.println("회원가입 선택");
			} else if (numInput == 2) {
				System.out.println("로그인 선택");
			} else if (numInput == 3) {
				System.out.println("종료 선택");
				i = false;
			}
		}
	}

}
