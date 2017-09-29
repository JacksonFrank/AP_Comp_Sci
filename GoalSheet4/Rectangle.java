
public class Rectangle {
	private float length;
	private float width;
	
	public Rectangle(float length, float width){
		if(length < 0 || width < 0){
			throw new IllegalArgumentException();
		}
		this.length = length;
		this.width = width;
	}
	
	public float getLength(){
		return length;
	}
	public float getWidth(){
		return width;
	}
	public float getPerimeter(){
		return (2f * (length + width));
	}
	public float getArea(){
		return (length * width);
	}
}
