package ex17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<ex02Menu> arrMenu = new ArrayList<>();
		// List<String> nameList = new ArrayList<>();
		// List<Integer> priceList = new ArrayList<>();
		// List<Integer> eaList = new ArrayList<>();
		ex02Menu exmenu = new ex02Menu();
		while (true) {
			System.out.println("1.등록 2.리스트 3.종료 : ");
			int menuNum = scanner.nextInt();
			switch (menuNum) {
				case 1:
					System.out.println("상품명 : ");
					String name = scanner.next();
					// exmenu.setName(scanner.next());
					// nameList.add(scanner.next());
					System.out.println("가격 : ");
					int price = scanner.nextInt();
					// exmenu.setPrice(scanner.nextInt());
					// priceList.add(scanner.nextInt());
					System.out.println("수량 : ");
					int ea = scanner.nextInt();
					// exmenu.setEa(scanner.nextInt());
					// eaList.add(scanner.nextInt());
					System.out.println("등록완료");
					exmenu = new ex02Menu(name, price, ea);
					arrMenu.add(exmenu);
					break;
				case 2:
					// for(int i = 0; i < nameList.size(); i++) {
					// System.out.println(nameList.get(i));
					// System.out.println(priceList.get(i));
					// System.out.println(eaList.get(i));
					// }
					// for (ex02Menu i : arrMenu) {
					// System.out.println(i.getName());
					// System.out.println(i.getPrice());
					// System.out.println(i.getEa());
					// }
					for (ex02Menu i : arrMenu) {
						System.out.println(i.toString());
					}
					break;
				case 3:
					break;
			}
		}
	}
}