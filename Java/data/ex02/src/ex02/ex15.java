package ex02;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("음료자판기 \n금액을 넣어주세요 :");
		int money = scanner.nextInt();
		System.out.println("잔액 : " + money + "원");
		System.out.println("1. 커피(2800원) 2.사이다(1500원) 3.우유(1200원)");
		System.out.println("메뉴를 선택하세요 : ");
		int menuNum = scanner.nextInt();
		String menu = "";
		int cost = 0;
		
		if (menuNum == 1) {
			System.out.println("커피 판매완료");
			money -= 2800;
			System.out.println("잔액 : " + money );
		}
		else if (menuNum == 2) {
			System.out.println("커피 판매완료");
			money -= 1500;
			System.out.println("잔액 : " + money );
		}
		else if (menuNum == 3) {
			System.out.println("커피 판매완료");
			money -= 1200;
			System.out.println("잔액 : " + money );
		}
		else {
			System.out.println("메뉴가 없습니다.");
		}
		
	}

}
