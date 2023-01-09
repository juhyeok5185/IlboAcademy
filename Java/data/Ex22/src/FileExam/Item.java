package FileExam;

public class Item {
	private String itemName;
	private int itemPrice;
	private int itemEA;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getItemEA() {
		return itemEA;
	}
	public void setItemEA(int itemEA) {
		this.itemEA = itemEA;
	}
	@Override
	public String toString() {
		return itemName + "," + itemPrice + "," + itemEA;
	}	
}
