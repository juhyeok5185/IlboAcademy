package ex23_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ItemDAO idao = new ItemDAO();

		System.out.println("상품관리");
		boolean condition = true;
		while (condition) {
			System.out.println("1.등록 2.리스트 3.상품검색 4.수정 5.종료");
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
				System.out.print("상품명 : ");
				String sName = sc.nextLine();
				ArrayList<Item> list = idao.fsearch(sName);
				
				break;
			case 4:
				idao.change();
				break;
			case 5:
				condition = false;
				break;
			default:
				break;
			}

		}
	}

}
