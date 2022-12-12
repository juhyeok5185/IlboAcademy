package ex03;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		String nameInput = scanner.next();
		System.out.println("id를 입력하세요 : ");
		String idInput = scanner.next();
		System.out.println("pw을 입력하세요 : ");
		String pwInput = scanner.next();
		
		System.out.println("회원가입 성공");
		System.out.println("이름 : " + nameInput);
		System.out.println("id : " + idInput);
		System.out.println("pw : " + pwInput);
		
	}

}
