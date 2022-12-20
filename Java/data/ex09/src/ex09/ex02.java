package ex09;

import java.util.Iterator;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("회원관리");
		String[] name = new String[3];
		String[] id = new String[3];
		String[] pw = new String[3];
		int cnt = 0;
		boolean run = true;
		while (run) {
			System.out.println("1.등록 | 2.리스트 | 3.종료 : ");
			int menuNum = scanner.nextInt();
			switch (menuNum) {
			case 1:
				for (int i = cnt; i < cnt + 1; i++) {
					System.out.println("이름 :");
					name[i] = scanner.next();
					System.out.println("id :");
					id[i] = scanner.next();
					System.out.println("pw :");
					pw[i] = scanner.next();
				}
				cnt++;
				break;
			case 2:
				for (int i = 0; i < name.length; i++) {
					System.out.println(name[i] + id[i] + pw[i]);
				}
				break;
			case 3:
				run = false;
				break;
			default:
			}

		}
	}

}
