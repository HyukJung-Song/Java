package array;

import java.util.Arrays;
import java.util.Scanner;

public class Max_Min_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		int numCnt = sc.nextInt();
		System.out.println("----");
		int[] arr = new int[numCnt];

		for (int i = 0; i < numCnt; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("----");

		int max = arr[0];
		int min = arr[0];
		
		for (int i = 0; i < numCnt; i++) {
			if (min < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
		

	}
}
