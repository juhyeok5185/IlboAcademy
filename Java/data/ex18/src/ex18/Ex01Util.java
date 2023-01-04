package ex18;

public class Ex01Util {
	 private String itemName;
	    private int price;
	    private int Ea;

	    public Ex01Util() {
	    }

	    public Ex01Util(String itemName, int price, int Ea) {
	        this.itemName = itemName;
	        this.price = price;
	        this.Ea = Ea;
	    }

	    public String getItemName() {
	        return this.itemName;
	    }

	    public void setItemName(String itemName) {
	        this.itemName = itemName;
	    }

	    public int getPrice() {
	        return this.price;
	    }

	    public void setPrice(int price) {
	        this.price = price;
	    }

	    public int getEa() {
	        return this.Ea;
	    }

	    public void setEa(int Ea) {
	        this.Ea = Ea;
	    }

	    @Override
	    public String toString() {
	        return "{" +
	                " itemName='" + getItemName() + "'" +
	                ", price='" + getPrice() + "'" +
	                ", Ea='" + getEa() + "'" +
	                "}";
	    }
}
