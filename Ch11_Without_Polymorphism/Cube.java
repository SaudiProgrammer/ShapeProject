package Ch11_Without_Polymorphism;

public class Cube extends Rectangle{
	private double height;
	
	public Cube(double W , double L) {
		super(W,L);
		setName("Cube");
	}
	
	public double getHeight() {return height;}
	public void setHeight(double h) {this.height = h;}

	public double getVolume() {return getArea()* height;}
}
