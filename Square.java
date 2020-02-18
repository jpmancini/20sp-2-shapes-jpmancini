public class Square extends Shape {
	
	double sidelen = 0;
	
	Square(ShapeDescription description) {
		super(description);
		sidelen = description.getDoubles().get(0);
	}
	
	public double getArea() {
		return (sidelen*sidelen);
	}
	
	public double getPerimeter() {
		return sidelen*4;
	}
	
}