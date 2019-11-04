package com.hcl.bank;

public class WithDrawAccount {
  private int accno;
  private int withdraw;
public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}
public int getWithdraw() {
	return withdraw;
}
public void setWithdraw(int withdraw) {
	this.withdraw = withdraw;
}
public String withDraw(){
	return AccountBAL.withdrawAccountBal(accno, withdraw);
}
}
