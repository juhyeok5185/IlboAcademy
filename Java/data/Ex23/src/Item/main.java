package Item;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ItemDAO itemDAO = new ItemDAO();
		boolean run = true;
		while (run) {
			System.out.println("1.등록 2.리스트 3.상품검색 4.수정 5.종료");
			System.out.println("메뉴선택 : ");
			int menuNum = scanner.nextInt();
			switch (menuNum) {
			case 1:
				itemDAO.intsert();
				break;
			case 2:
				itemDAO.list();
				break;
			case 3:
				itemDAO.serch();
				break;
			case 4:
				itemDAO.change();
				break;
			case 5:
				run = false;
				break;
			default:
				System.out.println("없는번호");
				break;
			}
		}
	}

}
