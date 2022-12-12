package ex03;

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요 :");
		String nameInput = scanner.next();
		System.out.println("id을 입력하세요 :");
		String idInput = scanner.next();
		System.out.println("pw을 입력하세요 :");
		String pwInput = scanner.next();
		
		System.out.printf("이름 : %s, id : %s, pw : %s", nameInput , idInput, pwInput);
	}

}
