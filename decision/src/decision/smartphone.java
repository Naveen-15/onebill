package decision;

public class smartphone extends phone {

 static int camera;
public smartphone(int p,int r) {
	super(p,r);
	System.out.println("superconstructor");
}
public smartphone(int c) {
	camera=c;
}
public void selfi(String name) {
	System.out.println("selfie with"+ name);
}
public void play(String gamename) {
	System.out.println("playing"+ gamename);
}
}
