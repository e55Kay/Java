package com.comcast.inheritance;

class BankAccount {
	
	double withdrawAmount, depositAmount, balance;
	double interestRate = 9.5;
	
	public void depositMoney() {
		balance = depositAmount + balance;
		System.out.println("Deposit Amount: "+ depositAmount);
	}
	
	public void withdrawMoney() {
		balance = balance - withdrawAmount;
		System.out.println("Withdrawal Amount: "+ withdrawAmount);
	}
	
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}
	
}

class NRIAccount extends BankAccount {
	
	void applyFixedDeposit() {
		super.interestRate = 6.5;
		System.out.println("Interest rate for NRI Account: " + interestRate);
	}
	
}

class SeniorCitizen extends BankAccount {
	void applyFixedDeposit() {
		super.interestRate = 10.5;
		System.out.println("Interest rate for Senior Citizen Account: "+ interestRate);
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		NRIAccount nriAcc = new NRIAccount();
		SeniorCitizen senior = new SeniorCitizen();
		
		nriAcc.depositAmount = 30;
		nriAcc.withdrawAmount = 20;
		
		nriAcc.depositMoney();
		nriAcc.withdrawMoney();
		nriAcc.applyFixedDeposit();
		nriAcc.showBalance();
		
		System.out.println("");
		
		senior.depositAmount = 50;
		senior.withdrawAmount = 30;
		
		senior.depositMoney();
		senior.withdrawMoney();
		senior.applyFixedDeposit();
		senior.showBalance();
		

	}

}
