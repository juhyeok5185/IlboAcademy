package Ex0109;

import java.util.ArrayList;
import java.util.Scanner;

public class ItemDAO {

	ArrayList<Item> ilist;
	Scanner sc = new Scanner(System.in);
	
	public ArrayList<Item> getIlist() {
		return ilist;
	}

	public void setIlist(ArrayList<Item> ilist) {
		this.ilist = ilist;
	}

	public void insert() {
		Item item = new Item();
		String name = sc.nextLine();
		item.setName(name);
		int price = sc.nextInt(); sc.nextLine();
		item.setPrice(price);
		int quantity = sc.nextInt(); sc.nextLine();
		item.setQuantity(quantity);
		ilist.add(item);
		
	}
	
}
