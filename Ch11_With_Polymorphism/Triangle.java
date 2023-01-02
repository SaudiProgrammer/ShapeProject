package Ch11_Without_Polymorphism;

public class Triangle extends Shape{
	private double height;
	public double base;
	
	public Triangle(double b, double h , Coordinates coordinates){
		super("Triangle",coordinates);
		setHeight(h);
		setBase(b);
	}
	public Triangle(double b, double h,int x, int y){
		this(b , h , new Coordinates(x,y));
	}
	
	public Triangle(double b, double h){
		this(b , h ,0,0);
	}
	
	public Triangle(){
		this(1,1,0,0);
	}
	
	public double getBase() {return base;}
	public void setBase(double b) {base = b;}

	public double getHeight() {return height;}
	public void setHeight(double h) {height = h;}

	public double getArea() {
		return 0.5 * height * base;
	}

}
