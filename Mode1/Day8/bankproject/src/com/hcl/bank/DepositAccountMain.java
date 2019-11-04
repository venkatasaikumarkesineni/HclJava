package com.hcl.bank;

import java.util.Scanner;

public class DepositAccountMain {
	public static void main(String[] args) {
		int accountNo;
		int depositAmount;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the account number");
		accountNo=sc.nextInt();
		System.out.println("enter amount");
		depositAmount=sc.nextInt();
		System.out.println(AccountBAL.depositaccountBal(accountNo,depositAmount));
	}

}
