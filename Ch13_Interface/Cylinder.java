package Ch13_Interface;

public class Cylinder extends Circle implements SolidShape{
	private double height;
	
	public Cylinder(double r, double h) {
		super(r);
		setName("Cylinder");
		setHeight(h);
	}
	
	public double getHeight() {return height;}
	public void setHeight(double h) {this.height = h;}

	public double getVolume() {return getArea()* height;}
	public String getVolumeS() {
		return super.getAreaS() + "\nThe volume of the Cylinder is "+
			   getVolume();
	}
}
