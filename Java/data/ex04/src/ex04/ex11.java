package ex04;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int inputNum = scanner.nextInt();
		for (int i = 1; i<=9; i++) {
			System.out.printf("%d * %d = %d%n",inputNum,i,inputNum*i);
		}

	}

}
