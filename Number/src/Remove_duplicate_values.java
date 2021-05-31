
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Remove_duplicate_values {

	public static void main(String[] args) {
		
/*
 * 크기가 10인 배열에 1~30사이의 정수를 랜덤으로 넣되, 중복값은 제외하여 넣고 출력하라.
 * 
 * >
 * [1, 5, 7, 8, 10, 13, 20, 21, 25, 28]
 */

		Random rd = new Random();
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(30) + 1;

			// 중복값 거르기
			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i]) {
					i = i -1;
//					arr[i] = rd.nextInt(30) + 1;
//					j = -1;
				}
			}	
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		
		

	}
}
