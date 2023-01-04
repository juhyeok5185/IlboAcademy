package ex18;

import java.util.Scanner;

public class Ex03Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Ex03A b = new Ex03B();
		Ex03A c = new Ex03C();
		boolean run = true;
		
		
		while (run) {
			System.out.println("1.상품등록 2.리스트 3.종료");
			System.out.println("메뉴선택 : ");
			int menuNum = scanner.nextInt();
			scanner.nextLine();

			switch (menuNum) {
			case 1:
				System.out.println("상품이름 : ");
				((Ex03B)b).setSubMenu(scanner.nextLine());
				((Ex03C)c).setSubMenu(scanner.nextLine());
				System.out.println(((Ex03B)b).getSubMenu());
				System.out.println(((Ex03C)c).getSubMenu());
				break;
			case 2:
				System.out.println("리스트");
				break;
			case 3:
				run = false;
				break;
			}
		}

	}
}
