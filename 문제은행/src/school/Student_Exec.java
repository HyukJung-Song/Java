package school;

import java.util.Scanner;

public class Student_Exec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student[] stu = new Student[2];			// *** 까먹었...
		for (int i=0; i<2; i++) {
			System.out.print("이름 입력: ");
			String name = sc.nextLine();
			
			System.out.print("국어점수: ");
			String inputString = sc.nextLine();
			int kor = Integer.parseInt(inputString);
			
			System.out.print("영어점수: ");
			inputString = sc.nextLine();
			int eng = Integer.parseInt(inputString);
			
			System.out.print("수학점수: ");
			inputString = sc.nextLine();
			int math = Integer.parseInt(inputString);
			
			stu[i] = new Student(kor, eng, math);
		}
		
		int sumKor = 0;
		int sumEng = 0;
		int sumMath = 0;
		for (int i=0; i<stu.length; i++) {
			sumKor = sumKor + stu[i].kor;
			sumEng = sumEng + stu[i].eng;
			sumMath = sumMath + stu[i].math;
		}
		
		System.out.println("국어 총합: " + sumKor);
		System.out.println("영어 총합: " + sumEng);
		System.out.println("수학 총합: " + sumMath);
		
		
		

//		String[][] totalList = new String[3][];
//		for (int i = 0; i < 3; i++) {
//			System.out.print("성적입력(국어, 영어, 수학): ");
//			String score = sc.nextLine();
//			String[] scoreList = score.split(", ");
//			totalList[i] = scoreList;	
//		}
//		
//		for (int i = 0; i < totalList.length; i++) {
//			int kor = Integer.parseInt(totalList[i][0]);
//			int eng = Integer.parseInt(totalList[i][1]);
//			int math = Integer.parseInt(totalList[i][2]);
//			Student s = new Student(kor, eng, math);
//			s.printSum();
//		}

	}
}
