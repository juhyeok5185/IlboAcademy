package ex13;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Date today = null;
		String day[] = new String[3];
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년mm월dd일hh시mm분ss초");
		String[] na = new String[3];
		String[] id = new String[3];
		String[] pw = new String[3];
		int cnt = 0;
		boolean r = true;
		boolean rr = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("회원가입, 정보수정,로그인,로그아웃[배열]");
		while (r) {
			System.out.println("1.회원가입 2.로그인 3.가입리스트 4.로그인리스트 5.종료");
			System.out.print("메뉴선택:");
			int me = sc.nextInt();
			switch (me) {
			case 1:
				System.out.print("이름:");
				na[cnt] = sc.next();
				System.out.print("Id:");
				id[cnt] = sc.next();
				System.out.print("pw");
				pw[cnt] = sc.next();
				today = new Date();
				day[cnt] = sdf.format(today);
				cnt++;
				break;
			case 2:
				System.out.print("Id:");
				String loid = sc.next();
				System.out.print("pw:");
				String lopw = sc.next();
				for (int i = 0; i < cnt; i++) {
					if (id[i].equals(loid) && pw[i].equals(lopw)) {
						while (true) {
							System.out.println("로그인성공");
							System.out.println("1.비밀번호 수정 2.로그아웃(" + id[i] + ")+3.종료");
							int mm = sc.nextInt();
							switch (mm) {
							case 1:
								System.out.print("수정할 pw:");
								pw[i] = sc.next();
								System.out.println("비밀번호가 수정되었습니다.");
								continue;
							case 2 : break;
							case 3 : r =false; break;
						}
							break;
						}
					} else {
						System.out.println("로그인 정보가없습니다.");
					}
				}
				break;
			case 3:
				System.out.println("가입리스트");
				System.out.println("가입날짜\t\t\t\t성명\t\tId\t\tpw");
				System.out.println("-------------------------------------------------------------------");
				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s\t\t%s\t\t%s\t\t%s%n", day[i], na[i], id[i], pw[i]);
				}
				break;
			case 4:
				System.out.println("로그인리스트");
				System.out.print("검색할 Id 입력:");
				String loo = sc.next();
				System.out.println("가입날짜\t\t\t\t성명\t\tId\t\tpw");
				System.out.println("-------------------------------------------------------------------");
				for (int i = 0; i < cnt; i++) {
					if (id[i].equals(loo)) {
						System.out.printf("%s\t\t%s\t\t%s\t\t%s%n", day[i], na[i], id[i], pw[i]);
						rr = true;
					}
				}
				if (rr = false) {
					System.out.println("검색된 id가 존재하지 않습니다.");
				}
				break;
			case 5:
				rr = false;
				break;
			default:
				break;
			}
		}
		System.out.println("프로그램종료");

	}
}