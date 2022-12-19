package ex08;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean beforeLogin = true;
		boolean join = false;
		boolean afterLogin = false;
		boolean bank = false;
		boolean vending = false;
		String joinNameString = "";
		String joinIdString = "";
		String joinPwString = "";
		String vendingMenuString = "";
		int vendingMenuCost = 0;
		int money = 0;
		out: while (true) {
			while (beforeLogin) {
				System.out.println("1.회원가입 2.로그인 3.자판기 4.희망은행 0.종료");
				System.out.println("메뉴선택 : ");
				int beforeLoginMenuNum = scanner.nextInt();
				switch (beforeLoginMenuNum) {
				case 1:
					join = true;
					beforeLogin = false;
					break;
				case 2:
					System.out.println("id : ");
					String loginIdString = scanner.next();
					System.out.println("pw : ");
					String loginPwString = scanner.next();
					if (joinIdString.equals(loginIdString) && joinIdString.equals(loginPwString)) {
						System.out.println("로그인완료");
						afterLogin = true;
						beforeLogin = false;
						break;
					} else {
						System.out.println("정보를 다시 확인하세요");
					}
				case 3:
					vending = true;
					beforeLogin = false;
					break;
				case 4:
					bank = true;
					beforeLogin = false;
					break out;
				case 0:
					beforeLogin = false;
					break out;
				default:
					System.out.println("없는번호입니다.");
				}
			}
			while (join) {
				System.out.println("이름 : ");
				joinNameString = scanner.next();
				System.out.println("id : ");
				joinIdString = scanner.next();
				System.out.println("pw : ");
				joinPwString = scanner.next();
				System.out.println("회원가입완료");
				beforeLogin = true;
				join = false;
				break;
			}
			while (afterLogin) {
				System.out.println("1.정보수정 2.로그아웃 3.자판기 4.희망은행 0.종료");
				int afterLoginMenuNum = scanner.nextInt();
				switch (afterLoginMenuNum) {
				case 1:
					System.out.println("변경할 비밀번호 : ");
					String changePw = scanner.next();
					joinPwString = changePw;
					System.out.println("변경완료");
					break;
				case 2:
					beforeLogin = true;
					afterLogin = false;
					break;
				case 3:
					vending = true;
					afterLogin = false;
					break;
				case 4:
					bank = true;
					afterLogin = false;
					break;
				case 0:
					afterLogin = false;
					break out;
				default:
					System.out.println("번호가 없습니다.");
				}
			}
			while (vending) {
				if(money < 2000) {
					System.out.println("잔액이 부족하여 사용할 수 없습니다.");afterLogin = true; break;
				}
				else {
					System.out.println("1.커피(3000원) 2.우유(2000원) 3.사이다(3000원) 0.종료");
					int vendingMenuNum = scanner.nextInt();
					switch (vendingMenuNum){
					case 1: vendingMenuString = "커피"; vendingMenuCost = 3000; break;
					case 2: vendingMenuString = "우유"; vendingMenuCost = 2000; break;
					case 3: vendingMenuString = "사이다"; vendingMenuCost = 3000; break;
					case 0: afterLogin = true; vending = false; continue;
					default:
						System.out.println("없는번호");
					}
					System.out.printf("현재잔고 %d :",money);
					System.out.printf("선택한 메뉴 %s\n ",vendingMenuString);
					System.out.println("구매하시겠습니까? 1.구매 2.취소");
					int selectNum = scanner.nextInt();
					if(selectNum == 1) {
						System.out.println("구매완료");
						money -= vendingMenuCost;
						System.out.println("남은잔고 : " + money);
					}
					else if (selectNum == 2) {
						break;
					}
				}
				
			}
			while (bank) {
				System.out.println("희망은행 현재 잔액 : " + money);
				System.out.println("1.입금 2.출금 3.잔액 4.종료");
				int bankMenuNum = scanner.nextInt();
				switch (bankMenuNum) {
				case 1:
					System.out.println("입금액 : ");
					int deposit = scanner.nextInt();
					money += deposit;
					break;
				case 2:
					System.out.println("출금액 : ");
					int withdrwal = scanner.nextInt();
					money -= withdrwal;
					break;
				case 3:
					System.out.println("잔고 : " + money);
					break;
				case 4:
					System.out.println("종료");
					afterLogin = true;
					bank = false;
					break;
				default:
					System.out.println("번호가 없습니다.");
				}
			}
		}
}

}
