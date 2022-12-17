package ex07;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("초간단 반복메뉴 만들기");
		while (true) {
			if(scanner.hasNextInt()) {
				System.out.println("1.회원가입 2.로그인 3.종료");
				System.out.println("메뉴선택 : ");
				int menuNum = scanner.nextInt();
				scanner.nextLine();
				switch (menuNum) {
				case 1: System.out.println("회원가입 선택"); break;
				case 2: System.out.println("로그인 선택"); break;
				case 3: System.out.println("종료 선택"); break;
				default:System.out.println("없는번호");break;	
			}
			}else {
					System.out.println("숫자만 입력해주세요");
					scanner.nextLine();
				}
		}
			
		}
	}

}
