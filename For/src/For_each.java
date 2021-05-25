

import java.util.Arrays;

public class For_each {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		System.out.println(start);
		
		// 배열의 foreach문 활용 
		int[] arr = {11, 22, 33, 44, 7};
		System.out.println(Arrays.toString(arr));
		for(int value : arr) {
			if (value == arr[arr.length-1]) {
				System.out.println(value);
				// return;
			} else {				
				System.out.print(value + ", ");
			}
		}
		System.out.println("\n");
		
		long end = System.currentTimeMillis();
		System.out.println(end);
		System.out.println("실행시간: " + (end - start) + "ms");
		
		
	}
}
