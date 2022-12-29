package ex15;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Ex01User[] arrUser = new Ex01User[100];
		Ex01Util ex01Util = new Ex01Util();
		Ex01Board[] arrBoard = new Ex01Board[100];
		Ex01Transfer[] arrTransfer = new Ex01Transfer[100];
		int index = 0;
		int joinCnt = 0;
		int boardCnt = 0;
		int transferNum = 0;
		boolean isbank = false;
		boolean isVendingMc = false;
		boolean islogin = false;
		boolean isRun = true;
		boolean isBoard = false;
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		while (isRun) {
			ex01Util.booleanCk(isbank, isVendingMc, isBoard, islogin);
			int menuNum = scanner.nextInt();
			scanner.nextLine();
			switch (menuNum) {
			case 1:
				if (isbank) {
					int deposit = ex01Util.intScanner("입금액 : ");
					arrUser[index].userMoney += deposit;
					System.out.println("입금완료");
				} else if (isVendingMc) {
					arrUser[index].userMoney = ex01Util.buyItem(arrUser[index].userMoney, 3000);
				} else if (isBoard) {
					Ex01Board board = new Ex01Board();
					today = new Date();
					board.title = ex01Util.stringScanner("제목 : ");
					board.contents = ex01Util.stringScanner("내용 : ");
					board.date = sdf.format(today);
					board.writer = arrUser[index].userName;
					board.splTitle = ex01Util.splitTitle(board.title);
					board.boardCnt = boardCnt;
					arrBoard[boardCnt] = board;
					boardCnt++;
					ex01Util.printBoard(arrBoard, boardCnt);
				} else if (islogin) {
					String changePw = ex01Util.stringScanner("변경할 비밀번호 : ");
					arrUser[index].userPw = changePw;
					System.out.println("변경완료");
				} else {
					Ex01User user = new Ex01User();
					user.userName = ex01Util.stringScanner("이름 : ");
					user.userId = ex01Util.stringScanner("Id : ");
					user.userPw = ex01Util.stringScanner("Pw : ");
					arrUser[joinCnt] = user;
					joinCnt++;
					// 완료
				}
				break;
			case 2:
				if (isbank) {
					int withdrawl = ex01Util.intScanner("출금액 : ");
					arrUser[index].userMoney -= withdrawl;
					System.out.println("출금완료");
				} else if (isVendingMc) {
					arrUser[index].userMoney = ex01Util.buyItem(arrUser[index].userMoney, 2000);
				} else if (islogin) {
					islogin = false;
				} else if (isBoard) {
					int num = ex01Util.intScanner("번호 : ");
					arrBoard[num].title = ex01Util.stringScanner("제목 : ");
					arrBoard[num].splTitle = ex01Util.splitTitle(arrBoard[num].title);
					arrBoard[num].contents = ex01Util.stringScanner("내용");
					System.out.println("변경완료");
					ex01Util.printBoard(arrBoard, boardCnt);
				} else {
					String loginId = ex01Util.stringScanner("Id : ");
					String loginPw = ex01Util.stringScanner("Pw : ");
					for (int i = 0; i < joinCnt; i++) {
						if (loginId.equals(arrUser[i].userId) && loginPw.equals(arrUser[i].userPw)) {
							islogin = true;
							index = i;
							break;
						} 
					}
					if (!islogin) {
						System.out.println("정보를 확인해주세요");
					}
				}
				break;
			case 3:
				if (isbank) {
					System.out.println("잔액 : " + arrUser[index].userMoney);
				} else if (isVendingMc) {
					arrUser[index].userMoney = ex01Util.buyItem(arrUser[index].userMoney, 2000);
				} else if (isBoard) {
					int num = ex01Util.intScanner("번호");
					System.out.println("번호\t제목\t\t\t내용");
					System.out.println("-------------------------");
					if (num < arrBoard.length) {
						System.out.printf("%d\t%s\t%s\n", arrBoard[num].boardCnt, arrBoard[num].title,
								arrBoard[num].contents);
						System.out.println();
						arrBoard[num].view += 1;
						ex01Util.printBoard(arrBoard, boardCnt);
					}
				} else if (islogin) {
					isVendingMc = true;
					islogin = false;
					break;
				} else {
					System.out.println("로그인이후 사용가능");
				}
				break;
			case 4:
				if (isbank) {
					int transferNumber = ex01Util.intScanner("1.이체 2.종료");
					switch (transferNumber) {
					case 1:
						System.out.println("회원리스트");
						System.out.println("번호\t이름");
						System.out.println("-----------------------");
						for(int i = 0; i < joinCnt; i++) {
							System.out.println(i+"\t" + arrUser[i].userName);
						}
						int joinNum = ex01Util.intScanner("회원번호를 선택하세요");
						if(joinNum != index) {							
							int transferMoney = ex01Util.intScanner("입금할 금액 : ");
							if(arrUser[index].userMoney > transferMoney) {
								arrUser[index].userMoney -= transferMoney;
								Ex01Transfer transfer = new Ex01Transfer();
								 
								transfer.status = "출금";
								transfer.money = transferMoney;
								transfer.name = arrUser[index].userName;
								transfer.otherName = arrUser[joinNum].userName;
								arrTransfer[transferNum] = transfer;
								transferNum++;
								
								arrUser[joinNum].userMoney += transferMoney;
								
								transfer = new Ex01Transfer();
								transfer.status = "입금";
								transfer.money = transferMoney;
								transfer.name = arrUser[joinNum].userName;
								transfer.otherName = arrUser[index].userName;
								arrTransfer[transferNum] = transfer;
								transferNum++;
								System.out.println("이체완료");
							}
							else if(joinNum == index) {
								System.out.println("자신한테 보낼수 없습니다.");
							}
							else {
								System.out.println("금액이 부족합니다.");
							}
						}
					case 2:
						break;
					}
				} else if (isVendingMc) {
					islogin = true;
					isVendingMc = false;
				} else if (isBoard) {
					System.out.println("1.제목 2.작성자");
					menuNum = scanner.nextInt();
					scanner.nextLine();
					switch (menuNum) {
					case 1:
						String serchTitle = ex01Util.stringScanner("제목검색 : ");
						System.out.println("번호\t제목\t작성자\t조회수\t작성일");
						System.out.println("-------------------------------------");
						for (int i = 0; i < boardCnt; i++) {
							if (arrBoard[i].title.contains(serchTitle)) {
								System.out.printf("%d\t%s\t%s\t%d\t%s\n", arrBoard[i].boardCnt, arrBoard[i].splTitle,
										arrBoard[i].writer, arrBoard[i].view, arrBoard[i].date);
							}
						}
						break;
					case 2:
						System.out.println("작성자 : ");
						String serchWriter = scanner.next();
						System.out.println("번호\t제목\t작성자\t조회수\t작성일");
						System.out.println("-------------------------------------");
						for (int i = 0; i < boardCnt; i++) {
							if (arrBoard[i].writer.contains(serchWriter)) {
								System.out.printf("%d\t%s\t%s\t%d\t%s\n", arrBoard[i].boardCnt, arrBoard[i].splTitle,
										arrBoard[i].writer, arrBoard[i].view, arrBoard[i].date);
								System.out.println();
							}
						}
						break;
					default:
						System.out.println("없는번호");
						break;
					}
				} else if (islogin) {
					isbank = true;
					islogin = false;
				} else {
					System.out.println("로그인후에 이용해주세요");
				}
				break;
			case 5:
				if (isbank) {
					System.out.println("상태\t금액\t보낸사람");
					for(int i = 0; i < transferNum ; i++) {
						if(arrTransfer[i].name.equals(arrUser[index].userName))
						System.out.println(arrTransfer[i].status +"\t"+ arrTransfer[i].money+"\t"+arrTransfer[i].otherName);
					}
					System.out.println();
				} else if (isVendingMc) {
					System.out.println("없는번호");
				} else if (islogin) {
					ex01Util.printBoard(arrBoard, boardCnt);
					isBoard = true;
					islogin = false;
				} else if (isBoard) {
					islogin = true;
					isBoard = false;
				} else {
					System.out.println("로그인후에 이용해주세요");
				}
				break;
			case 6:
				if (isbank) {
					islogin = true;
					isbank = false;
				} else if (isVendingMc) {
					System.out.println("없는번호");
				} else if (isBoard) {
					System.out.println("없는번호");
				} else if (islogin) {
					isRun = false;
				} else {
					isRun = false;
				}
				break;
			default:
				System.out.println("없는번호");
				break;
			}
		}
	}

}
