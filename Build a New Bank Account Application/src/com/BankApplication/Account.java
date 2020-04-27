package com.BankApplication;

import java.util.HashMap;
import java.util.Map;

public abstract class Account implements BaseRate{
	
//	public void deposit() {
//		
//	}
//	
//	public void withdrawl() {
//		
//	}
//	
//	public void transfer() {
//		
//	}
	public abstract int getSafetyDepBox();
	public abstract int getAccessCode();
	public abstract double getInterestRate();
	public abstract long getDebitCard();
	public abstract int getPIN();

	public static void showInfo(HashMap<CustomerDetail, Account> hmap,String name) {
		for(Map.Entry<CustomerDetail, Account> cd : hmap.entrySet()) {
			if(cd.getKey().getName().equalsIgnoreCase(name)) {
				System.out.println("Name: "+ cd.getKey().getName());
				System.out.println("Social security number: "+ cd.getKey().getSsn());
				System.out.println("Account type: "+ cd.getKey().getAccountType());
				System.out.println("Initial deposit: "+ cd.getKey().getInitialDeposit());
				System.out.println("Account number: "+ cd.getKey().getAccountNumber());
				if(cd.getKey().getAccountType().equalsIgnoreCase("Savings")) {
					System.out.println("Safety deposit box: " + cd.getValue().getSafetyDepBox());
					System.out.println("Safety deposit box access code: " + cd.getValue().getAccessCode());
					System.out.println("Interest rate: " + cd.getValue().getInterestRate());
				}
				else {
					System.out.println("Debit card number: " + cd.getValue().getDebitCard());
					System.out.println("PIN: " + cd.getValue().getPIN());
					System.out.println("Interest rate: " + cd.getValue().getInterestRate());
				}
			}
		}
	}
}