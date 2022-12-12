package ex03;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("초간단 자판기 만들기");
		System.out.println("1.커피 2.콜라 3.바나나우유 4.사이다");
		System.out.println("메뉴번호를 선택하세요 : ");
		int menuNum = scanner.nextInt();
		String menuName = "";
		switch (menuNum) {
		case 1:
			menuName = "커피";
			break;
		case 2:
			menuName = "콜라";
			break;
		case 3:
			menuName = "바나나우유";
			break;
		case 4:
			menuName = "사이다";
			break;
		default:
			System.out.println("없는 메뉴입니다.");
		}
		System.out.println("선택메뉴 : " + menuName);
	}

}
