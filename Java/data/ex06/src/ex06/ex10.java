package ex06;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("초간단 자판기 만들기");
			System.out.println("메뉴선택");
			System.out.println("1.커피 2.아이스커피 3.우유 4.사이다");
			System.out.println("메뉴번호를 선택하세요 : ");
			int menuNum = scanner.nextInt();
			if (menuNum == 1) {
				System.out.println("선택메뉴 : 커피");
			}
			else if (menuNum == 2) {
				System.out.println("선택메뉴 : 아이스커피");
			}
			else if (menuNum == 3) {
				System.out.println("선택메뉴 : 우유");
			}
			else if (menuNum == 4) {
				System.out.println("선택메뉴 : 사이다");
			}
		}
	}

}
