package ex13;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean loginCk = false;
		boolean run = true;
		int cnt = 0;
		int seq = 0;
		String[] joinName = new String[10];
		String[] joinId = new String[10];
		String[] joinPw = new String[10];

		while (true) {
			if (!loginCk) {
				System.out.println("1.회원가입 2.로그인 3.종료");
			} else {
				System.out.println("1.비밀번호수정 2.로그아웃 3.종료");
			}
			System.out.println("메뉴선택 : ");
			int mainMenu = scanner.nextInt();
			scanner.nextLine();
			switch (mainMenu) {
			case 1:
				if (!loginCk) {
					System.out.println("이름 : ");
					joinName[cnt] = scanner.next();
					System.out.println("ID : ");
					joinId[cnt] = scanner.next();
					System.out.println("PW : ");
					joinPw[cnt] = scanner.next();
					System.out.println("회원가입완료");
					cnt++;
				} else {
					System.out.println("변경할 비밀번호 : ");
					joinPw[seq] = scanner.next();
				}
				break;
			case 2:
				if (!loginCk) {
					System.out.println("ID : ");
					String loginId = scanner.next();
					System.out.println("PW : ");
					String loginPw = scanner.next();
					for (int i = 0; i < cnt; i++) {
						if (loginId.equals(joinId[i]) && loginPw.equals(joinPw[i])) {
							loginCk = true;
							seq = i;
							System.out.println("로그인완료");
							break;
						} else {
							System.out.println("정보를 확인하세요");
							continue;
						}
					}
				} else {
					loginCk = false;
				}
				break;
			case 3:
				run = false;
				break;

			default:
				System.out.println("없는번호입니다.");
				break;
			}
		}

	}
}
