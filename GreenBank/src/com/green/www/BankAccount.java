package com.green.www;

public class BankAccount {
	public int accountNumber;
	public String owner;
	public int balance;
	
	public void deposit(int amount) {
		balance += amount;
	}
	
	public void withdraw(int amount) {
		balance -= amount;
	}
	@Override
	public String toString() {
		return "현재 잔액은 " + balance + "입니다.";
	}
}
