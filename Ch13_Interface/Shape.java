package Ch13_Abstract;

public abstract class Shape {
	private String name;
	private Coordinates coordinates;
	
	public Shape(String name, Coordinates coordinates) {
		this.name = name;
		this.coordinates = coordinates;
	}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public Coordinates getCoordinates() {return coordinates;}
	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}
	
	public int[] getCoordinatesXY() {
		return new int[]{coordinates.getX(),coordinates.getY()};
	}
	public void setCoordinatesXY(int x, int y) {
		coordinates.setX(x);
		coordinates.setY(y);
	}

	public String getShapeLocation() {
		return "The "+ name +" is located in the "+
				coordinates.getLocation();
	}
	
	public double getArea() {
		return 0;
	}
	
	public abstract String getAreaS();
}
