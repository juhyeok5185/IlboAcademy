
import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {

	// new
	public int meunNumCheck() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		while (true) {
			try {
				System.out.print("메뉴선택 : ");
				menu = sc.nextInt();
				sc.nextLine();
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("문자는 입력이 불가능합니다. 숫자로 입력하세요.");
				sc.nextLine();
				continue;
			}
			break;
		}

		return menu;
	}

	public String nameCheck() {
		// 스트링에 숫자를 받으면 안됨
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = "";
		while (true) {
			System.out.print("고객명 : ");
			name = sc.nextLine();
			if (name.equals("")) {
				System.out.println("성명을 입력하세요.");
				continue;
			}
			if (name.length() < 2) {
				System.out.println("2자 이상의 성명을 입력하세요.");
				continue;
			}
//			name = name.replaceAll("[^\\d]", "");
//			if (name.length() != 0) {
//				System.out.println("숫자는 입력이 불가합니다.");
//				continue;
//			}
			break;
		}
		return name;
	}

	public int birthCheck() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int birth = 0;
		while (true) {
			try {
				System.out.print("생년월일(6자) : ");
				birth = sc.nextInt();
				sc.nextLine();
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("문자는 입력이 불가능합니다. 숫자로 입력하세요.");
				sc.nextLine();
				continue;
			}
			int birthLength = (int) ((Math.log10(birth) + 1));
			if (birthLength != 6) {
				System.out.println("생년월일을 다시 입력하세요.");
				continue;

			}
			break;
		}
		return birth;
	}

	public int genderCheck() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int gender = 0;
		while (true) {
			try {
				System.out.println("성별");
				System.out.println("1.남성 2.여성");
				gender = sc.nextInt();
				sc.nextLine();
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("문자는 입력이 불가능합니다. 숫자로 입력하세요.");
				sc.nextLine();
				continue;
			}
			if (gender != 1 && gender != 2) {
				System.out.println("1번 혹은 2번만 입력하세요.");
				continue;
			}
			break;
		}
		return gender;
	}

	public String phoneNumerCheck() {
		// 스트링에 숫자만 받아야함
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String phoneNumber = "";
		while (true) {
			System.out.print("전화번호 : ");
			phoneNumber = sc.nextLine();
			phoneNumber = phoneNumber.replaceAll("[^\\d]", "");
			if (phoneNumber.length() != 11) {
				System.out.println("전화번호를 다시 입력하세요.");
				continue;
			}
			break;
		}
		return phoneNumber;
	}

	public int periodCheck() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int period = 0;
		while (true) {
			System.out.print("숙박기간  : ");
			try {
				period = sc.nextInt();
				sc.nextLine();
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("문자는 입력이 불가능합니다. 숫자로 입력하세요.");
				sc.nextLine();
				continue;
			}
			break;
		}
		return period;
	}

	public int floorCheck() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int floor = 0;
		while (true) {
			try {
				System.out.print("층 선택 : ");
				floor = sc.nextInt();
				sc.nextLine();
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("문자는 입력이 불가능합니다. 숫자로 입력하세요.");
				sc.nextLine();
				continue;
			}
			if (floor > 8) {
				System.out.println("1층부터 8층까지 있는 호텔입니다. 범위 안에서 다시 선택하세요.");
				continue;
			}
			if (floor < 1) {
				System.out.println("1층부터 8층까지 있는 호텔입니다. 범위 안에서 다시 선택하세요.");
				continue;
			}
			break;
		}
		return floor;
	}

	public int roomNumCheck() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int roomNum = 0;
		while (true) {
			try {
				System.out.print("방 번호 선택 : ");
				roomNum = sc.nextInt();
				sc.nextLine();
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("문자는 입력이 불가능합니다. 숫자로 입력하세요.");
				sc.nextLine();
				continue;
			}
			if (roomNum > 6) {
				System.out.println("1호실부터 6호실까지 있는 호텔입니다. 범위 안에서 다시 선택하세요.");
				continue;

			}
			if (roomNum < 1) {
				System.out.println("1호실부터 6호실까지 있는 호텔입니다. 범위 안에서 다시 선택하세요.");
				continue;

			}
			break;
		}
		return roomNum;
	}

	// new
	public String cardNumCheck() {
		// 스트링에 숫자만 받기
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String cardNum = "";
		while (true) {
			System.out.print("카드번호 : ");
			cardNum = sc.nextLine();
			cardNum = cardNum.replaceAll("[^\\d]", "");
			if (cardNum.length() != 16) {
				System.out.println("카드번호를 다시 입력하세요.");
				continue;
			}
			break;
		}
		return cardNum;
	}

	public String cardExpairyCheck() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String cardExpairy = "";
		while (true) {
			System.out.print("카드 유효기간 : ");
			cardExpairy = sc.nextLine();
			cardExpairy = cardExpairy.replaceAll("[^\\d]", "");
			if (cardExpairy.length() != 4) {
				System.out.println("카드 유효기간을 다시 입력하세요.");
				continue;
			}
			break;
		}
		return cardExpairy;
	}

}