package ex07;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String joinNameString = "";
		String joinIdString = "";
		String joinPwString = "";
		System.out.println("회원가입, 정보수정 , 로그인 ,로그아웃");
		out:
		while (true) {
			System.out.println("1.회원가입 2.로그인 3. 종료");
			System.out.println("메뉴선택 : ");
			if (scanner.hasNextInt()) {
				int menuNum = scanner.nextInt();
				scanner.nextLine();
				if (menuNum == 1) {
					System.out.println("이름");
					joinNameString = scanner.next();
					System.out.println("ID");
					joinIdString = scanner.next();
					System.out.println("PW");
					joinPwString = scanner.next();
				} else if (menuNum == 2) {
					System.out.println("Id");
					String loginIdString = scanner.next();
					System.out.println("Pw");
					String loginPwString = scanner.next();

					if (loginIdString.equals(joinIdString) && loginPwString.equals(joinPwString)) {
						while (true) {
							System.out.println("1.비밀번호수정 2.로그아웃 3.종료");
							if (scanner.hasNextInt()) {
								int aMenuNum = scanner.nextInt();
								scanner.nextLine();
								if (aMenuNum == 1) {
									System.out.println("수정할 비밀번호 : ");
									String changePw = scanner.next();
									joinPwString = changePw;
								} else if (aMenuNum == 2) {
									break;
								} else if (aMenuNum == 3) {
									break out;
								}
							} else {
								System.out.println("숫자만 입력하세요");
								scanner.nextLine();
							}
						}
						
						
					} else {
						System.out.println("정보를 다시 확인해주세요");
					}
				} else if (menuNum == 3) {
					break out;
				}
			} else {
				System.out.println("숫자만 입력해주세요");
				scanner.nextLine();
			}
		}
	}
}
