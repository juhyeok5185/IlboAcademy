package ex08;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("초간단 회원가입");
		System.out.println("이름를 입력하세요 : ");
		String inputNameString = scanner.nextLine();
		System.out.println("id를 입력하세요 : ");
		String inputIdString = scanner.nextLine();
		System.out.println("pw를 입력하세요 : ");
		String inputPwString = scanner.nextLine();
		System.out.println("회원가입 성공");
		System.out.println("이름 : ");
		System.out.println("ID : ");
		System.out.println("PW : ");
		
		System.out.println("로그인체크");
		System.out.println("ID를 입력하세요 : ");
		String loginIdInputString = scanner.nextLine();
		System.out.println("PW를 입력하세요 : ");
		String loginPwInputString = scanner.nextLine();
		
		if (inputIdString.equals(loginIdInputString) && inputPwString.equals(loginPwInputString)) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("해당정보가 없습니다.");
		}
	}

}
