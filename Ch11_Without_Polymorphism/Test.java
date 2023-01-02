package Ch11_With_Inheritance;

public class Test {
	public static void main(String[] args) {
		Circle x = new Circle(20,1,1);

	    System.out.println(
	    		"The area for the circle of radius " +
	    		x.getRadius() + " is " + x.getArea());
	    System.out.println("The circle is located in the "+
	    		x.getShapeLocation());
	    
	    System.out.println("===========================================");
	    
	    Rectangle y = new Rectangle(10,10,-1,-1);

	    System.out.println(
	    		"The area for the rectangle of width " +
	    		y.getW() + " and length " + y.getL() +
	    		" is " + y.getArea());
	    System.out.println("The rectangle is located in the "+
	    		y.getShapeLocation());
	    
	    System.out.println("===========================================");
	    
	}
}
