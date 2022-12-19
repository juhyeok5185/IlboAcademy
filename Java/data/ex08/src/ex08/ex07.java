package ex08;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class ex07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		String inputName = "";
		String inputId = "";
		String inputPw = "";
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String joinList = "";
		String loginList = "";
		while (run) {
			System.out.println("1.회원가입 2.로그인 3.가입리스트 4.로그인리스트 5.종");
			System.out.println("메뉴선택 : ");
			int menuNum = scanner.nextInt();
			switch (menuNum) {
			case 1:
				today = new Date();
				System.out.println("이름 : ");
				inputName = scanner.next();
				System.out.println("id : ");
				inputId = scanner.next();
				System.out.println("pw : ");
				inputPw = scanner.next();
				joinList = sdf.format(today)+ "\t" + inputName +"\t" + inputId + "\n";
				break;
			case 2:
				System.out.println("id : ");
				String loginId = scanner.next();
				System.out.println("pw : ");
				String loginPw = scanner.next();
				if (loginId.equals(inputId) && loginPw.equals(inputPw)) {
					today = new Date();
					loginList = sdf.format(today)+ "\t" + inputName +"\t" + inputId + "\n";
					System.out.println("로그인 성공");
					System.out.println("1.비밀번호수정 2.로그아웃 "+ inputName + "님" + " 3.종료");
					System.out.println("메뉴번호 : ");
					int loginMenuNum = scanner.nextInt();
					switch (loginMenuNum) {
					case 1:
						System.out.println("수정할 Pw : ");
						String changePwString = scanner.next();
						inputPw = changePwString;
						break;
					case 2:
						break;
					case 3:
						run = false;
						break;
					default:
						System.out.println("없는번호");
					}
				} else {
					System.out.println("로그인 실패");
				}
				break;
			case 3:
				System.out.println("가입날짜\t\t성명\tid\tpw");
				System.out.println("-------------------------------------");
				System.out.println(joinList);
				break;
			case 4:
				System.out.println("로그인날짜\t\t성명\tid\tpw");
				System.out.println("-------------------------------------");				System.out.println(joinList);
				System.out.println(loginList);
				break;
			case 5:
				System.out.println("종료");
				run = false;
				break;
			default:
				System.out.println("없는숫자");
			}
		}
	}

}
