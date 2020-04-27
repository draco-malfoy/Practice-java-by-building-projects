package com.BankApplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ImportData {
	static int unique = 10000;
	public List<CustomerDetail> importData() throws IOException {
		BufferedReader input = new BufferedReader(new FileReader("NewBankAccounts.csv"));
		CustomerDetail cd;
		String row;
		long accNumber;
		int firstBit, lastSSN;
		
		List<CustomerDetail> list = new ArrayList<>();
		
		while((row = input.readLine()) != null) {
			String []data = row.split(",");
			if(data[2].equalsIgnoreCase("Savings"))
				firstBit = 1;
			else
				firstBit = 2;
			
			lastSSN = Integer.parseInt(data[1])%100;
			accNumber = genAccountNumber(firstBit, lastSSN, unique++);
			
			cd = new CustomerDetail();
			cd.setName(data[0]);
			cd.setSsn(Integer.parseInt(data[1]));
			cd.setAccountType(data[2]);
			cd.setInitialDeposit(Integer.parseInt(data[3]));
			cd.setAccountNumber(accNumber);
			
			list.add(cd);
		}
		input.close();
		return list;
	}
	
	//beware of the suffix 'L', I messed it, and spent hours debugging
	public long genAccountNumber(int first, int last, int unique) {
		int rand = (int)(Math.random()*1000)+ (int)(Math.random()*10) ;
		return ((((first*100)+last)*100000)+unique)*1000L+rand;
	}
}