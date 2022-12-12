package ex03;

import java.security.PublicKey;
import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("초간단 회원가입");
		System.out.println("이름을 입력하세요 : ");
		String nameInput = scanner.next();
		System.out.println("id를 입력하세요 : ");
		String idInput = scanner.next();
		System.out.println("pw를 입력하세요 : ");
		String pwInput = scanner.next();
		
		System.out.println("회원가입성공");
		System.out.println("이름 : " + nameInput);
		System.out.println("id : " + idInput);
		System.out.println("pw : " + pwInput);
		
		System.out.println("로그인 체크");
		System.out.println("id를 입력하세요 : ");
		String tryId = scanner.next();
		System.out.println("pw를 입력하세요 : ");
		String tryPw = scanner.next();
		
		System.out.println(idInput.equals(tryId)&& pwInput.equals(tryPw)?"반가워요" + nameInput + "님" : "해당정보가 없습니다.");
	}

}
