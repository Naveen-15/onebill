package updowncast;

public class Group {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u =new Admin("naveen",5943615247l);
		u.chat();
		Admin a= (Admin)u;
		a.adduser("harish");
		a.chat();
		
	}

}
