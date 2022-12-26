package ex13;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date today = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String[] name = new String[2];
		String[] id = new String[2];
		String[] pw = new String[2];
		String[] date = new String[2];
		String loginid = "";
		String loginpw = "";
		boolean loginCk = false;
		
		int loginseq = 0;

		int cnt = 0;

		boolean run = true;

		while (run) {
			if(loginCk) {
				System.out.println("1.비밀번호수정 2.로그아웃(" + name[loginseq] + "님) 3.종료");
				System.out.print("메뉴선택 : ");
			}else {
				System.out.println("1.회원가입 2.로그인 3.가입리스트 4.로그인리스트 5.종료");
				System.out.print("메뉴선택 : ");
			}

			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				if(loginCk) {
					System.out.println("변경할 비밀번호 : ");
					pw[loginseq] = sc.next();
					System.out.println("변경완료");
				}
				else {
					System.out.println("회원가입");
					System.out.print("이름 : ");
					name[cnt] = sc.next();
					System.out.print("id : ");
					id[cnt] = sc.next();
					System.out.print("pw : ");
					pw[cnt] = sc.next();
					System.out.println("회원가입 완료");
					today = new Date();
					date[cnt] = sdf.format(today);
					cnt++;
				}
				break;
			case 2:
				if(loginCk) {
					loginCk = false;
				}
				else {					
					System.out.print("id : ");
					loginid = sc.next();
					System.out.print("pw : ");
					loginpw = sc.next();
					for (int i = 0; i < cnt; i++) {
						if (loginid.equals(id[i]) && loginpw.equals(pw[i])) {
							loginCk = true;
							System.out.println("로그인완료");
							loginseq = i;
							break;
						}
					}
					if(!loginCk) {
						System.out.println("정보가 없습니다.");
					}
				}
				break;
				
			case 3:
				System.out.println("가입리스트");
				System.out.println("날짜\t\t\t이름\tid\tpw");
				System.out.println("----------------------------------------------");
				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s\t%s\t%s\t%s%n", date[i], name[i], id[i], pw[i]);

				}
				break;
			case 4:
				System.out.println("로그인리스트");
				System.out.println("날짜\t\t\t이름\tid\tpw");
				System.out.println("----------------------------------------------");
				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s\t%s\t%s\t%s%n", date[i], name[i], loginid, loginpw);

				}
				break;
			case 5:
				run = false;
				break;

			default:
				System.out.println("메뉴번호를 확인해주세요.");
				break;
			}
		}

	}

}
