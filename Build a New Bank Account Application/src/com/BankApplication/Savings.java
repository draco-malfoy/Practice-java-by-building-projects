package com.BankApplication;

import java.util.Random;

public class Savings extends Account {
	private int safetyDepBox;
	private int accessCode;
	private double interestRate = BaseRate.base + 0.25;
	
	public Savings() {
		genSafetyDepBox();
		genAccessCode();
	}

	public int getSafetyDepBox() {
		return safetyDepBox;
	}

	public int getAccessCode() {
		return accessCode;
	}

	public double getInterestRate() {
		return interestRate;
	}

	private void genSafetyDepBox() {
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 3; i++)
			sb.append(rand.nextInt(10));
		safetyDepBox = Integer.parseInt(sb.toString());
	}
	
	private void genAccessCode() {
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 4; i++)
			sb.append(rand.nextInt(10));
		accessCode = Integer.parseInt(sb.toString());
	}	
	
	public void setAccessCode(int accessCode) {
		this.accessCode = accessCode;
	}

	@Override
	public long getDebitCard() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPIN() {
		// TODO Auto-generated method stub
		return 0;
	}
}