package Ch10_Aggregation;

public class Coordinates {
	private int x,y;
	
	public Coordinates(int x, int y) {
		this.x = x; this.y = y;
	}
	
	public int getX() {return x;}
	public void setX(int x) {this.x = x;}

	public int getY() {return y;}
	public void setY(int y) {this.y = y;}

	public String getLocation() {
		if(x >= 0) {
			if(y >= 0) {
				return "NE";
			}else {
				return "SE";
			}
		}else {
			if(y >= 0) {
				return "NW";
			}else {
				return "SW";
			}
		}
	}
}
