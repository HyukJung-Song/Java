
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class A {
	
	public static void main(String[] args) {
		
		// 1
		System.out.println("No.1");
		int[][] arr = {{10, 33, 44}, {27, 5, 98}};
		
		System.out.println("Name       Quiz1      Quiz2      Quiz3       Sum      Avg");
		System.out.println("----------------------------------------------------------");
		System.out.print("Student1     ");
		int sum = 0;
		for (int i=0; i<arr[0].length; i++) {
			System.out.print(arr[0][i] + "         ");
			sum += arr[0][i];
		}
		System.out.print(sum + "     ");
		System.out.print((double)sum/arr[0].length);
		System.out.print("\nStudent2     ");
		
		sum = 0;
		for (int i=0; i<arr[1].length; i++) {
			System.out.print(arr[1][i] + "         ");
			sum += arr[1][i];
		}
		System.out.print(sum + "     ");
		System.out.printf("%.1f", (double)sum/arr[1].length);
		System.out.println("\n----------------------------------------------------------");
		
		System.out.print("tot          ");

		for (int i=0; i<arr[0].length; i++) {
			int tot = 0;
			for (int j=0; j<arr.length; j++) {
				tot += arr[j][i];
			}
			System.out.print(tot + "         ");
		}
		System.out.println("\n\n");
		
		
		// 2
		System.out.println("No.2");
		int[][] score = new int[2][4];
		// int[][] arr = {{10, 33, 44}, {27, 5, 98}};
		
		// score 2*4
		for (int i=0; i<score.length; i++) {
			int sum1 = 0;
			System.arraycopy(arr[i], 0, score[i], 0, arr[i].length);
			for (int j=0; j<arr[i].length; j++) {
				sum1 += arr[i][j];
			}
			score[i][arr[i].length] = sum1;
		}
		
		// score[][] 출력
		for (int i=0; i<score.length; i++) {
			System.out.println(Arrays.toString(score[i]));
		}
		System.out.println("\n");
		
		
		// 3 (2의 결과를 이용하여 총점 내림차순하여 성적표 출력)
		System.out.println("No.3");
		for (int i=0; i<score.length-1; i++) {
			for (int j=1; j<score.length-i; j++) {
				if (score[i][3] < score[j][3]) {
					int[] tmp = score[i];
					score[i] = score[j];
					score[j] = tmp;
				}
			}
		}
		
		// score[][] 출력
		for (int i=0; i<score.length; i++) {
			System.out.println(Arrays.toString(score[i]));
		}
		
			
		
		
		
		
		
	}
}
