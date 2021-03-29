package array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Random_unique {

	public static void main(String[] args) {

		Random rd = new Random();
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(30) + 1;

			// 중복값 거르기
			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i]) {
					arr[i] = rd.nextInt(30) + 1;
					j = -1;
				}
			}	
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		

	}
}
