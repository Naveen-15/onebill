package com.tyss.conflictthread;

public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account =new Account(100000);
		Husband husband = new Husband(account);
		Wife wife=new Wife(account);
		husband.start();
		wife.start();
		try {
			Thread.sleep(1000);
			account.getBalance();
		}catch(InterruptedException e) {}
		
	}

}
