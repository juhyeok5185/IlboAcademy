package ex05;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("단 입력 : ");
		int numInput = scanner.nextInt();
		
		int i = 1;
		while (i <= 9) {
			System.out.printf("%d * %d = %d%n",numInput,i,numInput*i);
			i++;
		}
	}

}
