package ex16;

public class ex03Item {
	private String itemName;
	private int price;
	private int Ea;
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getEa() {
		return Ea;
	}
	public void setEa(int ea) {
		Ea = ea;
	}
	@Override
	public String toString() {
		return "ex03Item [itemName=" + itemName + ", price=" + price + ", Ea=" + Ea + "]";
	}
	
}
