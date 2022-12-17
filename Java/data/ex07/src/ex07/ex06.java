package ex07;

import java.util.Scanner;

import javax.management.monitor.Monitor;

public class ex06 {

	public static void main(String[] args) {
		// 비예약 변수
		String name = "";
		String birth = "";
		int gender = 0;
		String phoneNumber = "";
		int room = 0;
		int people = 0;
		int period = 0;
		int availability = 0;
		int request = 0;
		String uniqueness = "";
		int service = 0;
		int money = 0;
		int cost = 0;
		String req1 = "";
		String directly = "";
		String uu = "";

		// 예약변수
		String user1 = "박주혁";
		String user2 = "서재경";
		String user3 = "김동욱";
		String user4 = "이가은";
		String user5 = "김태희";
		String user6 = "남주혁";
		String user7 = "김혜수";
		String user8 = "이영애";
		String user9 = "탁재훈";
		String user10 = "이상민";
		String num1 = "010 123 1234";
		String ad1 = "인천 미추홀구 학익동";
		boolean visit = false;

		Scanner sc = new Scanner(System.in);
		System.out.println("1.예약 2.비예약 ");
		boolean reservation = false;
		int menuNum = sc.nextInt();

		switch (menuNum) {
		case 1:
			String username = sc.next();
			visit = true;
			System.out.println("고객 이름 : ");

			while (visit) {
				if (user1.equals(username)) {
					System.out.println("고객 이름 : " + user1);
					System.out.println("전화번호 : " + num1);
					System.out.println("주소 : " + ad1);
					if (visit) {
						System.out.println("재방문 고객입니다");
					} else {
						System.out.println("처음 방문한 고객입니다.");
					}
					break;
				}

				else if (user2.equals(username)) {
					System.out.println("고객 이름 : " + user2);
					System.out.println("전화번호 : " + num1);
					System.out.println("주소 : " + ad1);
					if (visit) {
						System.out.println("재방문 고객입니다");
						visit = false;
						reservation = true;
					} else {
						System.out.println("처음 방문한 고객입니다.");
					}
					break;

				} else if (user3.equals(username)) {
					System.out.println("고객 이름 : " + user3);
					System.out.println("전화번호 : " + num1);
					System.out.println("주소 : " + ad1);
					if (visit) {
						System.out.println("재방문 고객입니다");
					} else {
						System.out.println("처음 방문한 고객입니다.");
					}
					break;

				} else if (user4.equals(username)) {
					System.out.println("고객 이름 : " + user4);
					System.out.println("전화번호 : " + num1);
					System.out.println("주소 : " + ad1);
					if (visit) {
						System.out.println("재방문 고객입니다");
					} else {
						System.out.println("처음 방문한 고객입니다.");
					}
					break;

				} else if (user5.equals(username)) {
					System.out.println("고객 이름 : " + user5);
					System.out.println("전화번호 : " + num1);
					System.out.println("주소 : " + ad1);
					if (visit) {
						System.out.println("재방문 고객입니다");
					} else {
						System.out.println("처음 방문한 고객입니다.");
					}
					break;

				} else if (user6.equals(username)) {
					System.out.println("고객 이름 : " + user6);
					System.out.println("전화번호 : " + num1);
					System.out.println("주소 : " + ad1);
					if (visit) {
						System.out.println("재방문 고객입니다");
					} else {
						System.out.println("처음 방문한 고객입니다.");
					}
					break;

				} else if (user7.equals(username)) {
					System.out.println("고객 이름 : " + user7);
					System.out.println("전화번호 : " + num1);
					System.out.println("주소 : " + ad1);
					if (visit) {
						System.out.println("재방문 고객입니다");
					} else {
						System.out.println("처음 방문한 고객입니다.");
					}
					break;

				} else if (user8.equals(username)) {
					System.out.println("고객 이름 : " + user8);
					System.out.println("전화번호 : " + num1);
					System.out.println("주소 : " + ad1);
					if (visit) {
						System.out.println("재방문 고객입니다");
					} else {
						System.out.println("처음 방문한 고객입니다.");
					}
					break;

				} else if (user9.equals(username)) {
					System.out.println("고객 이름 : " + user9);
					System.out.println("전화번호 : " + num1);
					System.out.println("주소 : " + ad1);
					if (visit) {
						System.out.println("재방문 고객입니다");
					} else {
						System.out.println("처음 방문한 고객입니다.");
					}
					break;

				} else if (user10.equals(username)) {
					System.out.println("고객 이름 : " + user10);
					System.out.println("전화번호 : " + num1);
					System.out.println("주소 : " + ad1);
					if (visit) {
						System.out.println("재방문 고객입니다");
					} else {
						System.out.println("처음 방문한 고객입니다.");
					}
					break;

				}

			}
			break;
		case 2:
			
			System.out.println("비예약 고객");
			System.out.println("이름 : ");
			name = sc.next();
			System.out.println("생년월일 : ");
			birth = sc.next();
			System.out.println("성별 : 1.남자 2.여자 ");
			gender = sc.nextInt();
			switch (gender) {
			case 1:
				System.out.println("남자");
				break;
			case 2:
				System.out.println("여자");
				break;
			default:
				break;
			}
			System.out.println("전화번호 : ");
			phoneNumber = sc.next();
			while (reservation) {
				System.out.println("룸 안내\n1박기준\t1. 스위트룸(500만 원)  2. 트윈스(300만 원)  3. 디럭스(100만 원)");
				System.out.println("룸 선택 : ");
				room = sc.nextInt();
				switch (room) {
				case 1:
					System.out.println("스위트룸 선택");
					cost = 50000000;
					break;
				case 2:
					System.out.println("트윈스 선택");
					cost = 30000000;
					break;
				case 3:
					System.out.println("디럭스 선택 ");
					cost = 10000000;
					break;
				default:
					break;
				}
				System.out.println("숙박기간 : ");
				period = sc.nextInt();
				money += cost * period;
				System.out.println("숙박인원 : ");
				people = sc.nextInt();
				if (people >= 3) {
					money += (30000 * (people - 2));
				}
				
				System.out.println("유로서비스 이용여부 : 1.조식(80000) 2.석식(200000) 3.룸서비스(3000000) ");
				availability = sc.nextInt();
				switch (availability) {
				case 1:
					System.out.println("조식선택");
					money += 80000;
					uu = "조식";
					break;
				case 2:
					System.out.println("석식선택");
					money += 200000;
					uu = "석식";
					break;
				case 3:
					System.out.println("룸서비스선택");
					money += 300000;
					uu = "룸서비스";
					break;
				}
				System.out.println("요청사항 안내\n1.전망 좋은 고층의 객실  2.소음없는 객실  3.욕조가 있는 객실  4.직접요청");
				System.out.println("요청사항 : ");
				
				request = sc.nextInt();
				
				switch (request) {
				case 1:
					System.out.println("전망이 좋은 고층의 객실 선택");
					req1 = "전망이 좋은 고층의 객실 선택";
					break;
				case 2:
					System.out.println("소음없는 객실 선택");
					req1 = "소음없는 객실 선택";
					break;
				case 3:
					System.out.println("욕조가 있는 객실 선택");
					req1 = "욕조가 있는 객실 선택";
					
					break;
				case 4:
					System.out.println("직접요청 선택");
					System.out.print("요청사항을 입력해 주세요 : ");
					directly = sc.next();
					break;
				default:
					break;
				}
				System.out.println("특이사항 : ");
				uniqueness = sc.next();
				System.out.println("-------------");
				System.out.println(name + "님 저희 호텔에 방문을 진심으로 환영합니다.");
				System.out.println("생년월일 : " + birth);
				System.out.println("성별 : " + gender);
				System.out.println("연락처 : " + phoneNumber);
				System.out.println("유료서비스 : " + uu);
				System.out.println("인원 : " + people + "명");
				System.out.println("숙반기간 : " + period + "일");
				if (directly.length() < 0) {
					System.out.println("요청사항 : " + req1);
				} else {
					System.out.println("요청사항 : " + directly);
				}
				System.out.println("특이사항 : " + uniqueness);
				System.out.println("결재금액 : " + money);
				reservation = false;
			}
			}

	}
}