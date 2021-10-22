package com.junittesting3;

class InsufficientFundsException extends RuntimeException{

		private static final long serialVersionUID = 1L;
		
	}

public class BankAccount {
	
long balance;
	
	public BankAccount(long balance) {
		super();
		this.balance = balance;
	}


	public void withdraw(long amount) {
		if(amount>balance)
			throw new InsufficientFundsException();
		else
			balance-=amount;
	}

}