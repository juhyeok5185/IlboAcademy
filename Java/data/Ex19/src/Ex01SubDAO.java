import java.util.ArrayList;
import java.util.List;

public class Ex01SubDAO {
	private List<Ex01Sub> arrSubs = new ArrayList<>();
	
	public List<Ex01Sub> getArrSubs() {
		return arrSubs;
	}

	public void setArrSubs(Ex01Sub ex01Sub) {
		arrSubs.add(ex01Sub);
	}
}
