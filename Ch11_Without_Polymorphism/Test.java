package Ch11_Without_Polymorphism;

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
	    
	    Triangle z = new Triangle(10,10,1,-1);

	    System.out.println(
	    		"The area for the triangle of base " +
	    		z.getBase() + " and height " + z.getHeight() +
	    		" is " + z.getArea());
	    System.out.println("The triangle is located in the "+
	    		z.getShapeLocation());
	    
	    System.out.println("===========================================");
	    
	}
}
