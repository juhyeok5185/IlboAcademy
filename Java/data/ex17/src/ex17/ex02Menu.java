package ex17;

public class ex02Menu {
	private String Name;
	private int price;
	private int ea;

	public ex02Menu() {

	}

	public ex02Menu(String Name, int price, int ea) {
		this.Name = Name;
		this.price = price;
		this.ea = ea;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getEa() {
		return ea;
	}

	public void setEa(int ea) {
		this.ea = ea;
	}

	@Override
	public String toString() {
		return "ex02Menu [Name=" + Name + ", price=" + price + ", ea=" + ea + "]";
	}
}
