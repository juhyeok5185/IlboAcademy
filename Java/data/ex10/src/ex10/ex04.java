package ex10;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Util util = new Util();
		Scanner scanner = new Scanner(System.in);
		System.out.println("사용하실 아이디를 입력해주세요");
		System.out.println("id : ");
		String id = scanner.next();
		if (id.length() < 4) {
			System.out.println("아이디는 4자 이상 가능합니다.");
			continue;
		} else {
			System.out.println("사용가능한 아이디 입니다.");
		}
		System.out.println("1.사용 2.아이디재검색");
		int menuNum = scanner.nextInt();
		scanner.nextLine();
		switch (menuNum) {
		case 1:
			System.out.println("패스워드를 입력하세요");
			System.out.println("pw");
			String pw = scanner.next();
			continue;
		case 2:
			break;
		default:
			System.out.println("없는번호");
		}
	}
}
