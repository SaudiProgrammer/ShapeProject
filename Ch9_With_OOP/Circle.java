package Ch9_With_OOP;

public class Circle {
	private double radius;
	
	public Circle(double r){
		setRadius(r);
	}
	
	public Circle(){
		this(1);
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
