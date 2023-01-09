package Ex0109;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

import FileExam.Item;

public class ItemDAO {

	ArrayList<Item> arrItem = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	Item item = new Item();
	FileDAO fDao = new FileDAO();
	File file = new File("c:/java/item.txt");
	
	



	public void insert() {
		Item item = new Item();
		System.out.println("상품명 : ");
		String name = sc.nextLine();
		item.setItemName(name);
		System.out.println("가격 : ");
		int price = sc.nextInt(); sc.nextLine();
		item.setItemPrice(price);
		System.out.println("수량 : ");
		int quantity = sc.nextInt(); sc.nextLine();
		item.setItemPrice(quantity);
		fDao.insert();
	}
	
	public void list() {
		try (Reader reader = new FileReader(file)) {
			BufferedReader br = new BufferedReader(reader);
			String data;
			while ((data = br.readLine()) != null) {
				String[] wSplit = data.split(",");
				Item item = new Item();
				item.setItemName(wSplit[0]);
				item.setItemPrice(Integer.parseInt(wSplit[1]));
				item.setItemEA(Integer.parseInt(wSplit[2]));
				arrItem.add(item);
			}
			for (Item i : arrItem) {
				System.out.println(i.toString());
			}
			br.close();
		} catch (Exception e) {
			System.out.println("에러");
		}
	}
	
}
