

public class Circle {
	private float radius;
	
	public Circle(float radius){
		if(radius < 0){
			throw new IllegalArgumentException();
		}
		this.radius = radius;
	}
	
	public float getRadius(){
		return radius;
	}
	public float getPerimeter(){
		return (float)((2f * radius) * Math.PI);
	}
	public float getArea(){
		return (float)(radius * radius * Math.PI);
	}
}
