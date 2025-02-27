package com.hema;

import java.security.Timestamp;

public class Transactions
{
	private int transactiont_id;
	private Timestamp trasanctiontimedate;
	private int source_id;
	private int target_id;
	private SourceType source_type;
	private SourceType destination_type;
	private double transaction_Amount;
	private int userid;
	private users user;
	public Transactions(int transactiont_id, Timestamp trasanctiontimedate, int source_id, int target_id,
			SourceType source_type, SourceType destination_type, double transaction_Amount, int userid, users user) {
		super();
		this.transactiont_id = transactiont_id;
		this.trasanctiontimedate = trasanctiontimedate;
		this.source_id = source_id;
		this.target_id = target_id;
		this.source_type = source_type;
		this.destination_type = destination_type;
		this.transaction_Amount = transaction_Amount;
		this.userid = userid;
		this.user = user;
	}
	public int getTransactiont_id() {
		return transactiont_id;
	}
	public void setTransactiont_id(int transactiont_id) {
		this.transactiont_id = transactiont_id;
	}
	public Timestamp getTrasanctiontimedate() {
		return trasanctiontimedate;
	}
	public void setTrasanctiontimedate(Timestamp trasanctiontimedate) {
		this.trasanctiontimedate = trasanctiontimedate;
	}
	public int getSource_id() {
		return source_id;
	}
	public void setSource_id(int source_id) {
		this.source_id = source_id;
	}
	public int getTarget_id() {
		return target_id;
	}
	public void setTarget_id(int target_id) {
		this.target_id = target_id;
	}
	public SourceType getSource_type() {
		return source_type;
	}
	public void setSource_type(SourceType source_type) {
		this.source_type = source_type;
	}
	public SourceType getDestination_type() {
		return destination_type;
	}
	public void setDestination_type(SourceType destination_type) {
		this.destination_type = destination_type;
	}
	public double getTransaction_Amount() {
		return transaction_Amount;
	}
	public void setTransaction_Amount(double transaction_Amount) {
		this.transaction_Amount = transaction_Amount;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public users getUser() {
		return user;
	}
	public void setUser(users user) {
		this.user = user;
	}
	
	
	
	
	

}
