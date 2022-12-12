package ex03;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("은행 입출력");
		System.out.println("1.입금 2.출금 3.잔액 4.종료");
		System.out.println("메뉴선택 : ");
		int selectMenu = scanner.nextInt();

		switch (selectMenu) {
		case 1:
			System.out.println("입금선택");
			break;
		case 2:
			System.out.println("출금선택");
			break;
		case 3:
			System.out.println("잔액선택");
			break;
		case 4:
			System.out.println("종료선택");
			break;
		default :
			System.out.println("엄서영");
			break;
		}
	}

}
