
import java.util.Arrays;
import java.util.Random;

public class A {

	public static void main(String[] args) {
		
		int[] arr = {4, 3, 2, 1};
		int[] arr2_1 = new int[2];
		int[] arr2_2 = new int[2];
		int[] arr4 = new int[4];
		
		if(arr[0] > arr[1]) {
			swap(arr, 0, 1);
		}
		arr2_1[0] = arr[0];
		arr2_1[1] = arr[1];
		
		if(arr[2] > arr[3]) {
			swap(arr, 2, 3);
		}
		arr2_2[0] = arr[0];
		arr2_2[1] = arr[1];
		


	}
	
	public static void swap(int[] arr, int i, int j) {
		int tmp;
		tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
