package exercise_24_abstract;

public class Circle extends Shape {

	private Double radius;

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public Double area() {
		return Math.PI * radius * radius;
	}
	
}
