package ex23_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;



public class ItemDAO {

	Scanner sc = new Scanner(System.in);
	Item item;
	ArrayList<Item> ilist = new ArrayList<>();
	File file = null;
	public ItemDAO() {
		// TODO Auto-generated constructor stub
		file = new File("c:/java/item2.txt");
		setup();
	}

	private void setup() {
		// TODO Auto-generated method stub
		try {
			Reader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader);
			String data;
			while ((data = br.readLine()) != null) {
//				검색이름
				item = new Item();
				String[] text = data.split(",");
				item.setName(text[0]);
				item.setPrice(Integer.parseInt(text[1]));
				item.setQuantity(Integer.parseInt(text[2]));
				ilist.add(item);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void insert() {
		// TODO Auto-generated method stub
		item = new Item();
		System.out.println("1.등록");
		System.out.print("상품명 : ");
		String name = sc.nextLine();
		item.setName(name);
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		item.setPrice(price);
		System.out.print("수량 : ");
		int quantity = sc.nextInt();
		sc.nextLine();
		item.setQuantity(quantity);
		ilist.add(item);

		try {
			if (!file.exists()) {
				file.createNewFile();
			}
			Writer wirter = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(wirter);
			Scanner sc = new Scanner(System.in);
			bw.write(item.toString() + "\n");
			bw.flush();
			bw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void list() {
		// TODO Auto-generated method stub
		System.out.println("2.리스트");
		System.out.println("상품명\t가격\t수량");
		System.out.println("----------------------------");
		for (Item a : ilist) {
			System.out.println(a.getName() + "\t" + a.getPrice() + "\t" + a.getQuantity());
		}
	}

	public void search() {
		// TODO Auto-generated method stub
		System.out.println("3.상품검색");
		System.out.println("1.상품명 2.가격 3.수량 4.종료");
		int menu = sc.nextInt();
		sc.nextLine();

		switch (menu) {
		case 1:
			System.out.println("1.상품명");
			String sName = sc.nextLine();
			for (Item i : ilist) {
				if (sName.equals(i.getName())) {
					System.out.println("상품명\t가격\t수량");
					System.out.println("----------------------------");
					System.out.println(i.getName() + "\t" + i.getPrice() + "\t" + i.getQuantity());
				}
			}
			break;
		case 2:
			System.out.println("2.가격");
			int sPrice = sc.nextInt();
			sc.nextLine();
			for (Item i : ilist) {
				if (sPrice == i.getPrice()) {
					System.out.println("상품명\t가격\t수량");
					System.out.println("----------------------------");
					System.out.println(i.getName() + "\t" + i.getPrice() + "\t" + i.getQuantity());
				}
			}

			break;
		case 3:
			System.out.println("3.수량");
			int sQuantity = sc.nextInt();
			sc.nextLine();
			for (Item i : ilist) {
				if (sQuantity == i.getPrice()) {
					System.out.println("상품명\t가격\t수량");
					System.out.println("----------------------------");
					System.out.println(i.getName() + "\t" + i.getPrice() + "\t" + i.getQuantity());
				}
			}
			break;
		default:
			break;
		}
	}

	public ArrayList<Item> fsearch(String sName) {
		// TODO Auto-generated method stub
		ArrayList<Item> itemSerachList = new ArrayList<>();
		try {
			Reader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader);
			String data = null;
			try {
				while ((data = br.readLine()) != null) {
					item = new Item();
					String[] text = data.split(",");
					if (sName.equals(text[0])) {
						System.out.println(text[0] + "," +text[1] + "," + text[2]);
						break;
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return itemSerachList;

	}


	public void change() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1.상품명 2.가격 3.수량 4.삭제");
		int menuNum = scanner.nextInt();
		switch (menuNum) {
		case 1:
			System.out.println("상품명 검색 : ");
			String serchItemName = scanner.next();
			for (Item i : ilist) {
				if (serchItemName.contains(i.getName())) {
					System.out.println("변경할 이름 : ");
					i.setName(scanner.next());
				}
			}
			changeSetUp();
			break;
		case 2:
			System.out.println("가격 검색 : ");
			int serchPrice = scanner.nextInt();
			for (Item i : ilist) {
				if (serchPrice == i.getPrice()) {
					System.out.println("변경할 가격 : ");
					i.setPrice(scanner.nextInt());
				}
			}
			changeSetUp();
			break;
		case 3:
			System.out.println("수량 검색 : ");
			int serchEa = scanner.nextInt();
			for (Item i : ilist) {
				if (serchEa == i.getPrice()) {
					System.out.println("변경할 가격 : ");
					i.setQuantity(menuNum);
				}
			}
			changeSetUp();
			break;
		case 4:
			System.out.println("삭제할 상품명 검색 : ");
			serchItemName = scanner.next();
			for (int i = 0; i < ilist.size(); i++) {
				if (serchItemName.equals(ilist.get(i).getName())) {
					ilist.remove(i);
				}
			}
			changeSetUp();
			break;
		default:
			System.out.println("없는번호");
			break;
		}
	}


	public void changeSetUp() {
		try (Writer writer = new FileWriter(file, false)) {
			BufferedWriter bw = new BufferedWriter(writer);
			for (int i = 0; i < ilist.size(); i++) {
				bw.write(ilist.get(i).toString() + "\n");
			}
			bw.flush();
			bw.close();
		} catch (IOException e) {
			System.out.println("에러");
		}

	}
}
