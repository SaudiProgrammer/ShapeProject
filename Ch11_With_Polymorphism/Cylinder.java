package Ch11_With_Polymorphism;

public class Cylinder extends Circle{
	private double height;
	
	public Cylinder(double r) {
		super(r);
		setName("Cylinder");
	}
	
	public double getHeight() {return height;}
	public void setHeight(double h) {this.height = h;}

	public double getVolume() {return getArea()* height;}
}
