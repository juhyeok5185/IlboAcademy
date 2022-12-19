package ex08;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		boolean run = true;
		String name = "";
		String id = "";
		String pw = "";
		String list = "";
		while (run) {

			System.out.println("1.회원가입 2.로그인 3.리스트 4.종료");
			System.out.println("메뉴선택 : ");

			int menuNum = scanner.nextInt();
			switch (menuNum) {
			case 1:
				today = new Date();
				System.out.println("이름 : ");
				name = scanner.next();
				System.out.println("id : ");
				id = scanner.next();
				System.out.println("pw : ");
				pw = scanner.next();
				System.out.println("회원가입 완료");
				list += sdf.format(today) +"\t"+name +"\t"+ id +"\t"+ pw+"\n";
				System.out.println("회원가입완료");
				break;
			case 2:
				System.out.println("id : ");
				String loginIdString = scanner.next();
				System.out.println("pw : ");
				String loginPwString = scanner.next();
				if (loginIdString.equals(name) && loginPwString.equals(pw)) {
					System.out.println("회원가입완료");
				} else {
					System.out.println("없는 정보");
				}
				break;
			case 3:
				System.out.println("가입날짜\t\t성명\tid\tpw");
				System.out.println("-------------------------------------");
				System.out.println(list);
			case 4:
				run = false;
				break;
			default:
			}
		}

	}

}
