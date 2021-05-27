package number;
import java.util.Scanner;

public class PrimeNumber_100 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 101; i++) {
			boolean isPrime = true;
			 
			if (i < 2) {
				continue;
			} else {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime) {
					System.out.print(i + ",");
				}
			}
		}
		
		
	}
}

/*
	for (int i = 1; i < 201; i++) {
			int cnt = 0;
			for (int j = 1; j < i + 1; j++) {
				if (i % j == 0) {
					cnt++;
				}
			}
			if (cnt == 2) {
				System.out.print(i + ",");
			}
		}
*/
