package com.java.exception;

public class TestBankATM {
public static void main(String[] args) {
	BankATM b1=new BankATM(1010, "citi bank", "navi mumbai", 10000);
	BankATM b2=new BankATM(1010, "citi bank", "navi mumbai", 10000);
	BankATM b3=new BankATM(1010, "citi bank", "navi mumbai", 10000);
	try {
		b1.withdraw(400);
		b1.deposit(300);
	}catch(Exception e) {
		System.out.println("Exception occurred "+e);
	}
	try {
		b2.withdraw(700);
		b2.deposit(200);
	}catch(Exception e) {
		System.out.println("Exception occurred "+e);
	}
	try {
		b3.withdraw(12500);
		b3.deposit(500);
	}catch(Exception e) {
		System.out.println("Exception occurred "+e);
	}
}}
