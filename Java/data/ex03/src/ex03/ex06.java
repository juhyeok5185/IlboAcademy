package ex03;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int numInput = scanner.nextInt();
		System.out.println(numInput % 2 == 0 ? "짝수" : "홀수");
	}
}
