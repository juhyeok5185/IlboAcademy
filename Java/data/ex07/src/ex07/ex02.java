package ex07;

import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String id = "test";
		System.out.println("id 중복 체크");
		while (true) {
			System.out.println("사용하실 아이디를 입력해주세요 : ");
			String inputId = scanner.nextLine();
			
			if (id.equals(inputId)) {
				System.out.println("중복된ID");
			}

			else if (!id.equals(inputId) && inputId.length() > 3) {
				System.out.println("사용가능한 ID입니다. 정말 사용하시겠습니까?");
				System.out.println("1.사용 2.아이디검색");
				if (scanner.hasNextInt()) {
					int use = scanner.nextInt();
					scanner.nextLine();
					if (use == 1) {
						System.out.println("패스워드를 입력하세요 : ");
						String pw = scanner.next();
						scanner.nextLine();
						System.out.println("회원가입완료");
					}
					
					else if (use == 2) {
						
					}
				}
				else {
					System.out.println("문자는 사용할수없습니다");
					scanner.nextLine();
				}

			} else if (inputId.length() <= 3) {
				if (inputId.length() == 0) {
					System.out.println("id를 입력해주세요");
				} else {
					System.out.println("3글자보다 작은 id는 사용할수 없습니다.");
				}
			}

		}

	}

}
