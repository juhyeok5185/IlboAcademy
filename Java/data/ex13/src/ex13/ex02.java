package ex13;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[3];
		String[] id = new String[3];
		String[] pw = new String[3];
		String loginId = "";
		String loginPw = "";
		String newPw = "";
		int cnt = 0;
		int number = 0;
		boolean run = true;
		boolean loginCk = false;

		while (run) {
			if (!loginCk) {
				System.out.println("1.회원가입 2.로그인 3.가입리스트 4.로그인리스트 5.종료");
			} else {
				System.out.printf("1.비밀번호 수정 2.로그아웃( %s )님 3.가입리스트 4.로그인리스트 5.종료", name);
			}
			System.out.print("메뉴선택: ");
			number = sc.nextInt();
			sc.nextLine();
			switch (number) {
			case 1:
				if (!loginCk) {
					System.out.println("회원가입");
					System.out.print("이름: ");
					name[cnt] = sc.nextLine();
					System.out.print("id: ");
					id[cnt] = sc.nextLine();
					System.out.print("pw: ");
					pw[cnt] = sc.nextLine();
					System.out.println("회원가입 완료");
					cnt++;

				} else {
					System.out.println("수정할 PW:");
					newPw = sc.nextLine();
					pw[cnt].equals(newPw);
					System.out.println("비밀번호가 수정되었습니다");
				}
				break;
			case 2:
				if (!loginCk) {
					System.out.print("ID: ");
					loginId = sc.nextLine();
					System.out.print("PW: ");
					loginPw = sc.nextLine();
					for (int i = 0; i < cnt; i++) {
						if (loginId.equals(id[i]) && loginPw.equals(pw[i])) {
							loginCk = true;
							break;
						} 
					}
					if(!loginCk) {
						System.out.println("아이디 비밀번호를 확인해주세요");
					}
				} else {
					loginCk = false;
				}

				break;
			case 3:
				System.out.println("가입리스트");
				System.out.println("성명\t 아이디\t 비밀번호");
				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s\t%s\t%s", name[i], id[i], pw[i]);
				}
				break;
			case 4:
				System.out.println("로그인리스트");
				System.out.println("성명\t 아이디\t 비밀번호");
				
				break;
			case 5:
				System.out.println("프로그램 종료");
				run = false;
				break;

			default:
				break;
			}
		}

	}
}
