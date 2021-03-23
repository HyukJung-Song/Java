import java.util.Arrays;
import java.util.Scanner;

public class B {
	public static void main(String[] args) {
 
		int[] arr = {5,4,3,1,2,55,22,11,100,200,0};
		int tmp;
		
		for (int i=0; i<arr.length-1; i++) {
			int min = arr[i];
			int min_idx = i;
			System.out.println("i:" + i + "   " + Arrays.toString(arr));
			for (int j=i; j<arr.length-1; j++) {
				if (min > arr[j+1]) {
					min = arr[j+1];
					min_idx = j+1;
				}
			}
			tmp = arr[i];
			arr[i] = arr[min_idx];
			arr[min_idx] = tmp;
			System.out.println("i(2): "+ Arrays.toString(arr));
		}
		
		System.out.println(Arrays.toString(arr));
		

	}
}
