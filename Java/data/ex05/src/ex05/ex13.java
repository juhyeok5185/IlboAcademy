package ex05;

import java.util.Iterator;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class ex13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputName = ""; 
		String inputAge = "";
		String list = "";
		
		System.out.println("회원관리");
		out:
		while (true) {
			System.out.println("1.등록 | 2.리스트 | 3.종료");
			int selectMenu = scanner.nextInt();
			
			switch (selectMenu) {
			case 1:
				System.out.println("이름을 입력하세요 : ");
				inputName = scanner.next();
				System.out.println("나이를 입력하세요 : ");
				inputAge = scanner.next();
				System.out.println("회원등록이 완료되었습니다.");
				list =list + inputName +"\t"+ inputAge + "\n";
				continue;
			case 2:
				System.out.println("이름  나이");
				System.out.println("---------------");
				System.out.printf(list);
			case 3:
				break out;
			default:
			}
		}

	}

}
