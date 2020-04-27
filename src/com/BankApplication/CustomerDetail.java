package com.BankApplication;

public class CustomerDetail {
	private String name;
	private int ssn;
	private String accountType;
	private int initialDeposit;
	private long accountNumber;
	
	public CustomerDetail() {
		
	}

	public CustomerDetail(String name, int ssn, String accountType, int initialDeposit, int accountNumber) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.accountType = accountType;
		this.initialDeposit = initialDeposit;
		this.accountNumber = accountNumber;
	}
	
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	
	public String getName() {
		return name;
	}

	public int getSsn() {
		return ssn;
	}

	public int getInitialDeposit() {
		return initialDeposit;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void setInitialDeposit(int initialDeposit) {
		this.initialDeposit = initialDeposit;
	}
}