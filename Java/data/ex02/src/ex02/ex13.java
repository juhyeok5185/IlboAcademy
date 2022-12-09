package ex02;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("초간단 자판기 만들기");
		System.out.println("1.커피 2.콜라 3.바나나우유 4.사이다");
		System.out.println("메뉴번호를 선택하세요 : ");
		int menu = scanner.nextInt();
		String selectMenu = "";
		
		if (menu == 1) {
			selectMenu = "커피";
		}
		else if (menu == 2) {
			selectMenu = "콜라";
		}
		else if (menu == 3) {
			selectMenu = "바나나우유";
		}
		else if (menu == 4){
			selectMenu = "사이다";
		}
		else {
			System.out.println("선택 메뉴가 없습니다.");
		}
		
		System.out.println("선택메뉴 : " + selectMenu);
	}

}
