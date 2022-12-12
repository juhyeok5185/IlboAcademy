package ex03;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력하세요 : ");
		int num = scanner.nextInt();
		switch (num) {
		case 3, 4, 5:
			System.out.println(num + "월은 봄 입니다");
			break;
		case 6, 7, 8:
			System.out.println(num + "월은 여름 입니다");
			break;
		case 9, 10, 11:
			System.out.println(num + "월은 가을 입니다");
			break;
		case 12, 1, 2:
			System.out.println(num + "월은 겨울 입니다");
			break;
		default :
			System.out.println("해당월을 다시 입력해주세요");

		}
	}

}
