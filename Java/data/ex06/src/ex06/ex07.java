package ex06;

import java.util.Scanner;

import javax.naming.NameAlreadyBoundException;

public class ex07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nameString = "";
		String idString = "";
		String pwString = "";
		boolean run = true;
		boolean loginCk = false;

		while (run) {
			if (loginCk) {
				System.out.println("1.비밀번호수정 2.로그아웃(" + nameString + "님) 3.종료");
			} else {
				System.out.println("1.회원가입 2.로그인 3.종료");
			}
			int menu = scanner.nextInt();
			scanner.nextLine();
			switch (menu) {
			case 1:
				if (loginCk) {
					System.out.println("비밀번호를 입력하세요");
					String pw3 = scanner.next();
					if (pw3.equals(pwString)) {
						System.out.println("수정할 Pw :");
						pwString = scanner.nextLine();
						System.out.println("비밀번호 수정 완료");
					} else {
						System.out.println("비밀번호가 틀립니다.");
					}
				} else {
					System.out.println("회원가입");
					System.out.println("이름 : ");
					nameString = scanner.nextLine();
					System.out.println("id : ");
					idString = scanner.nextLine();
					System.out.println("pw : ");
					pwString = scanner.nextLine();
				}
				break;
			case 2:
				if (loginCk) {
					loginCk = false;
				} else {
					System.out.println("로그인");
					System.out.println("id : ");
					String loginIdString = scanner.nextLine();
					System.out.println("pw : ");
					String loginPwString = scanner.nextLine();

					if (loginIdString.equals(idString) && loginPwString.equals(pwString)) {
						loginCk = true;
					} else {
						System.out.println("로그인 정보가 없습니다.");
					}
				}
				break;
			case 3:
				run = false;
				break;
			default:
				System.out.println("메뉴 번호 확인");
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
