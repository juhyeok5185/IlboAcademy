package ex04;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("초간단 숫자 교환기");
		System.out.println("num1");
		int num1 = scanner.nextInt();
		System.out.println("num2");
		int num2 = scanner.nextInt();
		int num3 = 0;
		
		System.out.println("교환전");
		System.out.println("num1 숫자 : " + num1);
		System.out.println("num2 숫자 : " + num2);
		
		num3 = num1;
		num1 = num2;
		num2 = num3;
		
		System.out.println("교환후");
		System.out.println("num1 숫자 : " + num1);
		System.out.println("num2 숫자 : " + num2);
		
	}

}
