

import java.util.Scanner;

public class Odd_even {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if (n % 2 == 0 && n > 0) {
			System.out.println("짝수");
		} else if (n > 0) {
			System.out.println("홀수");
		} else if (n < 0) {
			System.out.println("음수");
		} else {
			System.out.println("0");
		}

	}
}
