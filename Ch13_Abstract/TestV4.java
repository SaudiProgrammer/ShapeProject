package Ch13_Abstract;

import java.util.ArrayList;

public class TestV4 {
	public static void main(String[] args) {
		ArrayList<Shape> ShapesObjs = new ArrayList<Shape>();
		ShapesObjs.add(new Cylinder(20,5));
		ShapesObjs.add(new Cube(10,10,5));
		ShapesObjs.add(new Pyramid(10,10,5));
		
		for(Shape x : ShapesObjs) {
			System.out.println(x.getAreaS());
			System.out.println(x.getShapeLocation());
			System.out.println("===========================================");
		}
	}
}
