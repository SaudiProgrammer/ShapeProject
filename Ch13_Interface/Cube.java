package Ch13_Abstract;

public class Cube extends Rectangle{
	private double height;
	
	public Cube(double W , double L, double h) {
		super(W,L);
		setName("Cube");
		setHeight(h);
	}
	
	public double getHeight() {return height;}
	public void setHeight(double h) {this.height = h;}

	public double getVolume() {return getArea()* height;}
}
