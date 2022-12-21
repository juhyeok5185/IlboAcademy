package ex10;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Util {
	Scanner scanner = new Scanner(System.in);
	public void print() {
		System.out.println("자바안녕");
	}

	public String strPrint() {
		return "자바안뇽";

	}

	public int duplication(int m) {
		return m * 2;
	}

	public void gugudan(int m) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(m * i);
		}
		return;
	}
	
	public void join() {
		while (true) {
			System.out.println("사용하실 아이디를 입력해주세요");
			System.out.println("id : ");
			String id = scanner.next();
			if (id.length() < 4) {
				System.out.println("아이디는 4자 이상 가능합니다.");
				continue;
			} else {
				System.out.println("사용가능한 아이디 입니다.");
			}
			System.out.println("1.사용 2.아이디재검색");
			int menuNum = scanner.nextInt();
			scanner.nextLine();
			switch (menuNum) {
			case 1:
				System.out.println("패스워드를 입력하세요");
				System.out.println("pw");
				String pw = scanner.next();
				continue;
			case 2:
				break;
			default:
				System.out.println("없는번호");
			}
		}
	}
	
	public String today() {
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String date = sdf.format(today);
		return date;
	}
}
