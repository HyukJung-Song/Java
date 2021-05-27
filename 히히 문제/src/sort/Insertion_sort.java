package sort;

import java.util.Arrays;

public class Insertion_sort {

	public static void main(String[] args) {

		int[] arr = {3, 7, 2, 5, 1, 4};

		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j-1] > arr[j]) {
					swap(arr, j-1, j);
				} else {
					break;	// ** 최적화 ** 
				}			// (왼쪽이 작으면 더 왼쪽은 이미 정렬되어 있기에)
				System.out.println("i: " + i + " j: " + j);
				System.out.println(Arrays.toString(arr));
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

}
