package ex02;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1번째 숫자 : ");
		int first = scanner.nextInt();
		System.out.println("2번째 숫자 : ");
		int second = scanner.nextInt();
		System.out.println("3번째 숫자 : ");
		int third = scanner.nextInt();
		int max = 0;
		
		if (first > second && first > second) {
			max = first;
		}
		else if (second > first && second > third) {
			max = second;
		}
		else {
			max = third;
		}
		
		System.out.println("가장 큰 숫자는 : " + max );
		
//	
//		if (first < second) {
//			if (second < third) {
//				max = third;
//			}
//			else if (second > third) {
//				max = second;
//			}
//		}
//		else if (first > second) {
//			if (first > third) {
//				max = first;
//			}
//		}	
	}

}
