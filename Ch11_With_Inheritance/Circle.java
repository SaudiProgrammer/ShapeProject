package Ch11_With_Inheritance;

//Aggregated Class
public class Circle extends Shape {
	private double radius;
	
	public Circle(double r, Coordinates coordinates){
		super("Circle",coordinates);
		setRadius(r);
	}
	
	public Circle(double r,int x, int y){
		this(r, new Coordinates(x,y));
	}
	
	public Circle(){
		this(1,0,0);
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * getRadius() * getRadius();
	}
}
