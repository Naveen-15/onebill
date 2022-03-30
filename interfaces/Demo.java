package com.tyss.interfaces;

public class Demo implements Interfaces,Interface1 {

	@Override
	public void message() {
		// TODO Auto-generated method stub
		//System.out.println("hello guys");
		Interface1.super.message();
	}
	

}
