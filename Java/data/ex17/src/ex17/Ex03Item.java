package ex17;

public class Ex03Item {
    private String itemName;
    private int price;
    private int ea;

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
        return this.ea;
    }

    public void setEa(int ea) {
        this.ea = ea;
    }

    @Override
    public String toString() {
        return "{" +
                " itemName='" + getItemName() + "'" +
                ", price='" + getPrice() + "'" +
                ", ea='" + getEa() + "'" +
                "}";
    }

}
