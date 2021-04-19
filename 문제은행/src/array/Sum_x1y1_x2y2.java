package array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sum_x1y1_x2y2 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src\\array\\input_1.txt")); 

		Scanner sc = new Scanner(System.in);

		int arr_i = sc.nextInt();
		int arr_j = sc.nextInt();
		int[][] arr = new int[arr_i+1][arr_j+1];
		
		for (int i=1; i<=arr_i; i++) {
			for (int j=1; j<=arr_j; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}

		int testCase = sc.nextInt();
		for (int i=0; i<testCase; i++) {
			int sum = 0;
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			for (int j = x1; j <= x2; j++) {
				for (int k = y1; k <= y2; k++) {
					sum += arr[j][k];
				}
			}
			System.out.println(sum);
		}


	}

}
