package decision;

public class store {
	public static void main(String [] args) {
	phone ph = new phone();
	ph.price=2000;
	ph.ram=4;
	ph.brand="nokia";
	
	ph.call("naveen");
	ph.radio(" minnalae");
	ph.message("hii");
	System.out.println("===============");
	smartphone phs =new smartphone();
	phs.price = 100000;
	phs.brand = "iphone";
	phs.camera = 12;
	phs.ram = 4;
	phs.call("harish");
	phs.play("pubg");
	phs.selfi(" harish");
	}
}
