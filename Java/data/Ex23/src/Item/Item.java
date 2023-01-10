package Item;

public class Item {
	private String name;
	private int price;
	private int ea;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return  name + "," + price + "," + ea;
	}

}
