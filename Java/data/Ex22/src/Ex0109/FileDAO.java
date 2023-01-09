package Ex0109;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class FileDAO {
	Item item = new Item();
	File file = new File("c:/java/item.txt");
	ArrayList<Item> ilist = new ArrayList<>();

	private void list() {
		// TODO Auto-generated method stub
		File file = new File("c:/java/item.txt");
		if (!file.exists()) {
			try {
				Reader reader = new FileReader(file);
				BufferedReader br = new BufferedReader(reader);
				String data;
				while ((data = br.readLine()) != null) {
					System.out.println(data);
					String[] text = data.split(",");
					item = new Item();
					item.setName(text[0]);
					item.setPrice(Integer.parseInt(text[1]));
					item.setQuantity(Integer.parseInt(text[2]));
					
				
					ilist.add(item);
				

				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else {
			System.out.println("파일이 존재합니다.");

		}
	}

	public void insert() {
		try {
			Writer wirter = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(wirter);
			Scanner sc = new Scanner(System.in);
			bw.write(item.toString() + "\n");
			bw.flush();
			bw.close();
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
