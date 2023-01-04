package ex18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		List<Ex01Util> arrUtil = new ArrayList<>();
		boolean run = true;
		while (run) {
			System.out.println("1.등록 2.리스트 3.상품검색 4.종료");
			System.out.print("메뉴선택 : ");
			int menuNum = scanner.nextInt();
			scanner.nextLine();
			switch (menuNum) {
			case 1:
				System.out.print("상품명 : ");
				String itemName = scanner.nextLine();
				System.out.print("가격 : ");
				int price = scanner.nextInt();
				System.out.print("수량 : ");
				int Ea = scanner.nextInt();
				Ex01Util ex01 = new Ex01Util(itemName, price, Ea);
				arrUtil.add(ex01);
				break;
			case 2:
				for (Ex01Util ex01Util : arrUtil) {
					System.out.println(ex01Util.toString());
				}
				break;
			case 3:
				System.out.println("1.상품명 2.가격 3.수량");
				int menuNum2 = scanner.nextInt();
				scanner.nextLine();
				switch (menuNum2) {
				case 1:
					System.out.println("상품명 : ");
					String serchName = scanner.nextLine();
					for (Ex01Util ex01Util : arrUtil) {
						if (ex01Util.getItemName().contains(serchName)) {
							System.out.println(ex01Util.toString());
						}
					}
					break;
				case 2:
					System.out.println("가격 : ");
					int serchPrice = scanner.nextInt();
					for (Ex01Util ex01Util : arrUtil) {
						if (ex01Util.getPrice() == serchPrice) {
							System.out.println(ex01Util.toString());
						}
					}
					break;
				case 3:
					System.out.println("수량 : ");
					int serchEa = scanner.nextInt();
					for (Ex01Util ex01Util : arrUtil) {
						if (ex01Util.getEa() == serchEa) {
							System.out.println(ex01Util.toString());
						}
					}
					break;
				default:
					System.out.println("없는번호");
					break;
				}
				break;
			case 4:
				run = false;
				break;
			default:
				System.out.println("없는번호");
				break;
			}
		}

	}

}
