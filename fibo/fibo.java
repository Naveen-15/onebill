package com.tyss.fibo;
import java.util.Scanner;
public class fibo {
	public static void  fibonacci(int x) {
		int n1=-1;
		int n2 =1;
		for(int i=0;i<x;i++) {
			
			int sum=n1+n2;
			System.out.print(sum+ " ");
			n1=n2;
			n2=sum;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		
		System.out.println("give the number ");
		Scanner sc= new Scanner(System.in);
		n = sc.nextInt();
		fibo.fibonacci(n);
		
	}

}
