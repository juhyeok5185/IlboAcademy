
package fishgame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Util util = new Util();
		DAO dao = new DAO();
		boolean login = false;// 로그인 체크
		Member mem = null;
		
		System.out.print("Fish Game		");
		try {
			Thread.sleep(2000); // 2초 대기하는 메서드
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Team Smokers Present.");
		try {
			Thread.sleep(2000); // 2초 대기하는 메서드
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("");
		
		main: while (true) {
			if (login) {
				System.out.println("1." + mem.getName() + "님 정보 2.낚시터 출발 3.시장 4.랭킹 0.로그아웃");
			} else {
				System.out.println("1.회원가입 2.로그인 0.종료");
			}
			int menu = util.numcheck();
			switch (menu) {
			case 1:
				if (login) {
					dao.information(); // 내 정보
				} else {
					dao.regi(); // 회원 가입
				}
				break;
			case 2:
				if (login) {
					dao.gameStart(); // 메인 게임
				} else {
					login = dao.login(login); // 로그인
					mem = dao.mem;
				}
				break;
			case 3:
				if (login) {
					System.out.println("1.구매 2.판매");
					menu = util.numcheck();
					switch (menu) {
					case 1:
						System.out.println("1.미끼 2.낚시대");
						menu = util.numcheck();
						switch (menu) {
						case 1:
							dao.buybait(); // 미끼 구매
							break;
						case 2:
							dao.buyfishingrod(); // 낚싯대 구매
							break;
						}
						break;
					case 2:
						dao.sellfish(); // 물고기 판매
					}
					break;
				} else {
				}
			case 4:
				if (login) {
					dao.rank(); // 랭킹
					break;
				} else {
				}
			default:
				System.out.println("번호 확인");
				break;
			case 0:
				if (login) {
					login = false; // 로그아웃
				} else {
					break main;
				}
				break;
			}
		}
		System.out.println("게임 종료");

		
		
	}

}
