package class_1;
import java.util.Scanner; //박영선class

public class Para {
	
	int width = 0;
	int height = 0;
	int area = 0;
	
	//수치 입력 1.밑변 2.높이
	public void inputData() {
		Scanner scan = new Scanner(System.in);
		System.out.print("평행사변형 밑변의 길이: ");
		width = scan.nextInt();
		System.out.print("평행사변형 높이: ");
		height = scan.nextInt();
		System.out.println("평행사변형 밑변:" + width +" "+ "높이:" + height);
	}
	
	//넓이 계산 밑변x높이
	
	public void calcArea() {
		area = width * height;
		System.out.println("평행사변형의 넓이는: " + area);
	}
	
}


