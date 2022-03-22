package assignment;
import java.util.Scanner;

public class series {
public static void main() {
	Scanner sc = new Scanner(System.in);
	System.out.println("give the 3 numbers:");
	int a= sc.nextInt();
	int b= sc.nextInt();
	int c= sc.nextInt();
	int sum=0;
	for(int i=0;i<c;i++) {
		for(int j=0;j<c;j++) {
			sum+=(a+(2^i)*b);
		}
		
	}
}
}


