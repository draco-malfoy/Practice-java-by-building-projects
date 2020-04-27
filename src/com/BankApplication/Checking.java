package com.BankApplication;

import java.util.Random;

public class Checking extends Account {
	private long debitCard;
	private int PIN;
	private double interestRate = BaseRate.base * 0.15;
	
	public Checking() {
		genDebitcard();
		genPIN();
//		System.out.print("Interest rate: " + interestRate);
	}

	private void genDebitcard() {
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 12; i++)
			sb.append(rand.nextInt(10));
		debitCard = Long.parseLong(sb.toString());
//		System.out.print("Debit card number: " + debitCard);
	}
	
	private void genPIN() {
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 3; i++)
			sb.append(rand.nextInt(10));
		PIN = Integer.parseInt(sb.toString());
//		System.out.print("PIN: " + PIN);
	}	

	public long getDebitCard() {
		return debitCard;
	}

	public int getPIN() {
		return PIN;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setPIN(int PIN) {
		this.PIN = PIN;
	}

	@Override
	public int getSafetyDepBox() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getAccessCode() {
		// TODO Auto-generated method stub
		return 0;
	}	
}