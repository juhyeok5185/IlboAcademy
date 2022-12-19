package ex08;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int money = 0;
		boolean depositStart = false;
		System.out.println("초간단 은행 입출력");
		System.out.println("희망은행 : 현재 잔액 : " + money);
		out: while (true) {
			System.out.println("1.입금 2.출금 3.잔액 4.종료");
			System.out.println("메뉴선택");
			int menuNum = scanner.nextInt();
			scanner.nextLine();
			switch (menuNum) {
			case 1:
				depositStart = true;
				while (depositStart) {
					System.out.println("입금 : ");
					if (scanner.hasNextInt()) {						
						int deposit = scanner.nextInt();
						scanner.nextLine();
						if(deposit > 1000) {							
							money += deposit;
						}
						else {
							System.out.println("1000원 이상만 입금이 가능합니다.");
							continue;
						}
						break;
					}
					else {
						System.out.println("숫자만입력");
						scanner.nextLine();
					}
				}
				break;
			case 2:
				System.out.println("출금 : ");
				int withdrwal = scanner.nextInt();
				money -= withdrwal;
				break;
			case 3:
				System.out.println("잔액 : " + money);break;
			case 4:
				System.out.println("종료");
				break out;
			default:
				System.out.println("없는번호");
			}
		}
	}

}
