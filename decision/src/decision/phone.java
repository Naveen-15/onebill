package decision;

public class phone{
int price;
int ram;
String brand;
public phone() {
	
}
public phone(int p,int r) {
	price =p;
	ram= r;
}
public void call(String name) {
	System.out.println("Calling "+ name);
}
public void radio(String song) {
	System.out.println("playing"+ song);
}
public void message( String msg) {
	System.out.println(msg);
}

}
