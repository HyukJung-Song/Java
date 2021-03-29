package sort;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Exchange_sort {
	
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			Random r = new Random();
			int num = r.nextInt(101);
			arr[i] = num;					
		}
		
		bubbleSort(arr);
		
	}
	
	
	static void bubbleSort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {			
			for(int j=1; j<arr.length-i; j++) {		
				if (arr[j-1] > arr[j]) {			// <는 내림차순
					swap(arr, j-1, j);
				}
			}
		}
		System.out.println("bubbleSort 결과: " + Arrays.toString(arr));
	}
	
	private static void swap(int[] arr, int x, int y) {
		int tmp = arr[x];
		arr[x] = arr[y];
		arr[y] = tmp;
	}
	
	
}
