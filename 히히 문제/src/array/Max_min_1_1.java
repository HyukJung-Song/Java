package array;

import java.util.Arrays;
import java.util.Scanner;

public class Max_min_1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력횟수: ");
		int cnt = Integer.parseInt(sc.nextLine());
		System.out.println("----");		
		
		String[] arr = sc.nextLine().split(" ");
		System.out.println("----");
		
		int min = 1000001, max = -1000001;
		for (int i=0; i<cnt; i++) {
			int n = Integer.parseInt(arr[i]);
			min = Math.min(min, n);
			max = Math.max(max, n);
		}
		
		System.out.println(min + " " + max);		
	}
}
