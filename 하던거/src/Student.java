import java.util.Arrays;
import java.util.Scanner;

public class Student {
	
	int stuNum;
	String name;
	int midterm;
	int finalterm;
	
	@Override
	public String toString() {
		return "학번: " + stuNum + ", 이름: " + name + 
				", 중간고사: " + midterm + ", 기말고사: " + finalterm;
	}
	

	
	



//	Scanner s = new Scanner(System.in);
//	
//	void Inputnum (){
//		System.out.print("학생의 성적을 성적순으로 나열합니다. 나열할 학생의 수를 입력해주세요.");
//		int stuNum = s.nextInt();
//		System.out.println(stuNum + "명의 성적을 나열합니다.\n");
//		Inputinfo(stuNum);
//	}
//	Student Inputinfo (int stuNum) {
//		for (int a = 1; a < stuNum + 1; a++) {
//
//		System.out.println(a + "번째 학생의 정보를 이름, 중간고사, 기말고사 성적순으로 입력해주세요.");
//		this.name = s.nextLine();
//		System.out.print(a + "번째_이름 : " + this.name);
//		this.midterm = s.nextInt();
//		System.out.print(a + "번째_중간 : " + this.midterm);
//		this.finalterm = s.nextInt();
//		System.out.print(a + "번째_기말 : " + this.finalterm);
//		// 순차적으로 입력받는 방법?
//		
//		System.out.println(a + "번째 학생의 정보입니다.\n이름 : " + name 
//				+ "\n중간고사 점수 : " + midterm
//				+ "\n기말고사 점수 : " + finalterm
//				+ "\n총점 : " + total(midterm, finalterm)
//				+ "\n평균 : " + total(midterm, finalterm)/2);
//		return name, total(midterm, finalterm);
//		// 위 두가지 값을 배열에 입력하기 위한 방법?
//	}
//	}
//	int total (int midterm, int finalterm) {
//		int total = midterm + finalterm;
//		
//		return total;
//	}
	
	
}
