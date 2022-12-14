package ex05;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		int money = 1000000;
		Scanner scanner = new Scanner(System.in);
		System.out.println("현재잔고 : 1000000");
		System.out.println("행복과일\n1.사과 2000원\n수박 6000원\n복숭아 4000원");
		System.out.println("메뉴선택 : ");
		int menuNum = scanner.nextInt();
		int menuPrice = 0;
		String menuName = "";
		
		switch (menuNum) {
		case 1: menuPrice = 2000; menuName = "사과"; break;
		case 2: menuPrice = 6000; menuName = "수박"; break;
		case 3: menuPrice = 4000; menuName = "복숭아"; break;
		default: System.out.println("메뉴가 엄서연");
		}
		
		System.out.println("사과구매개수");
		int menuEa = scanner.nextInt();
		System.out.printf("선택한 $s %d개의 가격은 %d입니다.",menuName,menuPrice,menuPrice*menuEa);
	}

}
