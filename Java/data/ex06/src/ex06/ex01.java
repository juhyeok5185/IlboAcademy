package ex06;

import java.awt.Menu;
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String menuString = "";
		System.out.println("초간단 자판기 만들기");
		while (true) {
			System.out.println("1.커피 2.아이스커피 3.우유 4.사이다");
			System.out.println("메뉴선택 : ");
			if (scanner.hasNextInt()) {
				int menuNum = scanner.nextInt();
				switch (menuNum) {
				case 1:
					menuString = "커피";
					break;
				case 2:
					menuString = "아이스커피";
					break;
				case 3:
					menuString = "우유";
					break;
				case 4:
					menuString = "사이다";
					break;
				default:
					System.out.println("해당번호는 메뉴가 없습니다.");
					continue;
				}
				System.out.println("선택메뉴 : " + menuString);
			}
			else {
				System.out.println("숫자만 입력이 가능합니다.");
				scanner.nextLine();
				continue;
			}
		}
	}
}
