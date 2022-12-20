package ex09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		String item[] = new String[2];
		int[] price = new int[2];
		int[] cnt = new int[2];
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("상품명 : ");
				item[0] = scanner.nextLine();
				break;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열범위 초과");
			}
		}
		while(true) {
			try {
				System.out.println("가격 : ");
				price[0] = scanner.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("숫자로 입력해주세요");
				scanner.nextLine();
			}
		}
		while (true) {
			try {
				System.out.println("제품 수량 : ");
				cnt[0] = scanner.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("숫자로 입력해주세요");
				scanner.nextLine();
			}
		}

	}

}
