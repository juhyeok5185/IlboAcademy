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

public class Ex01 {

	static File file = new File("C:/temp/file.txt");
	public static void main(String[] args) {
		List<String> arrList = new ArrayList<>();
		
		reader();
	}

	public static void writer() {
		// 파일쓰기
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

	public static void reader() {
		// 파일 읽기
		try (Reader reader = new FileReader(file)) {
			BufferedReader br = new BufferedReader(reader);
			String data;
			while ((data = br.readLine()) != null) {
				System.out.println(data);
			}
			br.close();
		} catch (Exception e) {
			System.out.println("에러");
		}
	}

}
