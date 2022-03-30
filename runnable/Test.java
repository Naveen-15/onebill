package com.tyss.runnable;

public class Test {
public static void main(String[] args) {
	Mythread mythread = new Mythread();
	Thread thread = new Thread(mythread);
	thread.start();
}
}
