package com.hcl.bank;

public class SearchAccount {
	private int accno;

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}
	public Accounts searchAccount(){
		return AccountBAL.searchAccountBal(accno);
	}

}
