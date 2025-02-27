package com.hema;

import java.sql.Date;

public class useraccount
{
private  int account_id;
private Date open_date;
private double cuurent_wallet_balance;
private int linked_accounts_count;
private int wallet_pin;
private users user;
public useraccount(int account_id, Date open_date, double cuurent_wallet_balance, int linked_accounts_count,
		int wallet_pin, users user) {
	super();
	this.account_id = account_id;
	this.open_date = open_date;
	this.cuurent_wallet_balance = cuurent_wallet_balance;
	this.linked_accounts_count = linked_accounts_count;
	this.wallet_pin = wallet_pin;
	this.user = user;
}
public int getAccount_id() {
	return account_id;
}
public void setAccount_id(int account_id) {
	this.account_id = account_id;
}
public Date getOpen_date() {
	return open_date;
}
public void setOpen_date(Date open_date) {
	this.open_date = open_date;
}
public double getCuurent_wallet_balance() {
	return cuurent_wallet_balance;
}
public void setCuurent_wallet_balance(double cuurent_wallet_balance) {
	this.cuurent_wallet_balance = cuurent_wallet_balance;
}
public int getLinked_accounts_count() {
	return linked_accounts_count;
}
public void setLinked_accounts_count(int linked_accounts_count) {
	this.linked_accounts_count = linked_accounts_count;
}
public int getWallet_pin() {
	return wallet_pin;
}
public void setWallet_pin(int wallet_pin) {
	this.wallet_pin = wallet_pin;
}
public users getUser() {
	return user;
}
public void setUser(users user) {
	this.user = user;
}

}
