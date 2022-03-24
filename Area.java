package assie;

public class Area extends Shape {
	void rectanglearea(int x,int y) {
		System.out.println("area of rectangle is "+ x*y);
	}
	void squarearea(int x) {
		System.out.println("area of square is "+ x*x);
	}
	void circlearea(int x) {
		System.out.println("area of circle is "+ 3.14*x*x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area a =new Area();
		a.rectanglearea(10, 10);
		a.squarearea(10);
		a.circlearea(10);
	

}
}
