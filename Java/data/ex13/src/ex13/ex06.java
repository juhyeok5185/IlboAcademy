package ex13;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {	
			System.out.println("사용하실 아이디를 입력해주세요");
			System.out.println("ID : ");
			String[] joinId = new String[10];
			joinId[0] = "test";
			String inputId = scanner.nextLine();
			for (int i = 0; i < joinId.length; i++) {
				if(joinId[0].equals(inputId)) {
					System.out.println("중복된 ID입니다.");
					break;
				}
				else if(inputId.contains(" ")) {
					System.out.println("띄어쓰기를 사용할수 없습니다.");
					break;
				}
				else if(inputId.length() < 4) {
					System.out.println("4글자 이상 입력해주세요");
					break;
				}
				else {
					System.out.println("사용가능한 ID입니다.");
					System.out.println("1.사용 2.아이디재검색");
					int use = scanner.nextInt();
					scanner.nextLine();
					switch (use) {
					case 1:
						joinId[1] = inputId;
						System.out.println("패스워드 입력하세요");
						String inputPw = scanner.next();
						System.out.println("회원가입 완료");
						break;
					case 2:
						break;
					default: System.out.println("잘못입력");
					}
					break;
				}
			}
		}
		
	}

}
