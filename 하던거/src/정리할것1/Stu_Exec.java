package 정리할것1;

import java.util.Arrays;
import java.util.Random;

public class Stu_Exec {

	// %6d
	public static void main(String[] args) {
		
		// class1 배열 생성
		Stu[] class1 = {
				new Stu("송1"),
				new Stu("송2"),
				new Stu("송3"),
				new Stu("송4"),
				new Stu("송5")
		};
				  
		
		// 중간, 기말점수 입력
		Random r = new Random();
		for (int i=0; i<class1.length; i++) {
			class1[i].mid = r.nextInt(51) + 50;
			class1[i].fin = r.nextInt(51) + 50;
		}
		
		
		// 합, 평균 계산
		for (int i=0; i<class1.length; i++) {
			class1[i].calc_sum_avg();
		}
		
		
		// sum기준 내림차순 정렬
		for (int i=0; i<class1.length-1; i++) {
			for (int j=i+1; j<class1.length; j++) {
				if (class1[i].sum < class1[j].sum) {
					Stu tmp = class1[i];
					class1[i] = class1[j];
					class1[j] = tmp;
				}
			}
		}
		
		
		// 순위 매기기
		for (int i=0; i<class1.length; i++) {
			if (i>0 && class1[i-1].sum == class1[i].sum) {
				class1[i].rank = class1[i-1].rank;
			} else {
				class1[i].rank = i+1;
			}
		}
		
		
		// 총계(중간, 기말, 합, 평균) 구하기
		int classMidTotal = 0;
		int classFinTotal = 0;
		int classSumTotal = 0;
		double classAvgTotal = 0.0;
		for (int i=0; i<class1.length; i++) {
			classMidTotal = classMidTotal + class1[i].mid;
			classFinTotal = classFinTotal + class1[i].fin;
			classSumTotal = classSumTotal + class1[i].sum;
		}
		classAvgTotal = classSumTotal / (class1.length * 2.0);
		
		
		// 출력
		System.out.println("1반    중간   기말    합    평균    순위");
		for (int i=0; i<class1.length; i++) {
			System.out.printf("%s%6d%6d%6d   %.1f%6d\n", class1[i].name, 
					class1[i].mid, class1[i].fin, class1[i].sum, class1[i].avg, class1[i].rank);
		}
		System.out.print("---\n총계");
		System.out.printf("%6d%6d%6d   %.2f\n", classMidTotal, 
				classFinTotal, classSumTotal, classAvgTotal);
		

		
	}
}
