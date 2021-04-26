package 코딩실습;

import java.util.Arrays;
import java.util.Scanner;

public class Mid5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 배차할 학생수 입력받기 (1~999)
		int numStudents = sc.nextInt(); 

		// 가장 적은 비용의 버스 배차수 출력하기
		// 최대 25인승 40, 45인승 22
		int min = 1000;		// 최대금액 1000만원으로 잡음.
		int min45=22, min25=40;
		for (int i = 22; i>=0; i--) {		// 45인승
			for (int j = 40; j>=0; j--) {	// 25인승
				int sum = 45*i + 25*j;
				if (sum >= numStudents && sum <= min) {
					min = sum;
					min45 = i;
					min25 = j;
				}
			}
		}
		
		// 45인승, 25인승 버스 배차수 출력
		System.out.println(min45 + " " + min25);	
	}
}
