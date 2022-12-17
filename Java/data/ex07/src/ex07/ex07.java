package ex07;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		out: while (true) {

			System.out.println("1.중식 2.한식 3.종료");
			System.out.println("메인메뉴선택 : ");
			int trFoodNum = scanner.nextInt();
			switch (trFoodNum) {
			case 1:
				System.out.println("1.짜장면 2.짬뽕 3.만두");
				int menuNum = scanner.nextInt();
				switch (menuNum) {
				case 1:
					System.out.println("짜장면 선택");
					break;
				case 2:
					System.out.println("짬뽕 선택");
					break;
				case 3:
					System.out.println("만두");
					break;

				}
				break;
			case 2:
				System.out.println("1.불고기 2.한정식 3.갈비");
				int kmenuNum = scanner.nextInt();
				switch (kmenuNum) {
				case 1:
					System.out.println("불고기 선택");
					break;
				case 2:
					System.out.println("한정식 선택");
					break;
				case 3:
					System.out.println("갈비 선택");
					break;
				}
				break;
			case 3:
				System.out.println("종료");
				break out;

			}

		}
	}

}
