package ex05;

import java.util.Iterator;
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("단 입력 : ");
		int inputDan = scanner.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d%n",inputDan,i,inputDan*i);
		}
	}

}
