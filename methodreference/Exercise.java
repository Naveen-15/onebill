package com.tyss.methodreference;

public class Exercise {
	public void add(int a,int b) {
		System.out.println("addition");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise exercise = new Exercise();
		//exercise.add(10, 10);
		Testinterface t= exercise::add;
		t.add(10, 10);
	}

}
