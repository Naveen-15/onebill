package assignment;
import java.util.Scanner;
public class oddeven1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr =new Scanner(System.in);
		System.out.println("give the number");
		int a= scr.nextInt();
		System.out.println("odd"+" "+" even");
		for(int i=1;i<=a;i++) {
			if(i%2!=0) {
				System.out.print(i);
			}
			else {
				System.out.println("      "+i);
			}
		}
		scr=null;
		

	}

}

