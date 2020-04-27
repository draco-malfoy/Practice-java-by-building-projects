package com.BankApplication;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class BankApp {
	public static void main(String []args) throws IOException{	
		//imports new customers to database
		ImportData id = new ImportData();
		
		List<CustomerDetail> list = id.importData();
		
		HashMap<CustomerDetail, Account> hmap = new HashMap<>();
		
		for(CustomerDetail cd :list)
			if(cd.getAccountType().equalsIgnoreCase("Savings")) {
//				Savings s = new Savings();
				hmap.put(cd, new Savings());
			}
			else {
//				Checking c = new Checking();
				hmap.put(cd, new Checking());
			}

		System.out.print("Enter customer name to see details: ");
		Scanner sc = new Scanner(System.in);
		Account.showInfo(hmap,sc.nextLine());
		sc.close();
	}
}