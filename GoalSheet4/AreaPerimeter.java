/*
 Jackson Frank
 Class: AreaPerimeter.java
 Purpose: To use other classes in order to calculate area and perimeter of circles and 
 		  squares
 */

import java.util.*;

public class AreaPerimeter {

	public static void main(String[] args) {
		System.out.println("Area and Perimeter!");
		System.out.println();
		
		float radius, length, width;
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("Radius of circle: ");
		radius = console.nextFloat();
		System.out.print("Length of rectangle: ");
		length = console.nextFloat();
		System.out.print("Width of rectangle: ");
		width = console.nextFloat();
		console.close();
		
		Circle c1 = new Circle(radius);
		Rectangle r1 = new Rectangle(length, width);
		
		System.out.println("Perimeter of Circle: " + c1.getPerimeter());
		System.out.println("Area of Circle: " + c1.getArea());
		System.out.println("Perimeter of Rectangle: " + r1.getPerimeter());
		System.out.println("Area of Rectangle: " + r1.getArea());
	}

}
