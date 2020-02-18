public class Circle extends Shape {
	
	double radius = 0;
	
	Circle(ShapeDescription description) {
		super(description);
		radius = description.getDoubles().get(0);
	}
	
	public double getArea() {
		return Math.PI * (radius*radius);
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
}