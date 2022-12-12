package ex03;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력하세요 : ");
		int monInput = scanner.nextInt();
//		switch (monInput) {
//		case 1, 3, 5, 7, 8, 10, 12:
//			System.out.println(monInput + "월은" + "31일까지 입니다.");
//			break;
//		case 4, 6, 9, 11:
//			System.out.println(monInput + "월은" + "30일까지 입니다.");
//			break;
//		case 2:
//			System.out.println(monInput + "월은" + "29일까지 입니다.");
//		default:
//			System.out.println("해당월을 다시 입력해 주세요");
//			break;
//		}
		
		switch (monInput){
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			System.out.println(monInput + "31일 까지 입니다.");
			break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			System.out.println(monInput + "30일 까지 입니다.");
		case 2 :
			System.out.println(monInput + "29일 까지 입니다.");
		}
	}

}
