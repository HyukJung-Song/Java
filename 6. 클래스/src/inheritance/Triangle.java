package inheritance;

import java.util.Scanner;

public class Triangle extends Base {
	
	double baseLine = 0;
	double height = 0;
	
	Triangle(String name) {
		super(name);
	}
	
	// 따로 할 메소드는 자식 클래스에
	public void inputData() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("밑변을 입력해주세요.");
		String inputText = sc.nextLine();
		this.baseLine = Double.parseDouble(inputText);
		System.out.println("높이를 입력해주세요.");
		inputText = sc.nextLine();
		this.height = Double.parseDouble(inputText);
	}
	
	public void calcArea() {
		this.areaSize = this.baseLine*this.height / 2.0;
	}
	
}
