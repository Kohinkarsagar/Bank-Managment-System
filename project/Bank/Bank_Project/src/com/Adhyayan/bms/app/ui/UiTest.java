package com.Adhyayan.bms.app.ui;


import java.util.Scanner;

import com.Adhyayan.bms.app.service.Hdfc;
import com.Adhyayan.bms.app.service.Rbi;;

public class UiTest {
	
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	Rbi r=new Hdfc();
	while(true) {
		System.out.println("Welcome To Bank Management System\n Option");
		System.out.println("1.Create your Account\n2.Display your Details\n3.Update Details\n4.Deposite  your Money\n5.Withdrawl your Balance\n6.Check your Balance");
		System.out.println("What is your choice?");
		int ch=s.nextInt();
		switch(ch) {
		case 1:
			r.createAccount();
			break;
			
		case 2:
			r.displayAllDetails();
			break;
			
		case 3:
			r.updateDetails();
			break;
			
		case 4:
			r.depositeMoney();
			break;
		
		case 5:
			r.withdrawal();
			break;
			
		case 6:
			r.balanceCheck();
			break;
			
			
		
		default:
			System.out.println("Wrong Choice ");
			
		}
	}
	
	

}
}



	
	
	
		
	

