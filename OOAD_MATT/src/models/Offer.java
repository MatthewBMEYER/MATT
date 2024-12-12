package models;

public class Offer {
    private String offerId;
    private String itemId;
    private String userId;
    private double offerPrice;
    private String status;

    public Offer(String offerId, String itemId, String userId, double offerPrice, String status) {
        this.offerId = offerId;
        this.itemId = itemId;
        this.userId = userId;
        this.offerPrice = offerPrice;
        this.status = status;
    }

	public String getOfferId() {
		return offerId;
	}

	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public double getOfferPrice() {
		return offerPrice;
	}

	public void setOfferPrice(double offerPrice) {
		this.offerPrice = offerPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

    
}
