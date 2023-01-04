package InterfaceTest;

public class DesignCompany implements Company {
	private String comName;
	DesignCompany(String comName) {
		this.comName = comName;
	}
	@Override
	public void makeProduct() {
		System.out.println("design product");
	}
}
