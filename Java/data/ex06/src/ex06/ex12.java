package ex06;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int balance = 0;

		while (run) {
			System.out.println("1.입금 2.출금 3.잔액 4.종료");
			System.out.println("메뉴선택 : ");
			if (scanner.hasNextInt()) {

				int menu = scanner.nextInt();
				scanner.nextLine();
				switch (menu) {
				case 1:
					while (run) {
						System.out.println("입금");
						if (scanner.hasNextInt()) {
							int deposit = scanner.nextInt();
							scanner.nextLine();
							if (deposit > 100) {
								balance += deposit;
								System.out.println("입금완료");
								break;
							} else {
								System.out.println("입금액은 100원 이상 가능");
							}
						} else {
							System.out.println("숫자만 입력해 주세요");
							scanner.nextLine();
						}
					}
					break;
				case 2:
					while (run) {
						System.out.println("출금");
						if (scanner.hasNextInt()) {
							int withdrawal = scanner.nextInt();
							scanner.nextLine();
							if (withdrawal > balance) {
								balance -= withdrawal;
								System.out.println("출금완료");
								break;
							} else {
								System.out.println("출금액은 100원 이상 가능");
							}
						} else {
							System.out.println("숫자만 입력 가능");
							scanner.nextLine();
						}
					}
				case 3:
					System.out.printf("잔액 : %d%n", balance);
					break;
				case 4:
					run = false;
					System.out.println("종료");
					break;
				default:
					System.out.println("메뉴번호 확인");
					break;
				}
			} else {
				System.out.println("숫자만 입력가능 합니다.");
				scanner.nextLine();
			}
		}
		System.out.println("프로그램종료");
	}

}
