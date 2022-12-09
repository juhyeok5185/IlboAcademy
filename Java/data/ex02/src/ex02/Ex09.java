package ex02;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 입력 : ");
		int first = scanner.nextInt();
		System.out.println("두번째 입력 : ");
		int second = scanner.nextInt();
		
		int a = 0;
		int b = 0;
		
		if (first > second) {
			a = first;
			b = second;
		}
		else if (first < second) {
			a = second;
			b = first;
		}
				
		System.out.println("a = " + a + " b = " + b);
	}

}
