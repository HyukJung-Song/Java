package sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Bubble_sort {

	public static void main(String[] args) {

		// 랜덤배열 생성
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			Random r = new Random();
			arr[i] = r.nextInt(11);
		}

		// 버블소트
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j-1] > arr[j]) { // <는 내림차순
					int tmp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println("bubbleSort 결과: " + Arrays.toString(arr));

	}
}
