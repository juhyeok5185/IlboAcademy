package ex14;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean loginCk = false;
		boolean freeboard = false;
		boolean run = true;
		Util[] arrUtil = new Util[10];
		Board[] arrBoard = new Board[100];
		int seq = 0;
		int cnt = 0;
		int bCnt = 0;
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");

		while (run) {
			if (loginCk) {
				System.out.println("1.비밀번호수정 2.로그아웃 3.자유게시판 4.종료");
			} else if (freeboard) {
				System.out.println("1.글쓰기 2.글수정 3.읽기 4.검색 5.종료");
			} else {
				System.out.println("1.회원가입 2.로그인 3.자유게시판 4.종료");
			}
			int menuNum = scanner.nextInt();
			scanner.nextLine();
			switch (menuNum) {
			case 1:
				if (loginCk) {
					System.out.println("비밀번호수정");
					arrUtil[seq].pw = scanner.next();
					System.out.println("수정완료");
				} else if (freeboard) {
					today = new Date();
					Board board = new Board();
					board.writer = arrUtil[seq].name;
					System.out.println("제목 : ");
					board.title = scanner.nextLine();
					if(board.title.length() > 4) {
						board.splTitle = board.title.substring(0, 4) + "...";
					}
					else {
						board.splTitle = board.title;
					}
					System.out.println("내용 : ");
					board.contents = scanner.nextLine();
					arrBoard[bCnt] = board;
					board.boardCnt = bCnt;
					board.date = sdf.format(today);
					bCnt++;
					System.out.println("번호\t제목\t작성자\t조회수\t작성일");
					System.out.println("-------------------------------------");
					for (int i = 0; i < bCnt; i++) {
						System.out.printf("%d\t%s\t%s\t%d\t%s\n", arrBoard[i].boardCnt, arrBoard[i].splTitle,
								arrBoard[i].writer, arrBoard[i].view, arrBoard[i].date);
					}
					break;
				} else {
					Util util = new Util();
					System.out.println("이름 : ");
					util.name = scanner.next();
					System.out.println("ID : ");
					util.id = scanner.next();
					System.out.println("PW : ");
					util.pw = scanner.next();
					arrUtil[cnt] = util;
					cnt++;
				}
				break;
			case 2:
				if (loginCk) {
					System.out.println("로그아웃");
					loginCk = false;
				} else if (freeboard) {
					System.out.println("번호 : ");
					int num = scanner.nextInt();
					scanner.nextLine();
					System.out.println("제목 : ");
					arrBoard[num].title = scanner.nextLine();
					arrBoard[num].splTitle = arrBoard[num].title.substring(0, 4) + "...";
					System.out.println("내용 : ");
					arrBoard[num].contents = scanner.nextLine();
					System.out.println("변경완료");
					System.out.println("번호\t제목\t작성자\t조회수\t작성일");
					System.out.println("-------------------------------------");
					for (int i = 0; i < bCnt; i++) {
						System.out.printf("%d\t%s\t%s\t%d\t%s\n", arrBoard[i].boardCnt, arrBoard[i].splTitle,
								arrBoard[i].writer, arrBoard[i].view, arrBoard[i].date);
					}
				} else {
					System.out.println("로그인");
					System.out.println("ID : ");
					String loginId = scanner.next();
					System.out.println("PW : ");
					String loginPw = scanner.next();
					for (int i = 0; i < cnt; i++) {
						if (loginId.equals(arrUtil[i].id) && loginPw.equals(arrUtil[i].pw)) {
							System.out.println("로그인완료");
							seq = i;
							loginCk = true;
							break;
						} else {
							System.out.println("정보를 확인해주세요");
							break;
						}
					}
				}
				break;
			case 3:
				if (loginCk) {
					System.out.println("자유게시판");
					freeboard = true;
					System.out.println("번호\t제목\t\t작성자\t조회수\t작성일");
					System.out.println("-------------------------------------");
					if(bCnt == 0) {
						System.out.println("게시물없음");
						System.out.println();
					}
					for (int i = 0; i < bCnt; i++) {
						System.out.printf("%d\t%s\t%s\t%d\t%s\n", arrBoard[i].boardCnt, arrBoard[i].splTitle,
								arrBoard[i].writer, arrBoard[i].view, arrBoard[i].date);
					}
					loginCk = false;
				} else if (freeboard) {
					System.out.println("번호 : ");
					int num = scanner.nextInt();
					System.out.println("번호\t제목\t\t내용");
					System.out.println("-------------------------");
					if (num < arrBoard.length) {
						System.out.printf("%d\t%s\t%s\n",arrBoard[num].boardCnt,arrBoard[num].title,arrBoard[num].contents);
						System.out.println();
						
						arrBoard[num].view += 1;
						System.out.println("번호\t제목\t작성자\t조회수\t작성일");
						System.out.println("-------------------------------------");
						for (int i = 0; i < bCnt; i++) {
							System.out.printf("%d\t%s\t%s\t%d\t%s\n", arrBoard[i].boardCnt, arrBoard[i].splTitle,
									arrBoard[i].writer, arrBoard[i].view, arrBoard[i].date);
						}
					} else {
						System.out.println("없습니다.");
					}

				} else {
					System.out.println("로그인 이후 실행해주세요");
				}
				break;
			case 4:
				if (freeboard) {
					System.out.println("1.제목 2.작성자");
					menuNum = scanner.nextInt();
					scanner.nextLine();
					switch (menuNum) {
					case 1:
						System.out.println("제목검색 : ");
						String serchTitle = scanner.next();
						System.out.println("번호\t제목\t작성자\t조회수\t작성일");
						System.out.println("-------------------------------------");
						for (int i = 0; i < bCnt; i++) {
							
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
						for (int i = 0; i < bCnt; i++) {
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
				} else {
					run = false;
				}
				break;
			case 5:
				if (freeboard) {
					freeboard = false;
					loginCk = true;
				} else {
					System.out.println("없는번호");
				}
			default:
				System.out.println("없는번호");
				break;

			}
		}
	}

}
