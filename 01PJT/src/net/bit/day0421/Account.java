package net.bit.day0421;

public class Account {
	private String accNo;
	private int  balance;
	int saveMoney;
	int depositMoney;
	
	public Account(){		
	}
	public Account(String accNo){
		this.accNo = accNo;
	}
	
	public int save(int saveMoney){
		this.saveMoney = saveMoney;
		this.balance += saveMoney;
		return balance;
	}
	public int deposit(int depositMoney){
		this.depositMoney = depositMoney;
		this.balance -= depositMoney;
		return balance;
	}
	public int getBalance(){
		return balance;		
	}
	public String getAccNo(){
		return accNo;
	}
	

}
