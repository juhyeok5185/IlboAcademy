package ex08;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String inputName = "";
		String inputId = "";
		String inputPw = "";
		String listString = "";
		boolean run = true;
		while (run) {
			System.out.println("1.회원가입 2.로그인 3.검색 4.종료");
			System.out.println("메뉴선택 : ");
			int menuNum = scanner.nextInt();
			switch (menuNum) {
			case 1:
				today = new Date();
				System.out.println("이름 : ");
				inputName = scanner.next();
				System.out.println("ID : ");
				inputId = scanner.next();
				System.out.println("PW : ");
				inputPw = scanner.next();
				System.out.println("회원가입 완료");
				listString = sdf.format(today) + "\t" + inputName + "\t" + inputId + "\t" + inputPw + "\n";
				break;
			case 2:
				System.out.println("ID : ");
				String loginIdString = scanner.next();
				System.out.println("PW : ");
				String loginPwString = scanner.next();
				if (loginIdString.equals(inputId) && loginPwString.equals(inputId)) {

					System.out.println("로그인 완료");
				} else {
					System.out.println("정보를 확인하세요");
				}
				break;
			case 3:
				System.out.println("이름 검색 : ");
				String serchNameString = scanner.next();
				if (serchNameString.equals(inputName)) {
					System.out.println("가입날짜\t\t성명\tid\tpw\t");
					System.out.println("------------------------------------");
					System.out.println(listString);
				}
				break;
			case 4:
				System.out.println("종료");
				run = false;
				break;
			default:
			}
		}
	}
}
