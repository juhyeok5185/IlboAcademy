package InterfaceTest;

public class ITCompany implements Company {
	String compName;
	ITCompany(String comName) {
		this.compName = comName;
	}
	public void makeProgram() {
		System.out.println("make it program");
	}
	@Override
	public void makeProduct() {
		System.out.println("it product");
	}
}
