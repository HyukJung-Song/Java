package array;

import java.util.Arrays;
import java.util.Scanner;

public class Max_min_1 {

	public static void main(String[] args) {

		// 1차원 배열을 이용해 최댓값, 최솟값 구하기 (백준 10818)
		// 문제: N개의 정수가 주어진다. 이떄, 최솟값과 최댓값을 구하는 프로그램을 작성하라
		// 입력: 첫째 줄에 정수의 개수 N(1<=N<=1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
		//      모든 정수는 -1,000,000보다 크거나 같고 1,000,000보다 작거나 같다.
		// 출력: 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력하라.
		
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
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min + " " + max);
		

	}
}
