import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberDAO memberDAO = new MemberDAO();
		Util util = new Util();

		boolean run = true;
		while (run) {
			System.out.println("1.예약 2.예약자확인 3.방확인 4.고객관리 5.방초기화  ");
			int menuNum = util.meunNumCheck();
			switch (menuNum) {
			case 1:
				memberDAO.reservation();
				// 예약
				break;
			case 2:
				memberDAO.memberlist();
//				//예약자확인
				break;
			case 3:
				memberDAO.status();
				break;
			case 4:
				memberDAO.memberDetail();
				break;
			case 5:
				memberDAO.managerRefresh();
				break;
			default:
				System.out.println("없는번호");
				break;
			}
		}
	}

}
