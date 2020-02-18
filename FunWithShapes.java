public class FunWithShapes extends ShapeHandler {

	FunWithShapes() throws ShapeException {
		super();
	}
	
	public void convertDescriptionsToShapes() {
		for(int i=0; i<shapeDescriptions.size(); i++) {
			switch(shapeDescriptions.get(i).getShapeType()) {
				case CIRCLE:
					shapes.add(new Circle(shapeDescriptions.get(i)));
					break;
				case SQUARE:
					shapes.add(new Square(shapeDescriptions.get(i)));
					break;
				case RECTANGLE:
					shapes.add(new Rectangle(shapeDescriptions.get(i)));
					break;
				case TRIANGLE:
					shapes.add(new Triangle(shapeDescriptions.get(i)));
					break;
			}
			
		}
			
	}
	
	public double sumOverAreas() {
		double totalArea = 0;
		for (int i = 0; i<shapes.size(); i++) {
			totalArea += shapes.get(i).getArea();
		}
			
		return totalArea;
	}

	public double sumOverPerimeters() {
		double totalPerimeter = 0;
		for (int i = 0; i<shapes.size(); i++) {
			totalPerimeter += shapes.get(i).getPerimeter();
		}
			
		return totalPerimeter;
	}

	public static void main(String Args[]) throws ShapeException {
		
		FunWithShapes test = new FunWithShapes();
		double sumA = test.sumOverAreas();
		double sumP = test.sumOverPerimeters();
		
		System.out.println(sumA);
		System.out.println(sumP);
		
	}
}