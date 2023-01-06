
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MemberDAO {

	ArrayList<Customer> list = new ArrayList<>();
	ArrayList<Customer> blackList = new ArrayList<>();
	ArrayList<Customer> vipList = new ArrayList<>();
	String[][] arrSeat = new String[9][5];
	SuperPayment payment = new payment();
	Date today = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yy년 MM월 dd일 hh시 mm분");
	int cost;
	int roomCharge = 100000;
	Util util = new Util();
	int vist;
	boolean ispaid = false;

	public MemberDAO() {
		refresh();
	}

	public void reservation() {
		Scanner sc = new Scanner(System.in);
		Customer customer = new Customer();
		System.out.println("신규회원등록");
		customer.setName(util.nameCheck());
		customer.setBirth(util.birthCheck());

		customer.setGender(util.genderCheck());
		if (customer.getGender() == 1) {
			System.out.println("남성");
		} else if (customer.getGender() == 2) {
			System.out.println("여성");
		}
		customer.setPhoneNumber(util.phoneNumerCheck());

		list.add(customer);

		customer.setPeriod(util.periodCheck());

		cost += roomCharge * customer.getPeriod();
		status();
		int floor = util.floorCheck();
		int roomNum = util.roomNumCheck();

		cost = extraCharge(cost);
		System.out.println("금액 : " + cost);
		ispaid = pay(cost);
		if (ispaid) {
			today = new Date();
			customer.setDate(sdf.format(today));
			customer.setRoomNum(floor, roomNum);
			added(floor, roomNum - 1);
			if (cost >= 1000000) {
				customer.setVip(true);
				if (customer.getVip()) {
					customer.setsNote("VIP");
				}
			}
		} else {
			System.out.println("결제실패");
		}
		cost = 0;

	}

	public int extraCharge(int cost) {
		int adultPoorCharge = 50000;
		int kidPoorCharge = 30000;
		int breakfast = 40000;
		int dinner = 80000;
		int extraPeopleNum = 30000;
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("사용하실 부가서비스");
			System.out.println("1.풀장 2.조식 3.석식 4.인원추가 5.없음");
			int menuNum = util.meunNumCheck();

			switch (menuNum) {
			case 1:
				System.out.println("성인 : ");
				int adult = scanner.nextInt();
				System.out.println("아동 : ");
				int kid = scanner.nextInt();
				cost += (adult * adultPoorCharge) + (kid * kidPoorCharge);
				System.out.println(cost + "원");
				break;
			case 2:
				System.out.println("인원수 : ");
				int num = scanner.nextInt();
				cost += breakfast * num;
				System.out.println(cost + "원");
				break;
			case 3:
				System.out.println("인원수 : ");
				num = scanner.nextInt();
				cost += dinner * num;
				System.out.println(cost + "원");
				break;
			case 4:
				System.out.println("총인원 : ");
				int peopleNum = scanner.nextInt();
				if (peopleNum > 2) {
					cost += (peopleNum - 2) * extraPeopleNum;
				}
				System.out.println(cost + "원");
				break;
			case 5:
				run = false;
				break;
			default:
				System.out.println("없는번호");
				break;
			}
		}
		return cost;
	}

	public void memberlist() {
		System.out.println("일보호텔 고객리스트");
		System.out.println("----------------------------------------------------------------------------");
		for (Customer memlist : list) {
			System.out.println(memlist.toString());
			System.out.println("----------------------------------------------------------------------------");
		}
	}


	public void refresh() {
		for (int i = 0, x = 8; i < arrSeat.length; i++, x--) {
			for (int j = 0; j < arrSeat[i].length; j++) {
				if (i == 8) {
					if (j == 4) {
						arrSeat[i][j] = "----";
					}
					arrSeat[i][j] = "------";
				} else {
					arrSeat[i][j] = "□ " + (j + 1) + "호 ";
				}
			}
		}
	}

	public void managerRefresh() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("비밀번호 : ");
		String password = scanner.next();
		if (password.equals("1234")) {
			for (int i = 0, x = 8; i < arrSeat.length; i++, x--) {
				for (int j = 0; j < arrSeat[i].length; j++) {
					if (i == 8) {
						if (j == 4) {
							arrSeat[i][j] = "----";
						}
						arrSeat[i][j] = "------";
					} else {
						arrSeat[i][j] = "□ " + (j + 1) + "호 ";
					}
				}
			}
			System.out.println("초기화 완료");
		} else {
			System.out.println("비밀번호를 확인해주세요");
		}
	}

	public void added(int a, int b) {

		for (int i = 0, x = 8; i < arrSeat.length; i++, x--) {
			for (int j = 0; j < arrSeat[i].length; j++) {
				if (x == a && j == b) {
					arrSeat[i][j] = "■ " + (j + 1) + "호 ";

				}
				System.out.print(arrSeat[i][j]);
			}
			if (i == 8) {
				System.out.print("┃ 로비");
			} else {
				System.out.print("┃ " + x + "층");
			}
			System.out.println();
		}
	}

	public void status() {
		for (int i = 0, x = 8; i < arrSeat.length; i++, x--) {
			for (int j = 0; j < arrSeat[i].length; j++) {
				System.out.print(arrSeat[i][j]);
			}
			if (i == 8) {
				System.out.print("┃ 로비");
			} else {
				System.out.print("┃ " + x + "층");
			}
			System.out.println();
		}
	}

	public boolean pay(int cost) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("카드이름 : ");
		payment.cardName(scanner.next());
		payment.cardNum(util.cardNumCheck());
		payment.cardExpairy(util.cardExpairyCheck());
		return true;
	}

	public void memberDetail() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.읽기 2.특이사항");
		int menu = sc.nextInt();
		sc.nextLine();
		switch (menu) {
		case 1:
			System.out.println("방번호 : ");
			String inputNum = sc.nextLine();
			for (Customer customer : list) {
				if (customer.getRoomNum().equals(inputNum)) {
					System.out.println(customer.toString());

				}
			}
			break;
		case 2:
			System.out.println("방번호 : ");
			inputNum = sc.next();
			sc.nextLine();
			for (Customer customer : list) {
				if (customer.getRoomNum().equals(inputNum)) {
				}
				System.out.println("특이사항 : ");
				String sNote = sc.nextLine();
				customer.setsNote(sNote);
			}
			break;
		case 3:
			break;
		default:
			System.out.println("없는번호");
			break;
		}
	}

}
