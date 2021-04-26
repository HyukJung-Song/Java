package 코딩실습;

import java.util.Arrays;
import java.util.Scanner;

public class Mid4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 수열의 길이 (셋다 모두 1~1000)
		int N = sc.nextInt();
		// 더해지는 횟수
		int M = sc.nextInt();
		// 특정 숫자 더해지는 최대횟수 
		int K = sc.nextInt(); 
		
		
		// 배열 생성한후 오름차순 정렬
		int[] arr = new int[N];
		for (int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		// 가장 큰수로 더하기
		int sum = 0;
		int cnt = K;
		for (int i=0; i<M; i++) {
			if (cnt > 0) {
				sum += arr[N-1];
				cnt--;
			} else {
				sum += arr[N-2];
				cnt = K; 
			}
		}
		
		// 출력
		System.out.println(sum);
		
		
		
	}
}
