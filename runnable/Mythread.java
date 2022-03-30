package com.tyss.runnable;

import java.util.ArrayList;

public class Mythread extends ArrayList<Integer> implements Runnable{
 public void run() {
	 for(int i=0;i<10;i++) {
		 System.out.println(i);
	 }
 }
}
