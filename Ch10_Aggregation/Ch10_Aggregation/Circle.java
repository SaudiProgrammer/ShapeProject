package Ch10_Aggregation;

//Aggregated Class
public class Circle {
	private double radius;
	private Coordinates coordinates;
	
	public Circle(double r, Coordinates coordinates){
		setRadius(r);
		this.coordinates = coordinates;
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
	
	public String getShapeLocation() {
		return coordinates.getLocation();
	}
}
