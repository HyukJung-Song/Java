package class_1;
import java.util.Scanner;

public class Exec {
	public static void main(String[] args) {
		
		while(true) {
			//안내문 출력
			System.out.println("넓이 계산을 원하는 도형을 선택해주세요.");
			System.out.println("1.평행사변형");
			System.out.println("2.사각형");
			System.out.println("3.원");
			System.out.println("4.사다리꼴");
			System.out.println("5.삼각형");
			System.out.println("6.종료");
			Scanner scan = new Scanner(System.in);
			String userInput = scan.nextLine();
			
			if (userInput.equals("1")) { //박영선class 실행
				Para para = new Para();
				para.inputData();
				para.calcArea();
			} else if(userInput.equals("2")) { //이혜진class 실행
				Rec rec = new Rec();
				rec.inputData();
				rec.calcArea();
			} else if(userInput.equals("3")) { //이아림class 실행
				Circle circle = new Circle();
				circle.inputData();
				circle.calcArea();
			} else if(userInput.equals("4")) { //송혁중class 실행
				Trapezoid trapezoid = new Trapezoid();
				trapezoid.inputData();
				trapezoid.calcArea();
			} else if(userInput.equals("5")) { //배영현class 실행
				Tria tria = new Tria();
				tria.inputData();
				tria.calcArea();
			
			}	else if(userInput.equals("6")) { //종료
				break;
			}
		}
	}
}

