package ex03;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("초간단 계산기 만들기");
		System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기");
		System.out.println("사칙연산 선택 : ");
		int fund = scanner.nextInt();
		System.out.println("첫번째 숫자");
		int num1 = scanner.nextInt();
		System.out.println("두번째 숫자");
		int num2 = scanner.nextInt();
		switch (fund) {
		case 1:
			System.out.println("더하기 선택");
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2) );
			break;
		case 2:
			System.out.println("빼기 선택");
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2) );
			break;
		case 3:
			System.out.println("곱하기 선택");
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2) );
			break;
		case 4:
			System.out.println("나누기 선택");
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2) );
			break;
		default :
			System.out.println("잘못입력");
			break;
		}

	}

}
