package Ch13_Interface;

public class Pyramid extends Triangle implements SolidShape{
	private double height;
	
	public Pyramid(double baseW , double baseL, double h) {
		super(baseW,baseL);
		setName("Pyramid");
		setHeight(h);
	}
	
	public double getHeight() {return height;}
	public void setHeight(double h) {this.height = h;}

	public double getVolume() {return getHeight()* getBase()* height / 3;}
	public String getVolumeS() {
		return super.getAreaS() + "\nThe volume of the Pyramid is "+
			   getVolume();
	}
}
