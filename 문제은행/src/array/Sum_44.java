package array;

import java.util.Random;

public class Sum_44 {
	public static void main(String[] args) {
		Random r = new Random();
		
		int[][] arr = new int[4][4];
//		System.out.println("a");
		
		for (int i=0; i<arr.length-1; i++) {
			for (int j=0; j<arr[i].length-1; j++) {
				arr[i][j] = r.nextInt(10);
			}
		}
		
		// 한번에 물줄기가 3줄씩 뻗어나감. 개신기하노
		for (int i=0; i<arr.length-1; i++) {
			for (int j=0; j<arr.length-1; j++) {
				arr[i][3] = arr[i][3] + arr[i][j];	// x축 합계
				arr[3][j] = arr[3][j] + arr[i][j];	// y축 합계
				arr[3][3] = arr[3][3] + arr[i][j];	// 총 합계
			}
		}
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}

	}
}
