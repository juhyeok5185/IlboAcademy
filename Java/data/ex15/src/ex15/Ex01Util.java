package ex15;

import java.security.PublicKey;
import java.util.Scanner;

public class Ex01Util {

	public String stringScanner(String string) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(string);
		return scanner.next();
	}

	public int intScanner(String string) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(string);
		return scanner.nextInt();
	}

	public int buyItem(int money, int price) {
		Scanner scanner = new Scanner(System.in);
		if (money < price) {
			System.out.println("잔액이 부족합니다.");
		} else {
			System.out.println("잔액 : " + money);
			System.out.println("구매후 잔액 : " + (money - price));
			System.out.println("1.구매 2.취소");
			int vendingNum = scanner.nextInt();
			switch (vendingNum) {
			case 1:
				money = money - price;
				break;
			case 2:
				break;
			default:
				System.out.println("번호없음");
			}
		}
		return money;
	}

	public void booleanCk(boolean isbank, boolean isVendingMc, boolean isBoard, boolean islogin) {

		if (isbank) {
			System.out.println("1.입금 2.출금 3.잔액 4.이체 5.이체내역 6.종료");
			System.out.println("메뉴선택 : ");
		} else if (isVendingMc) {
			System.out.println("1.커피(3000원) 2.우유(2000원) 3.사이다(2000원) 4.종료");
			System.out.println("메뉴선택 : ");
		} else if (isBoard) {
			System.out.println("1.글쓰기 2.수정 3.읽기 4.검색 5.종료");
			System.out.println("메뉴선택 : ");
		} else if (islogin) {
			System.out.println("1.정보수정 2.로그아웃 3.자판기 4.희망은행 5.자유게시판 6.종료");
			System.out.println("메뉴선택 : ");
		} else {
			System.out.println("1.회원가입 2.로그인 3.자판기 4.희망은행 5.자유게시판 6.종료");
			System.out.println("메뉴선택 : ");

		}
	}

	public void printBoard(Ex01Board[] arrBoard, int boardCnt) {
		System.out.println("번호\t제목\t작성자\t조회수\t작성일");
		System.out.println("-------------------------------------");
		for (int i = 0; i < boardCnt; i++) {
			if(boardCnt == 0) {
				System.out.println("게시물이 없습니다.");
			}
			else {
				System.out.printf("%d\t%s\t%s\t%d\t%s\n", arrBoard[i].boardCnt, arrBoard[i].splTitle, arrBoard[i].writer,
						arrBoard[i].view, arrBoard[i].date);
			}
		}
	
	}
	
	public String splitTitle(String splTitle) {
		if (splTitle.length() > 4) {
			splTitle = splTitle.substring(0, 3) + "...";
		} 
		return splTitle;
	}
	
	public void missmatchCatch() {
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
