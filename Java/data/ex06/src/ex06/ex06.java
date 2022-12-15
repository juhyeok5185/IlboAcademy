package ex06;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean beforeLogin = true;
		boolean afterLogin = false;
		String joinNameString = "";
		String joinIdString = "";
		String joinPwString = "";

		out: while (true) {

			while (beforeLogin) {
				System.out.println("1.회원가입 2.로그인 3.종료");
				int beforeMenuNum = scanner.nextInt();
				switch (beforeMenuNum) {
				case 1:
					System.out.println("이름");
					joinNameString = scanner.next();
					System.out.println("id");
					joinIdString = scanner.next();
					System.out.println("pw");
					joinPwString = scanner.next();
					System.out.println("회원가입완료");
					break;
				case 2:
					System.out.println("id : ");
					String loginIdString = scanner.next();
					System.out.println("pw : ");
					String loginPwString = scanner.next();
					if (loginIdString.equals(joinIdString) && loginPwString.equals(joinPwString)) {
						System.out.println("로그인 완료");
						afterLogin = true;
						beforeLogin = false;
					} else {
						System.out.println("로그인 정보가 없습니다.");
					}

					break;
				case 3:
					break out;

				default:
					System.out.println("없는번호");
					break;
				}
			}

			while (afterLogin) {
				System.out.println("1.비밀번호수정 2.로그아웃 3.종료");
				int afterMenuNum = scanner.nextInt();
				switch (afterMenuNum) {
				case 1:
					System.out.println("수정할 pw : ");
					String changePw = scanner.next();
					joinPwString = changePw;
					System.out.println("비밀번호가 수정되었습니다.");
					break;
				case 2:
					beforeLogin = true;
					afterLogin = false;
					break;
				case 3:
					break out;
				default:
					System.out.println("없는번호");
					break;
				}
			}
		}
	}

}
