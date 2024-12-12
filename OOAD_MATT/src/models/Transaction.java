package models;

import java.util.Date;

public class Transaction {
    private String transactionId;
    private String itemId;
    private String userId;
    private Date date;

    public Transaction(String transactionId, String itemId, String userId, Date date) {
        this.transactionId = transactionId;
        this.itemId = itemId;
        this.userId = userId;
        this.date = date;
    }

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
