import java.util.Arrays;
import java.util.Scanner;

public class SumOfSection_2042 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		
		int[] arr = new int[N];
		for (int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int a, b, c;
		int sum;
		for (int i=0; i<M+K; i++) {
			a = sc.nextInt();
			if (a == 1) {
				b = sc.nextInt();
				c = sc.nextInt();
				arr[b-1] = c;
			} else {
				b = sc.nextInt();
				c = sc.nextInt();
				sum = 0;
				for (int j=b-1; j<c; j++) {
					sum += arr[j];
				}
				System.out.println(sum);
			}
		}

	
	}
}

/*
5 2 2
1
2
3
4
5
1 3 6
2 2 5
1 5 2
2 3 5

 */
