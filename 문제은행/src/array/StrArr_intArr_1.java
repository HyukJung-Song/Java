package array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class StrArr_intArr_1 {
	
/*
5
1 2 3 4 5 6 7 8 9 10
7 5 2 1 2
4 5 2
2 6 4 8 10
1 3 7 5 9

>
1 2 3 4 5 6 7 8 9 10
1 2 2 5 7
2 4 5
2 4 6 8 10
1 3 5 7 9
 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();
		
		String[] tmp;
		int[] intArr;
		for (int i=0; i<T; i++) {
			tmp = sc.nextLine().split(" ");				// tmp = ["4", "5", "2"]
			intArr = new int[tmp.length];		
			for (int j=0; j<tmp.length; j++) {
				intArr[j] = Integer.parseInt(tmp[j]);	// intArr = [4, 5, 2]
			}
			Arrays.sort(intArr);						// intArr = [2, 4, 5]
			
			for (int num : intArr) {
				System.out.print(num + " ");			// 2 4 5
			}
			System.out.println();
		}
		System.out.println();
		
		
		// +
//		String[] tmp2;
//		int[] intArr2;
//		for (int i=0; i<T; i++) {
//			tmp2 = sc.nextLine().split(" ");									// tmp2 = ["4", "5", "2"]
//			intArr2 = Stream.of(tmp2).mapToInt(Integer::parseInt).toArray();	// tmp2 = [4, 5, 2]
//			Arrays.sort(intArr2);												// intArr = [2, 4, 5]
//			
//			Arrays.stream(intArr2).forEach(x->{System.out.print(x + " ");});	// 2 4 5	
//			System.out.println();
//		}
		
		
	}
}
