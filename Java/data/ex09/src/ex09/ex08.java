package ex09;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date today = new Date();
		String[] name = new String[100];
		String[] id = new String[100];
		String[] pw = new String[100];
		String[] date = new String[100];
		String ldateString = "";
 		String lpwString = "";
 		String lnameString = "";
		
		boolean run = true;
		boolean loginck = false;
		int cnt = 0;
		while (run) {
			if (loginck == true) {
				System.out.println("1.정보수정 2."+lnameString+"님 로그아웃 3.리스트 4.종료");
				int loginMenuNum = scanner.nextInt();
				switch (loginMenuNum) {
				case 1:
					System.out.println("변경할 비밀번호 : ");
					String changePw = scanner.next();
					lpwString = changePw;
				case 2:
					loginck = false;
					break;
				case 3:
					System.out.println("날짜\t\t이름\tid\tpw\t");
					System.out.println("-------------------------------");
					for (int i = 0; i < cnt; i++) {
						System.out.printf("%s\t%s\t%s\t%s\n",date[i],name[i],id[i],pw[i]);
					}
					break;
				case 4:
					run = false;
					break;
				}
			} else {
				System.out.print("1.회원가입 2.로그인 3.리스트 4.종료 : ");
				int menuNum = scanner.nextInt();
				scanner.nextLine();
				switch (menuNum) {
				case 1:
					today = new Date();
					System.out.println("이름 : ");
					name[cnt] = scanner.next();
					System.out.println("id : ");
					id[cnt] = scanner.next();
					System.out.println("pw : ");
					pw[cnt] = scanner.next();
					date[cnt] = sdf.format(today);
					cnt++;
					break;
				case 2:
					System.out.println("id : ");
					String loginId = scanner.next();
					System.out.println("pw : ");
					String loginPw = scanner.next();
					for (int i = 0; i < cnt; i++) {
						if (loginId.equals(id[i]) && loginPw.equals(pw[i])) {
							loginck = true;
							lpwString = pw[i];
							ldateString = date[i];
							lnameString = name[i];
							System.out.println("로그인 완료");
							break;
						} else if(i == cnt) {
							System.out.println("정보를 확인하세요");
							continue;
						}
					}
					break;
				case 3:
					System.out.println("----------------------------------------");
					System.out.println("가입날짜\t\t이름\tid\tpw\t");
					for (int i = 0; i < cnt; i++) {
						System.out.printf("%s\t%s\t%s\t%s\n",date[i],name[i],id[i],pw[i]);
					}
					break;
				case 4:
					run = false;
					break;
				}
			}
		}
	}
}
