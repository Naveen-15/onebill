package com.tyss.conflictthread;

public class Wife extends Thread {
 
	Account account;

	public Wife(Account account) {
	
		this.account = account;
	}
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++) {
			account.withdraw(100);
		}
	}
}
