package ex04;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String tradFoodString = "";
		int foodNum = 0;
		String foodString = "";
		System.out.println("1.중식 2.한식 3.종료");
		System.out.println("메인메뉴 : ");
		if (scanner.hasNextInt()) {
			int menuNum = scanner.nextInt();
			if (menuNum == 1) {
				tradFoodString = "중식";
			} else if (menuNum == 2) {
				tradFoodString = "한식";
			} else if (menuNum == 3) {
				tradFoodString = "종료";
				System.out.println("프로그램 종료");
				System.exit(0);
			}
			else {
				System.out.println("다시골라주세요");
			}
		}
		else {
			System.out.println("문자를 입력해주세요");
			System.exit(0);
		}

		System.out.println(tradFoodString + " 메뉴를 선택하세요 : ");

		if (tradFoodString.equals("중식")) {
			System.out.println("1.짜장면 2.짬뽕 3.만두");
			foodNum = scanner.nextInt();
			switch (foodNum) {
			case 1:
				foodString = "짜장면";
				break;
			case 2:
				foodString = "짬뽕";
				break;
			case 3:
				foodString = "만두";
				break;
			default :
				System.out.println("다시골라주세요");
				break;
			}
		} else if (tradFoodString.equals("한식")) {
			System.out.println("1.불고기 2.한정식 3.갈비");
			foodNum = scanner.nextInt();
			switch (foodNum) {
			case 1:
				foodString = "불고기";
				break;
			case 2:
				foodString = "한정식";
				break;
			case 3:
				foodString = "갈비";
				break;
			default :
				System.out.println("다시골라주세요");
				break;
			}
		}

		System.out.println(foodString + "선택");
	}

}
