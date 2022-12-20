package ex09;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] menuName = new String[2];
		int[] menuPrice = new int[2];
		int[] menuEa = new int[2];
		int menuNum = 0;
		int cnt = 0;
		out: while (true) {
			while (true) {
				try {
					System.out.println("상품관리");
					System.out.println("1.등록 2.리스트 3.종료 : ");
					menuNum = scanner.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("숫자만 입력해주세요");
					scanner.nextLine();
				}
				
			}
			while (true) {
				try {
					System.out.println("상품명");
					menuName[cnt] = scanner.next();
					switch (menuNum) {
					case 1:
						while (true) {
							try {
								System.out.println("가격");
								menuPrice[cnt] = scanner.nextInt();
								System.out.println("수량");
								menuEa[cnt] = scanner.nextInt();
								break;
							} catch (InputMismatchException e) {
								System.out.println("숫자만 입력해주세요");
								scanner.nextLine();
							}
						}
						cnt++;
						break;
					case 2:
						System.out.println("상품명\t가격\t수량");
						for (int i = 0; i < cnt; i++) {
							System.out.printf("%s\t%d\t%d\n", menuName[i], menuPrice[i], menuEa[i]);
						}
						break;
					case 3:
						break out;
					}
					break;
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("2개 이상 관리할수없습니다.");
					scanner.nextLine();
				}
			}
		}
	}

}
