package class_1;
import java.util.Scanner;

public class Kaup {
	
	int kg = 0;
	int cm = 0;

	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("체중(kg), 신장(cm) 입력: ");
		String data = sc.nextLine(); 		
		String[] dataArr = data.split(",");
		
		kg = Integer.parseInt(dataArr[0]);
		cm = Integer.parseInt(dataArr[1].trim());
	}

	public void calc() {

		double m = cm / 100.0;
		double kau = kg / (m*m);
		
		if (kau >= 30) {
			System.out.println("비만!!");
		} else if (kau > 24) {
			System.out.println("과체중!");
		} else if (kau > 20) {
			System.out.println("정상^^");
		} else if (kau > 15) {
			System.out.println("저체중.");
		} else if (kau > 13) {
			System.out.println("여윔..");
		} else if (kau > 10) {
			System.out.println("영양실조증...");
		} else {
			System.out.println("소모증.....");
		}
		
		System.out.println("kg: " + kg);
		System.out.println("cm: " + cm);
		System.out.println("m: " + m);
		System.out.println("kau: " + kau);
	}
}
