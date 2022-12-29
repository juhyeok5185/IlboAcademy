package ex13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean loginCk = false;
		boolean run = true;
		int cnt = 0;
		int seq = 0;
		List<String> nameList = new ArrayList<>();
		List<String> idList = new ArrayList<>();
		List<String> pwList = new ArrayList<>();

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
					nameList.add(scanner.next());
					System.out.println("ID : ");
					idList.add(scanner.next());
					System.out.println("PW : ");
					pwList.add(scanner.next());
					System.out.println("회원가입완료");
					cnt++;
				} else {
					System.out.println("변경할 비밀번호 : ");
					pwList.set(seq, scanner.next());
				}
				break;
			case 2:
				if (!loginCk) {
					System.out.println("ID : ");
					String loginId = scanner.next();
					System.out.println("PW : ");
					String loginPw = scanner.next();
					for (int i = 0; i < cnt; i++) {
						if (loginId.equals(idList.get(i)) && loginPw.equals(pwList.get(i))) {
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
