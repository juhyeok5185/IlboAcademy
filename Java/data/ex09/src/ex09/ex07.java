package ex09;

import java.util.Iterator;
import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("회원관리");
		String[] name = new String[3];
		int[] age = new int[3];
		int cnt = 0;
		boolean run = true;
		while (run) {
			System.out.println("1.등록 | 2.리스트 | 3.종료 : ");
			int menuNum = scanner.nextInt();
			switch (menuNum) {
			case 1:
				System.out.println("이름 :");
				name[cnt] = scanner.next();
				System.out.println("나이 :");
				age[cnt] = scanner.nextInt();
				cnt++;
				break;
			case 2:
				System.out.println("이름\t나이");
				System.out.println("---------------------------------");
				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s\t%d\n", name[i], age[i]);
				}
				break;
			case 3:
				run = false;
				break;
			}

		}
	}

}
