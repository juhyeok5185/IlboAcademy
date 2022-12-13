package ex04;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int answer = 0;
		
		System.out.println("숫자 입력");
		if(scanner.hasNextInt()) {
			int numInput = scanner.nextInt();
			answer = numInput * 2;
			System.out.println(answer);
		}
		else {
			System.out.println("숫자만 입력가능");
		}
	}

}
