package ex11;

import java.util.Iterator;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		util util = new util();
		String[] joinName = new String[10];
		String[] joinId = new String[10];
		String[] joinPw = new String[10];
		int[] money = new int[10];

		int icount = 0;
		int cnt = 0;
		int loginMenu = 0;
		int menuNum = 0;
		boolean loginCk = false;
		boolean run = true;

		while (run) {
			
			util.loginCk(loginCk , joinName[icount]);
			System.out.println("메뉴선택 : ");
			menuNum = scanner.nextInt();
			scanner.nextLine();

			switch (menuNum) {
			case 1:
				if (loginCk) {
					util.changePw(joinPw[icount]);
					break;
				} else {
					while (true) {
						joinName[cnt] = util.join("이름");
						joinId[cnt] = util.join("Id");
						joinPw[cnt] = util.join("Pw");
						cnt++;
						break;
					}
				}
				break;
			case 2:
				if (loginCk) {
					loginCk = false;
					break;
				} else {
					while (true) {
						System.out.println("Id : ");
						String loginId = scanner.next();
						System.out.println("Pw : ");
						String loginPw = scanner.next();
						for (int i = 0; i < cnt; i++) {
							if (loginId.equals(joinId[i]) && loginPw.equals(joinPw[i])) {
								System.out.println("로그인완료");
								loginCk = true;
								icount = i;
								break;
							} else {
								System.out.println("정보를 확인하세요");
								continue;
							}
						}
						break;
					}
				}
				break;
			case 3:
				if (!loginCk) {
					System.out.println("입금이 필요합니다 로그인을 완료해주세요");
				} else {
					System.out.println("1.커피(2000원) 2.사이다(3000원) 3.우유(2000원)");
					menuNum = scanner.nextInt();
					scanner.nextLine();
					switch (menuNum) {
					case 1:
						System.out.println("잔액 : " + money[icount]);
						System.out.println("(커피) 1.구매 2.취소");
						menuNum = scanner.nextInt();
						switch (menuNum) {
						case 1:
							money[icount] -= 2000;
							System.out.println("구매완료");
							System.out.println("남은잔액 : " + money[icount]);
							break;
						case 2:
							break;
						default:
							System.out.println("없는번호");
						}
						break;
					case 2:
						System.out.println("잔액 : " + money[icount]);
						System.out.println("(사이다) 1.구매 2.취소");
						menuNum = scanner.nextInt();
						switch (menuNum) {
						case 1:
							money[icount] -= 3000;
							System.out.println("구매완료");
							System.out.println("남은잔액 : " + money[icount]);
							break;
						case 2:
							break;
						default:
							System.out.println("없는번호");
						}
						break;
					case 3:
						System.out.println("잔액 : " + money[icount]);
						System.out.println("(우유) 1.구매 2.취소");
						menuNum = scanner.nextInt();
						switch (menuNum) {
						case 1:
							money[icount] -= 2000;
							System.out.println("구매완료");
							System.out.println("남은잔액 : " + money[icount]);
							break;
						case 2:
							break;
						default:
							System.out.println("없는번호");
						}
						break;
					default:
					}
				}
				break;
			case 4:
				if (!loginCk) {
					System.out.println("로그인을 완료해주세요");
					break;
				} else {
					while (true) {
						System.out.println("1.입금 2.출금 3.잔액 4.종료");
						int bankMenuNum = scanner.nextInt();
						switch (bankMenuNum) {
						case 1:
							System.out.println("입금액 : ");
							int deposit = scanner.nextInt();
							money[icount] += deposit;
							continue;
						case 2:
							System.out.println("출금액 : ");
							int withdrwal = scanner.nextInt();
							money[icount] -= withdrwal;
							continue;
						case 3:
							System.out.println("잔액 : " + money[icount]);
							continue;
						case 4:
							break;
						default:
							System.out.println("없는번호");
							continue;
						}
						break;
					}
				}
				break;
			case 5:
				run = false;
				break;
			default:
				System.out.println("없는번호입니다.");
			}
		}

	}

}
