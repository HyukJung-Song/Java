package 코딩실습;

import java.util.Arrays;
import java.util.Scanner;

public class Mid3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 배열 행열 입력받아 배열생성
		int row = sc.nextInt();
		int line = sc.nextInt();
		int[][] arr = new int[row][line];
		
		// 배열의 값 입력받기
		for (int i=0; i<row; i++) {
			for (int j=0; j<line; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		// 좌표값 입력받아 XY배열에 넣기
		int T = sc.nextInt();
		int[][] arrXY = new int[T][2];
		for (int i=0; i<T; i++) {
			arrXY[i][0] = sc.nextInt() -1;   
			arrXY[i][1] = sc.nextInt() -1;
		}
		
		// 출력
		for (int a=0; a<T; a++) {
			int sumLine = 0;
			int sumRow = 0;
			for (int i=0; i<row; i++) {
				for (int j=0; j<line; j++) {
					if (j == arrXY[a][1]) {
						sumLine += arr[i][j];
					}
					if (i == arrXY[a][0]) {
						sumRow += arr[i][j];
					}
				}
			}
			System.out.print(sumLine + " " + sumRow);
			System.out.println();
		}
		
		

		
		

//		for (int i=0; i<T; i++) {
//			s[i] = sc.nextLine();
//		}
//		
//		for (int i=0; i<row; i++) {
//			for (int j=0; j<line; j++) {
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}
		
	
		
		
	}
}
