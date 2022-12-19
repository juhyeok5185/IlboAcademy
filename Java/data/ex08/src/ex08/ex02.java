package ex08;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int money = 0;
		System.out.println("초간단 은행 입출력");
		System.out.println("희망은행 : 현재 잔액 : " + money);
		out: while (true) {
			System.out.println("1.입금 2.출금 3.잔액 4.종료");
			System.out.println("메뉴선택");
			int menuNum = scanner.nextInt();
			switch (menuNum) {
			case 1:
				System.out.println("입금 : ");
				int deposit = scanner.nextInt();
				money += deposit;
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
