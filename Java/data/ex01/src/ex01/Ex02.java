package ex01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("회원가입");
		System.out.println("이름을 입력하세요 :");
		
		String name = scanner.next();
		
		System.out.println("id를 입력하세요 :");
		
		String id = scanner.next();
		
		System.out.println("비밀번호를 입력하세요 :");
		
		String pw = scanner.next();
		
		System.out.println("회원가입이 완료되었습니다.");
		System.out.println("이름 :" + name);
		System.out.println("id :" + id);
		System.out.println("Pw :" + pw);
		
		scanner.close();
	}

}
