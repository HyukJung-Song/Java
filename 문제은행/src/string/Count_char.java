package string;

import java.util.Arrays;
import java.util.Scanner;

public class Count_char {

/*
3
*CDA
**AA
ABCD

>
1
2
1
 */

	public static void main(String[] args) {
		// System.setIn(new FileInputStream("src\\mid1.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();						// 3
		sc.nextLine();							
		
		int cntA;
		char[] charArr;
		for (int i=0; i<T; i++) {
			cntA = 0;
			charArr = sc.nextLine().toCharArray();	// "*CDA" -> [*, C, D, A]
			for (int j=0; j<charArr.length; j++) {
				if (charArr[j] == 'A') cntA++;
			}
			System.out.println(cntA);
		}
		
	}
}
