package Ch13_Interface;

import java.util.ArrayList;

public class TestV4 {
	public static void main(String[] args) {
		ArrayList<SolidShape> ShapesObjs = new ArrayList<SolidShape>();
		ShapesObjs.add(new Cylinder(20,5));
		ShapesObjs.add(new Cube(10,10,5));
		ShapesObjs.add(new Pyramid(10,10,5));
		
		for(SolidShape x : ShapesObjs) {
			System.out.println(x.getVolumeS());
			System.out.println(x.getShapeLocation());
			System.out.println("===========================================");
		}
	}
}
