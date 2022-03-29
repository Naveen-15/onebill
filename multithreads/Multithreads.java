package com.tyss.multithreads;


public class Multithreads extends Thread{
	int max;
	
	public Multithreads(int max) {
		super();
		this.max = max;
	}
	@Override
	public void run() {
		try {
		while(max>0) {
			if(max%2==0) {
				System.out.println(max);				
				Thread.sleep(1000);				
			}
		max--;
		}
		}catch(Exception e) {
			
		}
	}
	

	public static void main(String[] args) {
		Multithreads exercise = new Multithreads(10);
		exercise.start();
		Multithreads exercise2 = new Multithreads(20);
		exercise2.start();
	}
}
