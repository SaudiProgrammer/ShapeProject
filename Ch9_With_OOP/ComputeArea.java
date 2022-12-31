package Ch2_Without_OOP;

public class ComputeArea {
	  public static void main(String[] args) {
	    double radius;
	    double area;
	    
	    radius = 20;
	    
	    area = radius * radius * Math.PI;
	    
	    System.out.println(
	    		"The area for the circle of radius " +
	    		radius + " is " + area);
	  }
}
