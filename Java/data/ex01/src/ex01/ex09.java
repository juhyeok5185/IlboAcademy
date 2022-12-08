package ex01;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("회원가입");
		System.out.println("이름을 입력하세요 : ");
		String nameString = scanner.next();
		System.out.println("id를 입력하세요 : ");
		String idString = scanner.next();
		System.out.println("pw 입력하세요 : ");
		String pwString = scanner.next();
	
		
		System.out.println("회원가입 성공");
		System.out.println("이름 : " + nameString);
		System.out.println("id : " + idString);
		System.out.println("pw : " + pwString);
	}

}
