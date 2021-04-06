import java.util.Scanner;

public class Stu_ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1) 학생수 입력받아 Student 행렬 생성
		System.out.println("학생의 성적을 성적순으로 나열합니다."); 
		System.out.print("나열할 학생의 수를 입력해주세요 : ");
		int num = Integer.parseInt(sc.nextLine());
		// Student 리스트 생성 (null로 채워짐)
		Student[] stuList = new Student[num];	// 이렇게만 만들면 null이 행렬에 3개 들어감
		// 리스트 내부에 객체 num개 생성 			 	// 그러면 값을 넣을 수가 없음(NullPointerException) 
		for (int i=0; i<stuList.length; i++) {	// 그래서 new ()로 반복해서 생성해야함.
			stuList[i] = new Student(); 
		}
		// 출력 확인
		for (int i=0; i<stuList.length; i++) {
			System.out.println(stuList[i]);
		}
		System.out.println();
		
		
		// 2) 이름과 점수 입력받아 행렬에 넣기
		for (int i=0; i<stuList.length; i++) {
			stuList[i].stuNum = i+1;
			System.out.println((i+1) + "번째 학생의 정보를 이름, 중간고사, 기말고사 성적순으로 입력해주세요.");
			System.out.print("이름: ");
			stuList[i].name = sc.nextLine();
			System.out.println((i+1) + "번째_이름 : " + stuList[i].name);
			System.out.print("중간고사 성적: ");
			stuList[i].midterm = Integer.parseInt(sc.nextLine());
			System.out.print((i+1) + "번째_중간 : " + stuList[i].midterm + "\n");
			System.out.print("기말고사 성적: ");
			stuList[i].finalterm = Integer.parseInt(sc.nextLine());
			System.out.print((i+1) + "번째_기말 : " + stuList[i].finalterm + "\n");
			System.out.println("==================\n");
		}
		
		// 출력 확인
		for (int i=0; i<stuList.length; i++) {
			System.out.println(stuList[i]);
		}
		System.out.println();
		
		
		
		
	}
}
