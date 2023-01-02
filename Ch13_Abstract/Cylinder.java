package Ch13_Abstract;

public class Cylinder extends Circle{
	private double height;
	
	public Cylinder(double r, double h) {
		super(r);
		setName("Cylinder");
		setHeight(h);
	}
	
	public double getHeight() {return height;}
	public void setHeight(double h) {this.height = h;}

	public double getVolume() {return getArea()* height;}
}
