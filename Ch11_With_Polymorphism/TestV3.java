package Ch11_With_Polymorphism;

import java.util.ArrayList;

public class TestV3 {
	public static void main(String[] args) {
		ArrayList<Shape> ShapesObjs = new ArrayList<Shape>();
		ShapesObjs.add(new Circle(20,1,1));
		ShapesObjs.add(new Rectangle(10,10,-1,-1));
		ShapesObjs.add(new Triangle(10,10,1,-1));
		
		for(Shape x : ShapesObjs) {
			System.out.println(x.getAreaS());
			System.out.println(x.getShapeLocation());
			System.out.println("===========================================");
		}
	}
}
