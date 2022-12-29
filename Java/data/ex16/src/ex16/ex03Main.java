package ex16;

import java.util.Scanner;

public class ex03Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("상품관리");
		ex03Item[] arrItems = new ex03Item[10];
		int cnt = 0;
		while (true) {
			System.out.println("1.등록 | 2.리스트 | 3.종료 : ");
			int menuNum = scanner.nextInt();
			scanner.nextLine();
			switch (menuNum) {
			case 1:
				ex03Item item = new ex03Item();
				System.out.println("상품명 : ");
				String str = scanner.next();
				item.setItemName(str);
				System.out.println("가격 : ");
				int num = scanner.nextInt();
				scanner.nextLine();
				item.setPrice(num);
				System.out.println("수량 : ");
				num = scanner.nextInt();
				scanner.nextLine();
				item.setEa(num);
				arrItems[cnt] = item;
				cnt++;
				break;
			case 2:
				for(int i = 0; i < cnt; i++) {					
					System.out.println(arrItems[i].toString());
				}
			case 3:
				System.out.println("종료");
			}
		}
	}

}
