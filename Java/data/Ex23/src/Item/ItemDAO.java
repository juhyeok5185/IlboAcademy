package Item;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemDAO {
	List<Item> arrItem = new ArrayList<>();
	File file = new File("C:/temp/item2.txt");

	public ItemDAO() {
		setUp();
	}

	public void setUp() {
		try (Reader reader = new FileReader(file)) {
			BufferedReader br = new BufferedReader(reader);
			String data;
			while ((data = br.readLine()) != null) {
				String[] wSplit = data.split(",");
				Item item = new Item();
				item.setName(wSplit[0]);
				item.setPrice(Integer.parseInt(wSplit[1]));
				item.setEa(Integer.parseInt(wSplit[2]));
				arrItem.add(item);
			}
		} catch (Exception e) {
			System.out.println("에러");
		}
	}

	public void intsert() {
		Item item = new Item();
		Scanner scanner = new Scanner(System.in);
		System.out.println("상품명 : ");
		item.setName(scanner.next());
		System.out.println("가격 : ");
		item.setPrice(scanner.nextInt());
		System.out.println("수량 : ");
		item.setEa(scanner.nextInt());
		arrItem.add(item);

		try (Writer writer = new FileWriter(file, true)) {
			BufferedWriter bw = new BufferedWriter(writer);
			bw.write(item.toString() + "\n");
			bw.flush();
			bw.close();
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("에러");
		}
	}

	public void list() {
		for (Item item : arrItem) {
			System.out.println(item.toString());
		}
	}

	public void serch() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.상품명 2.가격 3.수량");
		int menuNum = scanner.nextInt();
		switch (menuNum) {
		case 1:
			System.out.println("상품명 : ");
			String serchName = scanner.next();
			try (Reader reader = new FileReader(file)) {
				BufferedReader br = new BufferedReader(reader);
				String data;
				while ((data = br.readLine()) != null) {
					String[] wSplit = data.split(",");
					if (serchName.contains(wSplit[0])) {
						System.out.println(wSplit[0] + "," + wSplit[1] + "," + wSplit[2]);
					}
				}
			} catch (Exception e) {
				System.out.println("에러");
			}
			break;
		case 2:
			System.out.println("가격 : ");
			int serchPrice = scanner.nextInt();
			try (Reader reader = new FileReader(file)) {
				BufferedReader br = new BufferedReader(reader);
				String data;
				while ((data = br.readLine()) != null) {
					String[] wSplit = data.split(",");
					if (Integer.parseInt(wSplit[1]) == serchPrice) {
						System.out.println(wSplit[0] + "," + wSplit[1] + "," + wSplit[2]);
					}
				}
			} catch (Exception e) {
				System.out.println("에러");
			}
			break;
		case 3:
			System.out.println("수량 : ");
			int serchEa = scanner.nextInt();
			try (Reader reader = new FileReader(file)) {
				BufferedReader br = new BufferedReader(reader);
				String data;
				while ((data = br.readLine()) != null) {
					String[] wSplit = data.split(",");
					if (Integer.parseInt(wSplit[2]) == serchEa) {
						System.out.println(wSplit[0] + "," + wSplit[1] + "," + wSplit[2]);
					}
				}
			} catch (Exception e) {
				System.out.println("에러");
			}
			break;
		default:
			System.out.println("없는번호");
			break;
		}
	}

	public void change() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1.상품명 2.가격 3.수량 4.삭제");
		int menuNum = scanner.nextInt();
		switch (menuNum) {
		case 1:
			System.out.println("상품명 검색 : ");
			String serchItemName = scanner.next();
			for (Item i : arrItem) {
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
			for (Item i : arrItem) {
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
			for (Item i : arrItem) {
				if (serchEa == i.getPrice()) {
					System.out.println("변경할 가격 : ");
					i.setEa(scanner.nextInt());
				}
			}
			changeSetUp();
			break;
		case 4:
			System.out.println("삭제할 상품명 검색 : ");
			serchItemName = scanner.next();
			for (int i = 0; i < arrItem.size(); i++) {
				if (serchItemName.equals(arrItem.get(i).getName())) {
					arrItem.remove(i);
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
			for (int i = 0; i < arrItem.size(); i++) {
				bw.write(arrItem.get(i).toString() + "\n");
			}
			bw.flush();
			bw.close();
		} catch (IOException e) {
			System.out.println("에러");
		}

	}
}
