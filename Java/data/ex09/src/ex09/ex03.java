package ex09;

import java.util.Iterator;
import java.util.Scanner;

public class ex03 {

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
				if(cnt < 3) {					
					System.out.println("이름 :");
					name[cnt] = scanner.next();
					System.out.println("id :");
					id[cnt] = scanner.next();
					System.out.println("pw :");
					pw[cnt] = scanner.next();
					cnt++;
				}else {
					System.out.println("3명이상 등록이 불가능합니다.");
					break;
				}
				break;
			case 2:
				for (int i = 0; i < cnt; i++) {
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
