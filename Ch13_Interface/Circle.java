package Ch13_Interface;

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
	
	public Circle(double r){
		this(r,0,0);
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
	
	public String getAreaS() {
		return  "The area for the circle of radius " +
	    		getRadius() + " is " + getArea();
	}
}
