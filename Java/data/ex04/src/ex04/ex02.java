package ex04;

import java.util.Scanner;

import javax.sql.rowset.JoinRowSet;

public class ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int money = 100000;
		String menuName = "";
		int menuCost = 0;
		System.out.println("초간단 자판기 만들기");
		System.out.println("1.커피(1000) \n2.콜라(2000) \n3.바나나우유(3000)\n사이다(2000)");
		System.out.println("메뉴번호를 선택하세요 : ");

		int menuNum = scanner.nextInt();
		switch (menuNum) {
		case 1:
			menuName = "커피";
			menuCost = 1000;
			break;
		case 2:
			menuName = "콜라";
			menuCost = 2000;
			break;
		case 3:
			menuName = "바나나우유";
			menuCost = 3000;
			break;
		case 4:
			menuName = "사이다";
			menuCost = 2000;
			break;
		default:
			System.out.println("없는 번호입니다.");
		}

		System.out.println(menuName + " 구매개수 : ");
		int ea = scanner.nextInt();
		int maxCost = money - (menuCost * ea);
		System.out.printf("현재잔고는 %d입니다. 구매하시겠습니까?", money);
		System.out.println("1.구매 2.취소");

		int call = scanner.nextInt();
		if (call == 1 && maxCost > 0) {
			System.out.println("구매완료");
			System.out.println("구매후 잔액" + maxCost);
		} else if (call == 2) {
			System.out.println("취소하셨습니다 이용해주셔서 감사합니다.");
		} else if (maxCost < 0) {
			System.out.println("잔액이 부족합니다.");
		}

	}

}
