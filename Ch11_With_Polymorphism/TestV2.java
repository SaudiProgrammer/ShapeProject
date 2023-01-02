package Ch11_With_Polymorphism;

public class TestV2 {
	public static void main(String[] args) {		
		Shape x = new Circle(20,1,1);

	    System.out.println(x.getAreaS());
	    System.out.println(x.getShapeLocation());
	    
	    System.out.println("===========================================");
	    
	    Shape y = new Rectangle(10,10,-1,-1);

	    System.out.println(y.getAreaS());
	    System.out.println(y.getShapeLocation());
	    
	    System.out.println("===========================================");
	    
	    Shape z = new Triangle(10,10,1,-1);

	    System.out.println(z.getAreaS());
	    System.out.println(z.getShapeLocation());
	    
	    System.out.println("===========================================");
	    
	}
}
