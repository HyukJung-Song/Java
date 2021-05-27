package number;

import java.util.Scanner;

public class PrimeNumber_input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("*** 소수 판별기 ***");

		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		boolean isPrime = true;
		
		if (num < 2) {
			System.out.println("소수가 아닙니다.");
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				} 
			}
			if (isPrime) {
				System.out.println(num + "은(는) 소수입니다.");
			} else {
				System.out.println(num + "은(는) 소수가 아닙니다.");
			}
		}
		
		sc.close();	
	}
}
