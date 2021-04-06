
public class Student_Exec {

	public static void main(String[] args) {
		
		Student1[] stu = {new Student1("김1",10,100),
						 new Student1("김2",20,80),
						 new Student1("김3",30,30),
						 new Student1("김4",40,90),
						 new Student1("김5",50,40),
						 new Student1("김6",60,63),
						 new Student1("김7",70,72),
						 new Student1("김8",80,81),
						 new Student1("김9",90,59),
						 new Student1("김10",100,100),
		};			
		
		// Q1. 총점/평균 출력
		// 총점

		System.out.print("중간고사 총점: " + midSum);
		System.out.print(" / 기말고사 총점: " + finalSum);
		System.out.print(" / 총 총점: " + totalSum);
		System.out.println();
		
		// 평균

		System.out.print("중간고사 평균: " + midAve);
		System.out.print(" / 기말고사 평균: " + finalAve);
		System.out.print(" / 총 평균: " + totalAve);
		System.out.println("\n");
		
		
		// Q2. 성적순으로 출력
		// 1) 중간고사 성적순 (오름차순, 선택정렬)
		for (int i=0; i<stu.length-1; i++) {
			int minIdx = i;
			for (int j=i+1; j<stu.length; j++) {
				if (stu[minIdx].midScore > stu[j].midScore) {
					minIdx = j;
				}
			}
			swap(stu, i, minIdx);
		}
		System.out.println("<중간고사 성적순>");
		for (int i=0; i<stu.length; i++) {
			System.out.println(stu[i]);
		}
		System.out.println();
		
		// 2) 기말고사 성적순 (내림차순, 버블정렬)
		for (int i=0; i<stu.length-1; i++) {
			for (int j=1; j<stu.length-i; j++) {
				if (stu[j-1].finalScore < stu[j].finalScore) {
					swap(stu, j-1, j);
				}
			}
		}
		System.out.println("<기말고사 성적순>");
		for (int i=0; i<stu.length; i++) {
			System.out.println(stu[i]);
		}
		System.out.println("\n");
		
		
		// 3) 총 성적순
		// 중간과 기말의 합을 stu배열에 추가하기.
//		for (int i=0; i<stu.length; i++) {
//			int total = stu[i].midScore + stu[i].finalScore;
//			stu[i].totalScore = total;
//		}
		
		// 총 성적순으로 정렬 (삽입정렬)
		for (int i=1; i<stu.length; i++) {
			for (int j=i; j>0; j--) {
				if (stu[j-1].totalScore > stu[j].totalScore) {
					swap(stu, j-1, j);
				}
			}
		}
		System.out.println("<총 성적순>");
		for (int i=0; i<stu.length; i++) {
			System.out.println(stu[i]);
		}
	}
	
	public static void calc_sum_avg (Student1[] stu) {
		
		// 총점
		int midSum = 0;
		int finalSum = 0;
		int totalSum = 0;
		for (int i=0; i<stu.length; i++) {
			midSum = midSum + stu[i].midScore;
			finalSum = finalSum + stu[i].finalScore;
			totalSum = totalSum + stu[i].totalScore;
		}
		
		// 평균
		double midAve = (double)midSum / stu.length;
		double finalAve = (double)finalSum / stu.length;
		double totalAve = (double)totalSum / stu.length;
	}
	
	static void swap(Student1[] arr, int i, int j) {
		Student1 tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
