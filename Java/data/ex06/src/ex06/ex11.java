package ex06;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int money = 0;
		System.out.println("은행입출력");
		while (true) {
			System.out.println("1.입급 2.출금 3.잔액 4.종료");
			if(scanner.hasNextInt()) {	
				System.out.println("메뉴선택 : ");
				int menuNum = scanner.nextInt();
				if (menuNum == 1) {
					while (true) {
						System.out.println("입금액 : ");
						if(scanner.hasNextInt()) {							
							int inputDeposit = scanner.nextInt();
							if (inputDeposit > 1000) {	
								System.out.println("입금완료");
								money += inputDeposit;
								break;
							}
							else {
								System.out.println("1000원 이상만 입금가능합니다.");
							}
						}
						else {
							System.out.println("문자만 입력하세요");
						}
					}
				}
				if (menuNum == 2) {
					System.out.println("출금액");
				}
				if (menuNum == 3) {
					System.out.println("잔액");
				}
				if (menuNum == 4) {
					break;
				}
			}
			else {
				System.out.println("문자만 입력하세요");
			}
		}
		
	}

}
