package school;

import java.util.Arrays;
import java.util.Random;

public class Test {
	public static void main(String[] args) {
		
		Random r = new Random();
		
		// 랜덤숫자 배열에 넣기
		int[] arr = new int[20];
		for (int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(50);
		}
		System.out.println(Arrays.toString(arr));
		
		// 내림차순 정렬(선택정렬)
		for (int i=0; i<arr.length-1; i++) {
			int maxIdx = i;
			for (int j=i+1; j<arr.length; j++) {
				if (arr[maxIdx] < arr[j]) {
					maxIdx = j;
				}
			}
			swap(arr, i, maxIdx);
		}
		System.out.println(Arrays.toString(arr));
	}
	
	// 배열값 변경 메소드
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
