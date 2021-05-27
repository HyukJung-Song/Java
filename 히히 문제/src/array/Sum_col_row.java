package array;

import java.util.Arrays;
import java.util.Scanner;

public class Sum_col_row {

/*
2 3
2 4 8
10 12 14
3
1 1 
1 2 
2 2

>
12 14
16 14
16 36
 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[sc.nextInt()+1][sc.nextInt()+1];	// new int[3][4]
		                                                        //   j   
		for (int i=1; i<arr.length; i++) {						// i 0  0  0  0
			for (int j=1; j<arr[i].length; j++) {               //   0  2  4  8
				arr[i][j] = sc.nextInt();                       //   0 10 12 14
			}
		}
		
		int T = sc.nextInt();			// 3
		int x, y;
		int colSum, rowSum;
		for (int t=0; t<T; t++) {
			x = sc.nextInt();			// 1
			y = sc.nextInt();			// 1  (1, 1)
			
			colSum = 0;
			rowSum = 0;
			for (int i=1; i<arr.length; i++) {
				for (int j=1; j<arr[i].length; j++) {
					if (j==y) colSum += arr[i][j];		// (j==1) -> [1][1] + [2][1]
					if (i==x) rowSum += arr[i][j];		// (i==1) -> [1][1] + [1][2] + [1][3]
				}
			}
			System.out.println(colSum + " " + rowSum);
		}
		


	}
}
