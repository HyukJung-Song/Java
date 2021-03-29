package sort;

import java.util.Arrays;
import java.util.Random;

public class Selection_sort {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			Random r = new Random();
			int num = r.nextInt(101);
			arr[i] = num;					
		}
		
		selectionSort(arr);
	}
	
	public static void selectionSort(int[] arr) {

		for (int i=0; i<arr.length-1; i++) {
			int indexMin = i;
			for (int j=i+1; j<arr.length; j++) {
				if (arr[indexMin] > arr[j]) {
					indexMin = j;
				}
			}
			swap(arr, i, indexMin);
		}
		System.out.println("selectionSort 결과: " + Arrays.toString(arr));
	}
	
	public static void swap(int[] arr, int i, int j) {
		
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
