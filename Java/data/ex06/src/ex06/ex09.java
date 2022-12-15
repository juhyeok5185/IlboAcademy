package ex06;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		long money = 0;
		long fundPrice = 400000000;
		Scanner scanner = new Scanner(System.in);
		System.out.println("초간단 은행 입출력");
		System.out.println("희망은행 : 현재잔액 : " + money);

		out: while (true) {
			System.out.println("1.입금 2.출금 3.잔액 4.구매 5.종료");
			System.out.println("메뉴선택 : ");
			if (scanner.hasNextInt()) {
				int menuNum = scanner.nextInt();
				switch (menuNum) {
				case 1:
					System.out.println("입금금액 : ");
					if (scanner.hasNextLong()) {
						long deposit = scanner.nextLong();
						if (deposit < 0) {
							System.out.println("0보다 작은 금액은 입금할수없습니다.");
						} else {
							money += deposit;
							System.out.println("남은 잔액은 : " + money);
							break;
						}
					} else {
						System.out.println("숫자만 입력할수있습니다.");
						scanner.nextLine();
						break;
					}
				case 2:
					System.out.println("출금금액 : ");
					if (scanner.hasNextLong()) {
						long withdrawal = scanner.nextLong();
						if (withdrawal > money) {
							System.out.println("남은 금액보다 큰 금액은 출금할수없습니다.");
						} else {
							money -= withdrawal;
							System.out.println("남은 잔액은 : " + money);
							break;
						}
					} else {
						System.out.println("숫자만 입력 할수있습니다.");
						scanner.nextLine();
						break;
					}
				case 3:
					System.out.println("잔액 : " + money);
					break;
				case 4:
					System.out.println("펀드 상품");
					System.out.println("1.박주혁전문가 2.홍길동전문가 3.김미르전문가");
					int product = scanner.nextInt();
					switch (product) {
					case 1:
						fundPrice = 50000000;
						break;
					case 2:
						fundPrice = 30000000;
						break;
					case 3:
						fundPrice = 20000000;
						break;
					default:
						System.out.println("없는 상품입니다.");
					}
					System.out.println("현재 펀드상품 가격은 : " + fundPrice);
					System.out.println("구매하실 수량은 : ");
					int ea = scanner.nextInt();
					long total = fundPrice * ea;
					System.out.println("총 구매금액은 : " + total);
					System.out.println("1.구매 2.취소");
					if (total > money) {
						System.out.println("금액이 부족합니다.");
						break;
					} else {
						int buy = scanner.nextInt();
						if (buy == 1) {
							money -= total;
						} else if (buy == 2) {
							continue;
						} else {
							System.out.println("없는 숫자입니다.");
						}
						break;
					}
				case 5:
					System.out.println("종료");
					break out;
				default:
					System.out.println("없는 숫자입니다.");
					break;
				}
			} else {
				System.out.println("숫자만 입력해주세요");
				scanner.nextLine();
				continue;
			}

		}
	}

}
