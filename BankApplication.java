package com.ibm.training.oopsprograms;

import java.util.Scanner;

interface Account{
	public int deposit(int amount);
	public int withdraw(int amount); 
}

class SavingsAccount implements Account{
	int amount;
	int balance=10000;
	@Override
	public int deposit(int amount) {
		if(amount>=1000) {
		balance+=amount;
		System.out.println("Amount deposited"+amount);
		System.out.println("balance is "+balance);
		}
		else {
			System.out.println("less than 1000 cannot be deposited");
		}
		return balance;
	}

	@Override
	public int withdraw(int amount) {
		if(amount>0 && amount<(balance-1000)&& (amount%100==0)) {
			balance-=amount;
			System.out.println("After withdrawal balance is"+balance);
		}else {
			System.out.println("amount cannot withdrawn");
		}
		return balance;
	}
	
}
class CurrentAccount implements Account{
	int amount;
	int balance=0;
	@Override
	public int deposit(int amount) {
		if(amount>=5000) {
		balance+=amount;
		System.out.println("Amount deposited"+amount);
		System.out.println("balance is "+balance);
		}
		else {
			System.out.println("less than 5000 cannot be deposited");
		}
		return balance;
	}

	@Override
	public int withdraw(int amount) {
		if(amount>0 || amount<=(balance-5000)) {
			balance-=amount;
			System.out.println("After withdrawal balance is"+balance);
			
		}else {
			System.out.println("amount cannot withdrawn");
		}
		return balance;
	}
	
	
}

public class BankApplication {

	public static void main(String[] args) {
		SavingsAccount saccount1=new SavingsAccount();
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("enter the choice do you want "
				+ "\n1.withdraw "
				+ "\n2.deposit"
				+"\n3. exit");
		int choice=sc.nextInt();
		int amount;
		switch(choice) {
		case 1:
			System.out.println("enter amount to withdraw");
			 amount=sc.nextInt();
			
			saccount1.withdraw(amount);
			break;
		case 2:
			System.out.println("enter amount to deposit");
			 amount=sc.nextInt();
			saccount1.deposit(amount);
			break;
		
		case 3:
			System.exit(0);
		}
		}while(true);
		
	}

}
