

import java.util.Arrays;

public class Basic {
	
	public static void main(String[] args) {
		
		// 다양한 배열의 모습
		int[] ar = {1,2,3};
		char[] ar2 = {'a', 'b', 'c'};
		String[] ar3 = {"aa", "bb", "cc"};
		Integer[] ar4 = {1,2,3,4};		// Wrapper Class
		Double[] ar5 = {1.1, 2.1, 3.1};
		
		
		// 배열 초기화
		int[] arr = {1,2,3,4,5};	// 값 넣어주면서 초기화, (x)[1,2,3,4,5])
		int[] arr2 = new int[5];	// 값 없이 초기화
		
		
		// 이중배열 초기화1
		int[][] arr3 = {{1,1},{2,2},{3,3}};
		
		
		// 이중배열 초기화1
		int[][] arr4 = new int[2][2];
		arr4[0][0] = 1;
		arr4[0][1] = 1;		
		arr4[1][0] = 2;
		arr4[1][1] = 2;
		
		
		// 배열 내용 및 길이
		System.out.println(Arrays.toString(arr));	// 배열 내용확인
		System.out.println(arr.length);	// 배열 길이확인
		System.out.println();
		
		

		
	}
}
