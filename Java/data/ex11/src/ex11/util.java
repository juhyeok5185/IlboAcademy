package ex11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class util {

	public void loginCk(boolean loginCk , String name) {
		if (loginCk) {
			System.out.println("1.정보수정 2.로그아웃 " + name + "님 3.자판기 4.희망은행 5.종료");
		} else {
			System.out.println("1.회원가입 2.로그인 3.자판기 4.희망은행 5.종료");
		}
	}

	public void changePw(String joinPw) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("변경할 비밀번호 : ");
		String changePw = scanner.next();
		joinPw = changePw;
		System.out.println("변경완료");
	}
	
	public String join(String a) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(a + " : ");
		String name = scanner.next();
		return name;
	}
	
	public void login() {
		
	}

}
