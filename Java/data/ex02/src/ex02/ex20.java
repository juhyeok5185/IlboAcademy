package ex02;

import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ex20 e20 = new ex20();
		String menu = "";
		int menuCost = 0;

		System.out.println("현재금액 : 100000원");
		int money = 100000;
		System.out.println("초간단 자판기 만들기");
		System.out.println("1.커피(1000원) 2.콜라(2000원) 3.바나나우유(3000원) 4.사이다(2000원)");
		System.out.println("메뉴번호를 선택하세요 : ");
		int selectMenu = scanner.nextInt();
		
		if (selectMenu == 1) {
			menu = "커피";
			menuCost = 1000;
		}
		else if (selectMenu == 2) {
			menu = "콜라";
			menuCost = 2000;
		}
		else if (selectMenu == 3){
			menu = "바나나우유";
			menuCost = 3000;
		}
		else if (selectMenu == 4) {
			menu = "사이다";
			menuCost = 2000;
		}
		else {
			System.out.println("메뉴가 없습니다.");
		}
		
		System.out.println("선택메뉴 " + menu);
		System.out.println(menu + " 구매개수 : ");
		int menuN = scanner.nextInt();
		int menuC = menuCost * menuN;
		if(menuC < money) {
			System.out.println("결제금액 : " + menuC);
			System.out.println("현재잔고는 " + money + "원 입니다. 구매하시겠습니까?");
			System.out.println("1.구매 2.취소");
		}
		else {
			System.out.println("잔액이 부족합니다.");
		}
		int yesOrNo = scanner.nextInt();
		int rMoney = 0;
		
		if (yesOrNo == 1) {
			rMoney = money - menuC;
			System.out.println("구매완료");
			System.out.println("구매후 잔액 : " + rMoney);
		}
		else if (yesOrNo == 2) {
			System.out.println("이용해주셔서 감사합니다.");
		}		
		
	}

}
