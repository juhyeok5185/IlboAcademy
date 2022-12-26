package ex13;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		String[] pName = new String[100];
		int[] pPrice = new int[100];
		int[] pEa = new int[100];
		int cnt = 0;
		int serchi = 0;
		
		while (run) {
			System.out.println("1.등록 2.리스트 3.상품검색 4.등록수정 5.종료");
			System.out.println("메뉴선택 : ");
			int menuNum = scanner.nextInt();
			scanner.nextLine();
			switch (menuNum) {
			case 1:
				System.out.println("상품명 : ");
				pName[cnt] = scanner.next();
				System.out.println("가격 : ");
				pPrice[cnt] = scanner.nextInt();
				System.out.println("수량 : ");
				pEa[cnt] = scanner.nextInt();
				cnt++;
				break;
			case 2:
				System.out.println("상품명\t가격\t수량\t");
				System.out.println("-------------------------------");
				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s\t%d\t%d\n", pName[i], pPrice[i], pEa[i]);
				}
				break;
			case 3:
				System.out.println("상품명\t가격\t수량\t");
				System.out.println("-------------------------------");
				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s\t%d\t%d\n", pName[i], pPrice[i], pEa[i]);
				}
				System.out.println("상품이름 : ");
				String pSerch = scanner.next();
				for (int i = 0; i < cnt; i++) {
					if (pSerch.equals(pName[i])) {
						System.out.println("상품명\t가격\t수량\t");
						System.out.println("-------------------------------");
						System.out.printf("%s\t%d\t%d\n", pName[i], pPrice[i], pEa[i]);
					}
				}
				break;
			case 4:
				System.out.println("상품명\t가격\t수량\t");
				System.out.println("-------------------------------");
				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s\t%d\t%d\n", pName[i], pPrice[i], pEa[i]);
				}
				System.out.println("상품이름 : ");
				String prSerch = scanner.next();
				for (int i = 0; i < cnt; i++) {
					if (prSerch.equals(pName[i])) {
						System.out.println("상품명\t가격\t수량\t");
						System.out.println("-------------------------------");
						System.out.printf("%s\t%d\t%d\n", pName[i], pPrice[i], pEa[i]);
						serchi = i;
					}
				}
				System.out.println("1.상품명 2.가격 3.수량");
				System.out.println("선택 : ");
				menuNum = scanner.nextInt();
				scanner.nextLine();
				switch (menuNum) {
				case 1:
					System.out.println("변경할 상품명 :");
					String changeName = scanner.next();
					pName[serchi] = changeName;
					break;
				case 2:
					System.out.println("변경할 가격 :");
					int changePrice = scanner.nextInt();
					pPrice[serchi] = changePrice;
					break;
				case 3:
					System.out.println("변경할 수량 :");
					int changeEa = scanner.nextInt();
					pEa[serchi] = changeEa;
					break;
				default:
					System.out.println("번호없음");
				}
				break;
			case 5:
				run = false;
				break;
			default:
				System.out.println("번호를 확인해주세요");
				break;
			}
		}
	}

}
