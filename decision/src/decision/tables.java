package decision;
import java.util.Scanner;

public class tables {
	public static void main(String[] args) {
		Scanner scr= new Scanner(System.in);
		System.out.println("give the number");
		int a =scr.nextInt();
		for(int i=1;i<10;i++) {
			System.out.println(i+" * "+ a + "="+ i*a);
		}
		
		
	}

}
