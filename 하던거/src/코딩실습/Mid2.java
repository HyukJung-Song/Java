package 코딩실습;

import java.util.Arrays;
import java.util.Scanner;

public class Mid2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = Integer.parseInt(sc.nextLine());
		
		String[] s = new String[T];
		for (int i=0; i<T; i++) {
			s[i] = sc.nextLine();
		}
		

		for (int i=0; i<s.length; i++) {
			String[] s2 = s[i].split(" ");
			
			// String배열에서 int 배열로 변환
			int[] arrInt = new int[s2.length];
			for (int j=0; j<s2.length; j++) {
				arrInt[j] = Integer.parseInt(s2[j]);
			}
			
			// 정렬후 출력
			Arrays.sort(arrInt);
			for (int j=0; j<arrInt.length; j++) {
				System.out.print(arrInt[j] + " ");
			}
			System.out.println();
		}
		
		
	}
}
