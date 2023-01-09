package FileExam;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		ItemDAO itemDAO = new ItemDAO();
		Item item = new Item();
		itemDAO.setup();

		while (run) {
			System.out.println("1.등록 2.리스트 3.수정 4.종료");
			int menuNum = scanner.nextInt();
			switch (menuNum) {
			case 1:
				itemDAO.insert();
				break;
				
			case 2:
				itemDAO.list();
				break;
			case 3:
				itemDAO.change();
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
