package ex03;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력 후 큰 숫자를 출력");
		System.out.println("첫번째 숫자 입력 : ");
		int firstNum = scanner.nextInt();
		System.out.println("두번쨰 숫자 입력 : ");
		int secNum = scanner.nextInt();
		
		System.out.println("결과 출력");
		
//		int maxInt = firstNum < secNum ? secNum : firstNum;
//		
//		System.out.println("큰숫자는 : " + maxInt);
		System.out.println("큰숫자는 : " + (firstNum < secNum ? secNum : firstNum));
	}

}
