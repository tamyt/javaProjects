package emailapp;

import java.util.Scanner;

public class Email {
	private String name;//private for encapsulation
	private String lastName;
	private String department;
	private String company;
	private String password;
	private int mailBoxCapacity;
	private String alternateEmail;
	
	//Constructor to receive the first and last name
	public Email(String name,String lastName) {
		this.name = name;
		//this refers to the class variable
		//= name is the local variable
		//so we are passing the local variable to the class variable
		this.lastName = lastName; 
		System.out.println("Email created: "+this.name+" "+this.lastName);
		
		//call a method asking for the department-return the department
		this.department = setDepartment();
	}
	
	//Ask for the department
	private String setDepartment() {
		System.out.print("Enter the department\n1 for"
				+ " Sales\n2 for Development\n3 for accounting\n0 for none");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		if(deptChoice == 1) {return "sales";}
		else if(deptChoice == 2) {return "development";}
		else if (deptChoice == 3) {return "accounting";}
		else {return " ";}
	}
	
	//Generate a random password
	
	//Set the mailbox capacity
	
	//Set the alternate email
	
	//Change the password
}
