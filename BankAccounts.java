package com.hema;

public class BankAccounts
{
private int Bank_Account_id;
private users user;
private String Account_number;
private String IFSC_Code;
private String Bank_Name;
private String Branch;
private AccountStatus account_status;
public BankAccounts(int bank_Account_id, users user, String account_number, String iFSC_Code, String bank_Name,
		String branch, AccountStatus account_Status) {
	super();
	Bank_Account_id = bank_Account_id;
	this.user = user;
	Account_number = account_number;
	IFSC_Code = iFSC_Code;
	Bank_Name = bank_Name;
	Branch = branch;
	this.account_status = account_Status;
}
public int getBank_Account_id() {
	return Bank_Account_id;
}
public void setBank_Account_id(int bank_Account_id) {
	Bank_Account_id = bank_Account_id;
}
public users getUser() {
	return user;
}
public void setUser(users user) {
	this.user = user;
}
public String getAccount_number() {
	return Account_number;
}
public void setAccount_number(String account_number) {
	Account_number = account_number;
}
public String getIFSC_Code() {
	return IFSC_Code;
}
public void setIFSC_Code(String iFSC_Code) {
	IFSC_Code = iFSC_Code;
}
public String getBank_Name() {
	return Bank_Name;
}
public void setBank_Name(String bank_Name) {
	Bank_Name = bank_Name;
}
public String getBranch() {
	return Branch;
}
public void setBranch(String branch) {
	Branch = branch;
}
public AccountStatus getAccount_Status() {
	return account_status;
}
public void setAccount_Status(AccountStatus account_Status) {
	this.account_status = account_Status;
}

}
