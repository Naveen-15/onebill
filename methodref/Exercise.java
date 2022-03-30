package com.tyss.methodref;

public class Exercise {
	public void chat() {
		System.out.println("this is from chat method");
	}
	public  static void message() {
		System.out.println("this is from message method");
	}
public static void main(String[] args) {
	Exercise exercise = new Exercise();
	Test t= exercise::chat;
	t.message();
	Test t1= Exercise::message;
	t1.message();
}
}
