package Ch11_Without_Polymorphism;

public class Pyramid extends Triangle {
	private double height;
	
	public Pyramid(double baseW , double baseL) {
		super(baseW,baseL);
		setName("Pyramid");
	}
	
	public double getHeight() {return height;}
	public void setHeight(double h) {this.height = h;}

	public double getVolume() {return getHeight()* getBase()* height / 3;}
}
