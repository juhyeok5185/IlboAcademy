package ex08;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String idString = "Test";
		System.out.println("id 중복 체크");
		while (true) {
			System.out.println("id : ");
			String inputId = scanner.nextLine();
			if (inputId.length() >= 4 && !inputId.equals(idString)) {
				System.out.println("사용할 수 있는 아이디 입니다.");
				System.out.println("1.사용 2.아이디재검색");
				int menuNum = scanner.nextInt();
				scanner.nextLine();
				switch (menuNum) {
				case 1:
					System.out.println("패스워드 입력 :");
					String pwString = scanner.next();
					break;
				case 2:
					break;
				default:
					System.out.println("없는번호");
				}
			} else if (inputId.length() == 0) {
				System.out.println("ID를 입력해주세요");
			} else {
				System.out.println("아이디는 4자 이상 가능합니다.");
			}
		}
	}

}
