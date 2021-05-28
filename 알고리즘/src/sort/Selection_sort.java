package sort;

import java.util.Arrays;
import java.util.Random;

public class Selection_sort {

	public static void main(String[] args) {

		Random r = new Random();
		
		// 랜덤배열 생성
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(11);					
		}
		System.out.println(Arrays.toString(arr));
		
		// 선택정렬1 (0기준으로 계속 비교해서 수시로 바꿈. 이게 조금더 빠름. 거의 비슷)
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		// 선택정렬2 (최소값 index 찾아 한번만 바꿈)
		int indexMin, tmp;
		for (int i=0; i<arr.length-1; i++) {
			indexMin = i;
			for (int j=i+1; j<arr.length; j++) {
				if (arr[indexMin] > arr[j]) {
					indexMin = j;
				}
			}
			tmp = arr[i];
			arr[i] = arr[indexMin];
			arr[indexMin] = tmp;
		}
		System.out.println("selectionSort 결과: " + Arrays.toString(arr));

		


	}
}
