package overriding;

public class Test {
public void message() {
	System.out.println("this is sent");
}
public int add(int x,int y) {
	System.out.println(x+y);
	return x+y;
}
}
