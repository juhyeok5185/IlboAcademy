import java.util.ArrayList;
import java.util.List;

public class CRSCustomerDAO {
	List<CRSCustomer> arrCustomer = new ArrayList<>();
	
	public void 발권() {
		정보등록();
	}
	
	public void 정보등록() {
		운임계산("","");
	}
	
	public void 운임계산(String 출발지 , String 도착지) {
		
	}
	
	public void 정보변경(String 이름) {
		
	}
}
