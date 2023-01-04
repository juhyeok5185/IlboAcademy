import javax.swing.text.Utilities;

public class CRSMain {

	public static void main(String[] args) {
		CRSUtil util = new CRSUtil();
		CRSCustomerDAO cusDAO = new CRSCustomerDAO();
		CRSPlaneDAO  planeDAO = new CRSPlaneDAO();
		System.out.println("1. 발권");
		System.out.println("2. 운임계산");
		System.out.println("3. 수정");
		System.out.println("4. 예약자 확인");
		System.out.println("5. 비행기자리확인(편명검색)");
		System.out.println("6. 시차");
		int menuNum = util.numberCheck("");
		switch (menuNum) {
		case 1:
			cusDAO.발권();
			break;
		case 2:
			cusDAO.운임계산("","");
			break;
		case 3:
			cusDAO.정보변경("");
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		default:
			break;

		}
	}
}
