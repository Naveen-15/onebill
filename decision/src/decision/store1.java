package decision;

public class store1 {
	public static void main(String[] args) {
		phone phone = new phone(12000,4);
		
		System.out.println(phone.price);
		smartphone s =new smartphone(100000,4);
		System.out.println(s.price+ s.ram);
		smartphone s2=new smartphone(10);
		System.out.println(s2.camera);
	}

}
