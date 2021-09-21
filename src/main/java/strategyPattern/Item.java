package strategyPattern;

public class Item {

	private String itemName;
	public String getItemName() {
		return itemName;
	}

	public float getPrice() {
		return price;
	}

	public String getItemCode() {
		return itemCode;
	}

	private float price;
	private String itemCode;
	
	public Item(String itemName, float price, String itemCode) {
		this.itemCode = itemCode;
		this.price = price;
		this.itemName = itemName;
	}
	
	
}
