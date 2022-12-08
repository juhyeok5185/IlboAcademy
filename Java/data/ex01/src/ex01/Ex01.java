package ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("박주혁");
		System.out.println("나이");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		
		System.out.println(input);
		System.out.println("프로그램이 종료됩니다.");
		scanner.close();
	}
}