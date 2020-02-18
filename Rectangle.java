public class Rectangle extends Shape {
	
	double width = 0;
	double height = 0;
	
	Rectangle(ShapeDescription description) {
		super(description);
		width = description.getDoubles().get(0);
		height = description.getDoubles().get(1);
	}
	
	public double getArea() {
		return (width*height);
	}
	
	public double getPerimeter() {
		return (width*2) + (height*2);
	}
	
}