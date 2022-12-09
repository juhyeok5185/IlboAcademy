package ex02;

import java.util.Scanner;

public class ex21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		if (input % 2 != 0) {
			System.out.println("홀수");
		}
		else if (input % 2 == 0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("0은 안됩니당");
		}
	}

}
