package inheritance;

import java.util.Scanner;

public class Circle extends Base {
	
	double radius = 0;
	
	Circle(String name) {
		super(name);
	}
	
	
	public void inputData() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반지름을 입력해주세요.");
		String inputText = sc.nextLine();
		this.radius = Double.parseDouble(inputText);
	}
	
	public void calcArea() {
		areaSize = Math.PI * radius * radius;
	}
	
}
