package Ch13_Abstract;

public class Pyramid extends Triangle {
	private double height;
	
	public Pyramid(double baseW , double baseL, double h) {
		super(baseW,baseL);
		setName("Pyramid");
		setHeight(h);
	}
	
	public double getHeight() {return height;}
	public void setHeight(double h) {this.height = h;}

	public double getVolume() {return getHeight()* getBase()* height / 3;}
}
