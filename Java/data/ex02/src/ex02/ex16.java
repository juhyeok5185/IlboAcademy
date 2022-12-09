package ex02;

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("음료자판기 \n금액을 넣어주세요 :");
		int money = scanner.nextInt();
		System.out.println("잔액 : " + money + "원");
		System.out.println("1. 커피(2800원) 2.사이다(1500원) 3.우유(1200원)");
		System.out.println("메뉴를 선택하세요 : ");
		int menuNum = scanner.nextInt();
		
		ex16 e16 = new ex16();
		int calcul = e16.calcul(money , menuNum);
		String menu = e16.menu(menuNum);
		
		System.out.println("선택 메뉴 : " + menu);
		System.out.println("남은잔액 : " + calcul);
		
	}
	
	public int calcul(int money , int menuNum) {
		int cost = 0;
		switch (menuNum) {
		case 1 : cost = 2800;break;
		case 2 : cost = 1500;break;
		case 3 : cost = 1200;break;
		}
		return money - cost;
	}
	
	public String menu(int a) {
		String menuName = "";
		switch (a) {
		case 1 : menuName = "커피";break;
		case 2 : menuName = "사이다";break;
		case 3 : menuName = "우유";break;
		}
		return menuName;
	}

}
