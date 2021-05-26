package number;
import java.util.Scanner;

public class PrimeNumber_cnt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("number: ");
		int num = sc.nextInt();

		int cnt = 0;
		for (int i=1; i<num+1; i++) {
			if (num % i == 0) {
				cnt++;
			}
		}
		
		if (cnt == 2) {
			System.out.println(num + "is a PrimNumber");
		} else {
			System.out.println(num + "isn't a PrimeNumber");
		}
		

		

	}
}
