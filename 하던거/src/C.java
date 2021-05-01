import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import 정리할것1.Stu;
import 정리할것1.Student;

public class C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int T = Integer.parseInt(sc.nextLine());	// 3
		
		String[] strArr = new String[T]; 			// [str, str, str] -> strArr
		for (int i=0; i<T; i++) {
			strArr[i] = sc.nextLine();
		}											// ["*CDA", "**AA", "ABCD"] -> strArr

		int[] cntArr = new int[T];					// [int, int, int] -> cntArr 
		for (int i=0; i<T; i++) {
			int cntA = 0;
			for (int j=0; j<strArr[i].length(); j++) {	// strArr[0] = "*CDA"  j=0~3
				if (strArr[i].charAt(j) == 'A') {
					cntA++;
				}
			}
			cntArr[i] = cntA;							// [1, int, int] -> cntArr 	
		}												
														// [1, 2, 1] => cntArr
		for (int i=0; i<cntArr.length; i++) {
			System.out.println(cntArr[i]);
		}



	}
}
