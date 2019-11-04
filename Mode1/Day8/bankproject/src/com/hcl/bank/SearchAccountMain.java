package com.hcl.bank;

import java.util.Scanner;

public class SearchAccountMain {
	public static void main(String[] args) {
		int accountNo;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the account number");
		accountNo=sc.nextInt();
		Accounts objAccounts=AccountBAL.searchAccountBal(accountNo);
		if(objAccounts!=null)
		{
			System.out.println(" first name"+ objAccounts.getFirstName() );
			System.out.println("last name "+ objAccounts.getLastName() );
			System.out.println(" city is "+ objAccounts.getCity() );
			System.out.println("state is "+ objAccounts.getState() );
			System.out.println("amount is "+ objAccounts.getAmount() );
			System.out.println("checq facil is "+ objAccounts.getCheqFacil() );
			System.out.println("account type "+ objAccounts.getAccountType() );
		}
		else
		{
			System.out.println("account not found");
		}
		
		}

}
