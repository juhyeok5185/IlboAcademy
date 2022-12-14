package ex05;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("초간단 계산기 만들기");
		System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기");
		System.out.println("사칙연산 선택 : ");
		int selectInput = scanner.nextInt();
		System.out.println("첫번째 : ");
		int firstInput = scanner.nextInt();
		System.out.println("두번째 : ");
		int secInput = scanner.nextInt();
		
		switch (selectInput) {
		case 1: 
		case 2:
		case 3: 
			
		}
		
		System.out.printf("%s 선택",selectInput);
		
	}

}
