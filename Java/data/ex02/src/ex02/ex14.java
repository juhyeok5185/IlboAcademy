package ex02;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		String menu = "";
		int cost = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("음료자판기 \n금액을 넣어주세요 :");
		int money = scanner.nextInt();
		System.out.println("잔액 : " + money + "원");
		System.out.println("1. 커피(2800원) 2.사이다(1500원) 3.우유(1200원)");
		System.out.println("메뉴를 선택하세요 : ");
		int menuNum = scanner.nextInt();
		switch (menuNum) {
		case 1 :
				menu = "coffee";
			    cost = 2800;
				break;
		case 2 : 
		    	menu = "sprite";
		    	cost = 1500;
		    	break;
		case 3 : 
		    	menu = "milk";
		    	cost = 1200;
		    	break;
		default :
				System.out.println("잔액이 부족합니다.");
				break;
		}
		int answer = money - cost;
		System.out.println(menu + " 판매 완료");
		System.out.println("잔액 : " + answer + "원");
		
	}

}
