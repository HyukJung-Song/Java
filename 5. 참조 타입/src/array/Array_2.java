package array;

import java.util.Arrays;
import java.util.Collections;

public class Array_2 {

	public static void main(String[] args) {
		
		// 배열의 foreach문 활용
		int[] arr = {11,22,33,44, 7};
		System.out.println(Arrays.toString(arr));
		for(int value : arr) {
			System.out.print(value + ",");
		}
		System.out.println("\n");
		
		
		// 오름차순 정렬
		int[] ar = {1,3,2,4};	
		double[] ar2 = {1.1, 3.3, 2.2, 4.4};
		char[] ar3 = {'a', 'c', 'b', 'd'};
		String[] ar4 = {"aa", "cc", "bb", "dd"};
		Arrays.sort(ar);	
		Arrays.sort(ar4);
		
		
		// 내림차순 정렬 
		Integer[] array = {1,3,2,4};	// 기본타입 -> Wrapper 클래스
		Character[] array2 = {'a', 'c', 'b', 'd'};
		String[] array3 = {"aa", "cc", "bb", "dd"};
		Arrays.sort(array3, Collections.reverseOrder());
		System.out.println(Arrays.toString(array3));

		
	}
}
