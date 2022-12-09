package ex02;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 숫자 : ");
		int first = scanner.nextInt();
		System.out.println("두번쨰 숫자 : ");
		int sec = scanner.nextInt();
		
		int compare = first > sec ? first : sec;
		System.out.println("더 큰 수는 :" + compare);
	}

}
