package FileExam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemDAO {
	Scanner scanner = new Scanner(System.in);
	File file = new File("C:/temp/item.txt");
	List<Item> arrItems = new ArrayList<>();
	Item item = new Item();

	public void insert() {
		item = new Item();
		System.out.println("상품명 : ");
		item.setItemName(scanner.next());
		System.out.println("가격 : ");
		item.setItemPrice(scanner.nextInt());
		System.out.println("수량 : ");
		item.setItemEA(scanner.nextInt());
		arrItems.add(item);

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

	public void setup() {
		try (Reader reader = new FileReader(file)) {
			BufferedReader br = new BufferedReader(reader);
			String data;
			while ((data = br.readLine()) != null) {
				String[] wSplit = data.split(",");
				Item item = new Item();
				item.setItemName(wSplit[0]);
				item.setItemPrice(Integer.parseInt(wSplit[1]));
				item.setItemEA(Integer.parseInt(wSplit[2]));
				arrItems.add(item);
			}
		} catch (Exception e) {
			System.out.println("에러");
		}
	}

	public void list() {
		System.out.println("상품리스트");
		for (Item a : arrItems) {
			System.out.println(a.getItemName() + "\t" + a.getItemPrice() + "\t" + a.getItemEA());
		}
	}

	public void change() {
		System.out.print("1.상품명 : ");
		String serchItemName = scanner.next();
		for (Item i : arrItems) {
			if (serchItemName.contains(i.getItemName())) {
				System.out.println("변경할 이름 : ");
				i.setItemName(scanner.next());
			}
			try (Writer writer = new FileWriter(file, true)) {
				BufferedWriter bw = new BufferedWriter(writer);
				bw.write(i.toString() + "\n");
				bw.flush();
				bw.close();
			} catch (IOException e) {
				System.out.println("에러");
			}
		}
		removeBuffer();
		changeSetUp();
	}

	public void removeBuffer() {
		try (FileOutputStream fos = new FileOutputStream(file, false)) {

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void changeSetUp() {
		for (int i = 0; i < arrItems.size(); i++) {
			try (Writer writer = new FileWriter(file, true)) {
				BufferedWriter bw = new BufferedWriter(writer);
				bw.write(arrItems.get(i).toString() + "\n");
				bw.flush();
				bw.close();
			} catch (IOException e) {
				System.out.println("에러");
			}
		}
	}
}
