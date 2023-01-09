package Project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MDAO mdao = new MDAO();
		Member mem = null;
		Game game = new Game();

		boolean yet = true;
		boolean start = false;
		boolean login = false;

		String loginName = "";

		while (yet) {
			System.err.println("~미니게임 3종세트~");
			if (login) {
				System.out.printf("1.로그아웃(%s님) 2.게임 3.랭킹 4.종료%n", loginName);
			} else {
				System.out.println("1.회원가입 2.로그인 3.랭킹 4.종료");
			}
			System.out.print("메뉴선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			switch (menu) {
			case 1:
				if (login) {
					System.err.println("로그아웃");
					login = false;
					break;
				} else {
					System.out.println("회원가입");
					mdao.insert();
					System.err.println("등록완료");
					break;
				}
			case 2:
				if (login) {
					System.err.println("게임시작");
					login = false;
					start = true;
					break;
				} else {
					System.out.println("로그인");
					System.out.print("Id : ");
					String newid = sc.nextLine();
					System.out.print("Pw : ");
					String newpw = sc.nextLine();
					mem = mdao.loginCk(newid, newpw);
					if (mem == null) {
						System.err.println("로그인정보가 없습니다.");

					} else {
						login = true;
						loginName = mem.getName();
						System.err.println("로그인완료");
						break;
					}
				}

				break;
			case 3:
				System.err.println("랭킹");
				System.out.println("이름\t\t포인트\t순위");
				System.out.println("----------------------------");
				mdao.rank();
				break;
			case 4:
				if (login) {
					System.err.println("종료");
					login = false;
					yet = false;
					break;
				} else {
					System.err.println("종료");
					yet = false;
					break;
				}
			default:
				System.err.println("메뉴번호를 확인해주세요.");
				break;
			}
			while (start) {
				System.out.println("1.피지컬게임 2.타자연습 3.퀴즈 4.종료");
				System.out.print("메뉴선택 : ");
				menu = sc.nextInt();
				sc.nextLine();
				switch (menu) {
				case 1:
					mdao.enter();
					break;
				case 2:
					mdao.typing();
					break;
				case 3:
					game.quiz(mem, mdao);
					break;
				case 4:
					start = false;
					login = true;
					break;
				default:
					System.err.println("메뉴번호를 확인해주세요.");
					break;
				}
			}
		}
	}
}