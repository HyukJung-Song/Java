package class_;

import java.util.Scanner;

public class Trapezoid {
	
	int upperLine;
	int lowerLine;
	int height;
	double area;
	
	public void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("윗변의 길이: ");
		upperLine = sc.nextInt();
		System.out.print("아랫변의 길이: ");
		lowerLine = sc.nextInt();
		System.out.print("높이: ");
		height = sc.nextInt();
		System.out.println("입력 성공!\n");
	}
	
	public void calcArea() {
		area = (upperLine + lowerLine) * height / 2.0;
		System.out.println("사다리꼴의 넓이: " + area);
	}
	
}
