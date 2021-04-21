package 정리할것;

import java.util.Arrays;
import java.util.Random;

public class Stu_Exec {


	public static void main(String[] args) {
		
		// class1 배열 생성
		Stu[] class1 = {
				new Stu("송1"),
				new Stu("송2"),
				new Stu("송3")
		};
				 
		
		// 중간, 기말점수 입력
		Random r = new Random();
		for (int i=0; i<class1.length; i++) {
			class1[i].mid = r.nextInt(50) + 51;
			class1[i].fin = r.nextInt(50) + 51;;
		}
		
		
		// 합, 평균 계산
		for (int i=0; i<class1.length; i++) {
			class1[i].calc_sum_avg();
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
		System.out.println("1반    중간   기말    합    평균");
		for (int i=0; i<class1.length; i++) {
			System.out.printf("%s%6d%6d%6d   %.1f\n", class1[i].name, 
					class1[i].mid, class1[i].fin, class1[i].sum, class1[i].avg);
		}
		System.out.print("---\n총계");
		System.out.printf("%6d%6d%6d   %.2f\n", classMidTotal, 
				classFinTotal, classSumTotal, classAvgTotal);
		

		
	}
}
