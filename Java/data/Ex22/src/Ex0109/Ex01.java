package Ex0109;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		boolean run = true;
		Item item = new Item();
		ItemDAO idao = new ItemDAO();

		while (run) {

			System.out.println("1.등록 ㅣ 2.리스트 ㅣ 3.종료");
			System.out.print("메뉴선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			switch (menu) {
			case 1:
				idao.insert();
				break;
			case 2:
				idao.list();
				break;
			case 3:
				run = false;
				break;

			default:
				System.out.println("메뉴번호 확인!");
				break;
			}
		}
	}

}
