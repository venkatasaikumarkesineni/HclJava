package com.hcl.bank;

public class UpdateAccount {
	private int accountNo;
	private String state;
	private String city;
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String updateAccount(){
		return AccountBAL.updateAccountBal(accountNo, city, state);
	}

}
