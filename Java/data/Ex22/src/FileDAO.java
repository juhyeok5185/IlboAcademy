import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class FileDAO {

	File file = new File("C:/temp/file.txt");

	public void insert(String a) {
		Scanner scanner = new Scanner(System.in);
		try (Writer writer = new FileWriter(file, true)) {
			BufferedWriter bw = new BufferedWriter(writer);
			bw.write(scanner.next() + "\n");
			bw.flush();
			bw.close();
		} catch (IOException e) {
			System.out.println("에러");
		}

	}
}
