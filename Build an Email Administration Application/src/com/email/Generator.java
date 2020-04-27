package com.email;

import java.util.Scanner;

public class Generator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Email email = new Email();

		System.out.print("Enter firstname: ");
		email.setFirstName(sc.next());
		
		System.out.print("Enter lastname: ");
		email.setLastName(sc.next());
		
		System.out.print("Enter department(sales/developement/accounting): ");
		email.setDepartment(sc.next());
		
		System.out.print("Alternate mail address:");
		email.setAltMail(sc.next());

		System.out.println(email.getMailCapacity());
		System.out.println(email.getEmail());
		System.out.println(email.getName());
		System.out.println(email.getPassword());
		
		email.setMailCapacity(45);
		System.out.println(email.getMailCapacity());
		
		sc.close();
	}
}