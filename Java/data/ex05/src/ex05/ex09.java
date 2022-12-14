package ex05;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int money = 0;
		System.out.println("희망은행 : 현재 잔액 : " + money);
		while (true) {

			System.out.println("\n1.입금 2.출금 3.잔액 4.종료");
			System.out.print("메뉴선택 : ");

			if (scanner.hasNextInt()) {
				int menuNum = scanner.nextInt();
				if (menuNum == 1) {
					System.out.print("입금금액 : ");
					int firstNumMenu = scanner.nextInt();
					money += firstNumMenu;
					System.out.println("잔액 : " + money);
				} else if (menuNum == 2) {
					if(money <= 0) {
						System.out.println("잔액이 부족합니다.");
						continue;
					}
					System.out.print("출금금액 : ");
					int secNumMenu = scanner.nextInt();
					money -= secNumMenu;
					System.out.println("잔액 : " + money);
				} else if (menuNum == 3) {
					System.out.println("잔액 : " + money);
				} else if (menuNum == 4) {
					System.out.println("종료");
					break;
				} else {
					System.out.println("없는번호입니다.");
					continue;
				}
			} else {
				System.out.println("문자를 입력해주세요");
				scanner.nextLine();
				continue;
			}

		}
	}

}
