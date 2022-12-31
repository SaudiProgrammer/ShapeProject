package Ch10_Aggregation;

public class Test {
	public static void main(String[] args) {
		Circle x = new Circle(20,1,1);

	    System.out.println(
	    		"The area for the circle of radius " +
	    		x.getRadius() + " is " + x.getArea());
	    System.out.println("The circle is located in the "+
	    		x.getShapeLocation());
	    
	}
}
