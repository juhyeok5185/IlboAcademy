package ex03;

import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("초간단 회원가입");
		System.out.println("이름를 입력하세요 : ");
		String nameString = scanner.next();
		System.out.println("id를 입력하세요 : ");
		String idString = scanner.next();
		System.out.println("pw를 입력하세요 : ");
		String pwString = scanner.next();
		
		System.out.println("회원가입 성공");
		System.out.printf("이름 : %s \n id : %s \n pw : %s \n",nameString,idString,pwString);
		
		System.out.println("로그인체크");
		System.out.println("id를 입력하세요 : ");
		String loginIdString = scanner.next();
		System.out.println("pw를 입력하세요 : ");
		String loginPwString = scanner.next();
		
		if (idString.equals(loginIdString) && pwString.equals(loginPwString)) {
			System.out.printf("반가워요 %s님", nameString);
		}
		else {
			System.out.println("해당정보가 없습니다.");
		}
	
		
		
	}

}
