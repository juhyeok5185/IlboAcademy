package ex02;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이를 입력하세요. ");
		int age = scanner.nextInt();
		
		String compare = age < 20 ? "성인" : "학생";
		System.out.println(compare + "입니다");
		
	}

}
