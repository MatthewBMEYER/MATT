package models;

public class Item {
    private String itemId;
    private String itemName;
    private int stock;
    private String sellerId;

    public Item(String itemId, String itemName, int stock, String sellerId) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.stock = stock;
        this.sellerId = sellerId;
    }

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getSellerId() {
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

    
}
