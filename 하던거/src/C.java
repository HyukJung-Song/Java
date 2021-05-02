import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

import 정리할것1.Stu;
import 정리할것1.Student;

public class C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	// 5 (수열의 길이, 셋다 모두 1~1000)
		int M = sc.nextInt();	// 5 (더해지는 횟수)
		int K = sc.nextInt();	// 2 (특정 숫자 더해지는 최대횟수)
		
		int[] arr = new int[N];
		for (int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);			// arr = [1, 2, 3, 4, 5] 
		
		int sum = 0;
		int cnt = K;				// cnt = 2
		for (int i=0; i<M; i++) {	// 5회 더해짐
			if (cnt > 0) {  		// cnt = 2, 1
				sum += arr[N-1];	// sum += 5
				cnt--;
			} else {				
				sum += arr[N-2];	// sum += 4
				cnt = K;			// cnt = 2
			}
		}
		System.out.println(sum);
		
	}
}
