package decision;

public class method {
static void add(float x,float y){
	System.out.println(x+y);
}
//different numbers of arguments
static void add(float x,float y, float z)
{
	System.out.println(x+y+z);
}
//diff type of argument
static void add( double x, double y) {
	System.out.println(x+y);
}
//sequence of arg
static void add(int x,double y)
{
	System.out.println(x+y);
}
//static float add(float x,float y) {
//	return(x+y);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method.add(2.2f,2.2f,2.2f);
		float sum=method.add(2.2f, 2.2f);
		//System.out.println(ans);

	}

}
