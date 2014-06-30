package net.bit.day0421;

public class TestAccount {

	public static void main(String[] args) throws Exception {
		
		String accNo = null;
		int balance = 0;
		
		Account accObj = new Account("078-3762-293");
		accNo = accObj.getAccNo();
		balance = accObj.getBalance();
		System.out.println(accNo + " 계좌가 개설되었습니다.");
		System.out.println(accNo + " 계좌의 잔고는 " + balance + "만원입니다.");
		
		accObj.save(100);
		balance = accObj.getBalance();
		System.out.println(accObj.getAccNo()+ "계좌에" + accObj.saveMoney + "만원 입금되었습니다.");
		System.out.println(accObj.getAccNo()+ "계좌의 잔고는" + balance + "만원입니다.");
		
		accObj.deposit(30);
		balance = accObj.getBalance();
		System.out.println(accObj.getAccNo()+ "계좌에" + accObj.depositMoney + "만원 출금되었습니다.");
		System.out.println(accNo + "계좌의 잔고는" + balance + "만원입니다.");

	}

}
