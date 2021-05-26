package inheritance;

public class Exec {
	public static void main(String[] args) {
		Triangle triangle = new Triangle("삼각형");
		Rectangle rectangle = new Rectangle("사각형");
		Circle circle = new Circle("원");

		triangle.inputData();
		triangle.printSize();
		
		rectangle.inputData();
		rectangle.printSize();
		
		circle.inputData();
		circle.printSize();
	}
}
