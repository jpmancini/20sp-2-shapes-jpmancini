public class Triangle extends Shape {
	
	double sideA = 0;
	double sideB = 0;
	double sideC = 0;
	
	Triangle(ShapeDescription description) {
		super(description);
		sideA = description.getDoubles().get(0);
		sideB = description.getDoubles().get(1);
		sideC = description.getDoubles().get(2);
	}
	
	public double getArea() {
		double semi = getPerimeter() / 2;
		return Math.sqrt(semi*(semi-sideA)*(semi-sideB)*(semi-sideC));
	}
	
	public double getPerimeter() {
		return sideA + sideB + sideC;
	}
	
}