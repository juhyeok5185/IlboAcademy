package ex16;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Date today = null;
		int writeCnt = 10;
		String day[] = new String[3];
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일 hh시mm분ss초");
		SimpleDateFormat sdfDay = new SimpleDateFormat("yyyy년MM월dd일");
		Ex04Board[] arrEx04Board = new Ex04Board[10];
		String loginName = "";
		int noticeWriteCount = 0;
		Ex04User[] arrEx04Users = new Ex04User[10];
		int cnt = 0;
		boolean r = true;
		boolean rr = true;
		boolean loginCheck = false;
		int loginIndex = 0;
		Scanner scanner = new Scanner(System.in);

		today = new Date();
		day[0] = sdf.format(today);
		System.out.println("회원 게시판");
		while (r) {
			if (loginCheck == true) {
				System.out.println("1.비밀번호 수정 2.로그아웃(" + loginName + ") 3.자유게시판 0.종료");
			} else {
				System.out.println("1.회원가입 2.로그인 3.자유게시판 0.종료");
			}
			System.out.print("메뉴선택:");
			int me = scanner.nextInt();
			scanner.nextLine();
			switch (me) {
			case 1:
				if (loginCheck) {
					System.out.print("수정할 pw : ");
					String pwString = scanner.nextLine();
					arrEx04Users[loginIndex].setPw(pwString);
					System.out.println("비밀번호가 수정되었습니다.");
				} else {
					Ex04User ex04User = new Ex04User();
					System.out.print("이름 : ");
					String name = scanner.next();
					ex04User.setName(name);

					System.out.print("Id : ");
					String id = scanner.next();
					ex04User.setId(id);

					System.out.print("pw : ");
					String pw = scanner.next();
					ex04User.setPw(pw);

					arrEx04Users[cnt] = ex04User;


					cnt++;
				}
				break;
			case 2:
				if (loginCheck) {
					loginCheck = false;
				} else {
					System.out.print("Id:");
					String loid = scanner.next();
					System.out.print("pw:");
					String lopw = scanner.next();
					for (int i = 0; i < cnt; i++) {
						if (arrEx04Users[i].getId().equals(loid) && arrEx04Users[i].getPw().equals(lopw)) {
							loginIndex = i;
							loginName = arrEx04Users[i].getName();
							loginCheck = true;
//							
							break;
						}
					}
					if (!loginCheck) {
						System.out.println("로그인 정보가없습니다.");
					}
				}
				break;
			case 3:
				if (loginCheck) {
					System.out.println("공지사항");
					System.out.println("번호\t제목\t\t\t작성자\t\t조회수\t\t작성일");
					System.out.println("----------------------------------------------------------------------------");
					if (noticeWriteCount == 0) {
						System.out.println("등록된 게시물이 없습니다.");
					} else {
						for (int i = 0; i < noticeWriteCount; i++) {
//							System.out.println(arrEx04Board[i].getNoticeWriteDay());
							System.out.printf("%d\t%.12s..\t\t%s\t\t%d\t\t%n", arrEx04Board[i].getNoticeNum(), arrEx04Board[i].getNoticeTitle(),
									arrEx04Board[i].getNoticeWrite(), arrEx04Board[i].getNoticeViewCnt(), arrEx04Board[i].getNoticeWriteDay());
						}
					}
					System.out.println("1.글쓰기 2.수정 3.읽기 4.검색");
					System.out.print("메뉴선택 : ");
					int menu = scanner.nextInt();
					scanner.nextLine();
					switch (menu) {
					case 1:
						today = new Date();
						Ex04Board ex04Board = new Ex04Board();
						System.out.print("제목 : ");
						String writeTitleString = scanner.nextLine();
						ex04Board.setNoticeTitle(writeTitleString);
						System.out.print("내용 : ");
						String writeContentString = scanner.next();
						ex04Board.setNoticeContents(writeContentString);
						ex04Board.setNoticeWrite(loginName);
						ex04Board.setNoticeWriteDay(sdf.format(today));
						ex04Board.setNoticeNum(noticeWriteCount);
						arrEx04Board[noticeWriteCount] = ex04Board;
						noticeWriteCount++;
						System.out.println("게시물 등록 완료");
						break;
					case 2:
						System.out.print("게시물 번호 : ");
						int num = scanner.nextInt();
						scanner.nextLine();
						boolean updateCheck = false;
						for (int i = 0; i < noticeWriteCount; i++) {
							if (num == arrEx04Board[i].getNoticeNum()) {
								System.out.println("수정전 제목 : " + arrEx04Board[i].getNoticeTitle());
								System.out.print("수정할 제목 : ");
								String titleString = scanner.nextLine();
								arrEx04Board[i].setNoticeTitle(titleString);
								System.out.println("수정전 내용 : " + arrEx04Board[i].getNoticeContents());
								System.out.print("수정할 내용 : ");
								String contentsString = scanner.nextLine();
								arrEx04Board[i].setNoticeContents(contentsString);
								updateCheck = true;
							}
						}
						if (updateCheck) {
							System.out.println("게시물 수정 완료");
						} else {
							System.out.println("등록된 게시물이 없습니다.");
						}
						break;
					case 3:
						System.out.println("게시물 읽기");
						System.out.print("게시물 번호 : ");
						num = scanner.nextInt();
						scanner.nextLine();
						boolean readCheck = false;
						for (int i = 0; i < noticeWriteCount; i++) {
							if (num == arrEx04Board[i].getNoticeNum()) {
								arrEx04Board[i].setNoticeViewCnt(arrEx04Board[i].getNoticeViewCnt() + 1);
								System.out.printf("번호\t: %d%n", i + 1);
								System.out.printf("제목\t: %s%n", arrEx04Board[i].getNoticeTitle());
								System.out.printf("내용\t: %s%n", arrEx04Board[i].getNoticeContents());
								System.out.printf("작성자\t: %s%n", arrEx04Board[i].getNoticeWrite());
								System.out.printf("조회수\t: %s%n", arrEx04Board[i].getNoticeViewCnt());
								System.out.printf("작성일\t: %s%n", arrEx04Board[i].getNoticeWriteDay());
								readCheck = true;
							}
						}
						if (!readCheck) {
							System.out.println("등록된 게시물이 없습니다.");
						}
						break;
					case 4:
						System.out.println("검색");
						System.out.println("1.제목 2.작성자");
						System.out.print("메뉴선택 : ");
						menu = scanner.nextInt();
						scanner.nextLine();
						switch (menu) {
						case 1:
							System.out.print("제목 : ");
							String title = scanner.nextLine();
							System.out.println("번호\t제목\t\t\t작성자\t\t조회수\t\t작성일");
							System.out.println(
									"----------------------------------------------------------------------------");
							for (int i = 0; i < noticeWriteCount; i++) {
								if (arrEx04Board[i].getNoticeTitle().contains(title)) {
									System.out.printf("%d\t%.12s..\t\t%s\t\t%s\t\t\s%n", arrEx04Board[i].getNoticeNum(), arrEx04Board[i].getNoticeTitle(),
											arrEx04Board[i].getNoticeWrite(), arrEx04Board[i].getNoticeViewCnt(),arrEx04Board[i].getNoticeWriteDay());
									arrEx04Board[i].toString();
									readCheck = true;
								}
							}
							break;
						case 2:
							break;
						default:
							break;
						}
					default:
						break;
					}
				} else {
					System.out.println("로그인후 사용가능합니다.");
				}
				break;
			case 0:
				r = false;
				break;
			default:
				break;
			}
		}
		scanner.close();
		System.out.println("프로그램종료");
	}
}
