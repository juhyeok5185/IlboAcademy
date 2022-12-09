package ex02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 숫자");
		int num1 = scanner.nextInt();
		System.out.println("두번쨰 숫자");
		int num2 = scanner.nextInt();
		
		if (num1 > num2) {
			System.out.println("더 큰값은" + num1);
		}
		else {
			System.out.println("더 큰값은" + num2);
		}
		
	}

}
