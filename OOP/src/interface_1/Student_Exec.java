package interface_1;

import java.util.Arrays;
import java.util.Random;

public class Student_Exec {

	public static void main(String[] args) {

		Student[] class1 = { 
				new Student("학생1"), 
				new Student("학생2"), 
				new Student("학생3"), 
				};
		
		// 1. 총합, 평균 구하기(학생/클래스)
		System.out.println("1. ");
		Random random = new Random();
		int totalSum = 0;
		for (int i = 0; i < class1.length; i++) {
			class1[i].middleScore = random.nextInt(51) + 50;
			class1[i].finalScore = random.nextInt(51) + 50;
			class1[i].sum += class1[i].middleScore + class1[i].finalScore;
			totalSum += class1[i].sum;
			class1[i].avg = class1[i].sum/2.0;
		}
		System.out.println(Arrays.toString(class1));
		System.out.println("\nclass1의 총합: " + totalSum + "  class1의 평균: " + 
							(double)totalSum/(class1.length*2));
		System.out.println("\n");
		
		
		// 2. class1의 등수 입력
		for (int i=0; i<class1.length; i++) {
			
		}
		

		System.out.println("\n\n");
		System.out.println(Arrays.toString(class1));
		// 2. class1의 등수 출력
//		for (int i=0; i<class1.length-1; i++) {
//			for (int j=1; j<class1.length-i; j++) {
//				if (class1[j-1].sum > class1[j].sum) {
//					Student tmp = class1[j-1];
//					class1[j-1] = class1[j];
//					class1[j] = tmp;
//				}
//			}
//		}
		
//		System.out.println("i: " + i + " j: " + j + Arrays.toString(class1));
		
	}

}
