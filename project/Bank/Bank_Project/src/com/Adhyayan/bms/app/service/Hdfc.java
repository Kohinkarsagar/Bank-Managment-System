package com.Adhyayan.bms.app.service;

import java.util.Scanner;

import com.Adhyayan.bms.app.model.Account;

public class Hdfc implements Rbi {
	Account a= new Account();
	Scanner s=new Scanner(System.in);
			

	@Override
	public void createAccount() {
		System.out.println("Enter Account No:");
		a.setAccountNo(s.nextInt());
		
		System.out.println("Enter Name:");
		s.nextLine();
		a.setName(s.nextLine());
		
		System.out.println("Enter Mobile No:");
		a.setMobileNo(s.nextLong());
		
		System.out.println("Enter Adhar No:");
		a.setAdharNo(s.nextLong());
		
		System.out.println("Gender:");
		a.setGender(s.next());
		
		System.out.println("Enter your age:");
		a.setAge(s.nextInt());
		
		System.out.println("Enter your Balance:");
		a.setBalance(s.nextDouble());
		
		System.out.println("Enter Date of Birth:");
		s.nextLine();
		a.setDateOfBirth(s.nextLine());
		
		
		
	}

	@Override
	public void displayAllDetails() {
		System.out.println("Enter Account No:"+a.getAccountNo());
		System.out.println("Enter Name:"+a.getName());
		System.out.println("Enter Mobile No:"+a.getMobileNo());
		System.out.println("Enter Adhar No:"+a.getAdharNo());
		System.out.println("Gender:"+a.getGender());
		System.out.println("Enter your Age:"+a.getAge());
		System.out.println("Enter your Balance:"+a.getBalance());
		System.out.println("Enter Date Of Birth:"+a.getDateOfBirth());
	
	}
	public void updateDetails() {
	    System.out.println("1.Update Account No\n2.Update Name\n3.Update Mobile No\n4.Update Adhar No\n5.Update Gender\n6.Update Age\n7.Update Balance\n8.Date Of Birth");
	    System.out.println("What you want to update?\nEnter choice");
	    int ch=s.nextInt();
	    switch(ch) {
	    
	    case 1:
	    	System.out.println("Enter Account No:");
	    	a.setAccountNo(s.nextInt());
	    	break;
	   
	    case 2:
	    	System.out.println("Enter Name:");
	    	s.nextLine();
	    	a.setName(s.nextLine());
	    	break;
	    	
	    case 3:
	    	System.out.println("Enter Mobile No:");
	    	a.setMobileNo(s.nextLong());
	    	break;
	    	
	    case 4:
	    	System.out.println("Enter Adhar No:");
	    	a.setAdharNo(s.nextLong());
	    	break;
	    	
	    case 5:
	    	System.out.println("Gender:");
	    	s.nextLine();
	    	a.setGender(s.nextLine());
	    	break;
	    	
	    case 6:
	    	System.out.println("Enter your Age:");
	    	a.setAge(s.nextInt());
	    	break;
	    	
	    case 7:
	    	System.out.println("Enter your Balance:");
	    	a.setBalance(s.nextDouble());
	    	
	    	break;
	    	
	    case 8:
	    	System.out.println("Enter Date Of Birth");
	    	
	    	a.setDateOfBirth(s.nextLine());
	    	
	    default:
	    	System.out.println("Wrong Choice");
	    	
	    }
	}

	@Override
	public void depositeMoney() {
		System.out.println("Enter your Deposite Money:");
		double d=s.nextDouble();
		double s=a.getBalance()+d;
		a.setBalance(s);
		
		}
		
		

	@Override
	public void withdrawal() {
		System.out.println("Enter a Withdrawal Balance:");
		 int w=s.nextInt();
		 double d=a.getBalance()-w;
		 a.setBalance(d);
	   
	 	}

	@Override
	public void balanceCheck() {
		System.out.println(a.getBalance());
		
	}

}
