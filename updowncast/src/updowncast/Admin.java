package updowncast;

public class Admin extends User{
	public Admin( String name,long number) {
		super(name,number);
	//	System.out.println("from admin cons");
	}
	public Admin() {
		
	}
	public void adduser(String username) {
		System.out.println(username+ " is added");
	}
	public void removeuser(String username) {
		System.out.println(username + " is removed");
	}
}
