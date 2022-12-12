package ex03;

import java.util.Scanner;

public class ex19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력하세요 : ");
		int numInput = scanner.nextInt();
		switch (numInput) {
		case 1,3,5,7,8,10,12 :
			System.out.printf("%d월은 31일까지 입니다.", numInput);
			break;
		case 4,6,9,11 :
			System.out.printf("%d월은 30일까지 입니다.", numInput);
			break;
		case 2:
			System.out.printf("%d월은 29일까지 입니다.", numInput);
			break;
		default:
			System.out.println("해당월을 다시 입력해 주세요");
		}
	}

}
