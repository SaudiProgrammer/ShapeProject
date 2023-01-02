package Ch13_Interface;

public class Cube extends Rectangle implements SolidShape{
	private double height;
	
	public Cube(double W , double L, double h) {
		super(W,L);
		setName("Cube");
		setHeight(h);
	}
	
	public double getHeight() {return height;}
	public void setHeight(double h) {this.height = h;}

	public double getVolume() {return getArea()* height;}
	public String getVolumeS() {
		return super.getAreaS() + "\nThe volume of the Cube is "+
			   getVolume();
	}
}
