package com.tyss.lambda;

public class Lambdaadd {
public static void main(String[] args) {
	Test a=(x,y)->{
		return x+y;
	};
	int sum=a.add(10, 10);
	System.out.println(sum);
	
}
}
