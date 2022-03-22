package overriding;

public class Test1 extends Test {
public void message() {
	System.out.println("Received by user");
}
public int add (int x,int y) {
	super.add(x, y);
	System.out.println(x+y+10);
	return x+y+10;
}
}
