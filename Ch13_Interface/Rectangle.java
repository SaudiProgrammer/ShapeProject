package Ch13_Interface;

public class Rectangle extends Shape {
	private double W,L;
		
	public Rectangle(double W , double L , Coordinates coordinates){
		super("Rectangle",coordinates);
		setW(W);
		setL(L);
	}
	
	public Rectangle(double W , double L , int x , int y){
		this(W , L , new Coordinates(x,y));
	}
	
	public Rectangle(double W , double L){
		this(W,L,0,0);
	}
	
	public Rectangle(){
		this(1,1,0,0);
	}
	
	public double getW() {return W;}
	public void setW(double w) {W = w;}

	public double getL() {return L;}
	public void setL(double l) {L = l;}

	public double getArea() {
		return L * W;
	}
	
	public String getAreaS() {
		return  "The area for the rectangle of width " +
	    		getW() + " and length " + getL() + " is " + getArea();
	}
}
