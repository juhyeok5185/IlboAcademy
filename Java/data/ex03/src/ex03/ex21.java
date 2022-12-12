package ex03;

import java.util.Scanner;

public class ex21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("초간단 메뉴 만들기");
		System.out.println("1.회원가입 2.로그인 3.종료");
		System.out.println(scanner.hasNextInt());


		if (scanner.hasNextInt()) {
			int numMenu = scanner.nextInt();
			if (numMenu ==1) {
				System.out.println("메뉴선택 : 회원가입");
			}
			else if (numMenu ==2) {
				System.out.println("메뉴선택 : 로그인");
			}
			else if (numMenu ==3) {
				System.out.println("메뉴선택 : 종료");
			}
			else {
				System.out.println("엄서연");
			}
		}
		else {
			System.out.println("문자 쓰지마용");
		}
		
		
	}

}

//		switch (numMenu) {
//		case 1:
//			System.out.println("메뉴선택 : 회원가입");
//			break;
//		case 2:
//			System.out.println("메뉴선택 : 로그인");
//			break;
//		case 3:
//			System.out.println("메뉴선택 : 종료");
//			break;
//
//		default:
//			System.out.println("엄서연");
//		}