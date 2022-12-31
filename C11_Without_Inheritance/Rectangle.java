package C11_Without_Inheritance;

public class Rectangle {
	private double W,L;
	
	private Coordinates coordinates;
	
	public Rectangle(double W , double L , Coordinates coordinates){
		setW(W);
		setL(L);
		this.coordinates = coordinates;
	}
	
	public Rectangle(double W , double L , int x , int y){
		this(W , L , new Coordinates(x,y));
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
	
	public String getShapeLocation() {
		return coordinates.getLocation();
	}
}
