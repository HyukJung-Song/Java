
import java.util.Arrays;
import java.util.Random;

public class C {
	public static void main(String[] args) {
		 
		// Warming Up (1)
		
		// 1) 1이상 100이하 자연수의 총합을 출력하는 프로그램을 작성하세요. (5)
		int sum = 0; 
		for (int i=1; i<101; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// 2) 1이상 100이하 자연수 중 짝수인 숫자의 합을 출력하는 프로그램을 작성하세요.(5)
		int total = 0;
		for (int i=1; i<101; i++) {
			if (i % 2 == 0) {
				total += i;
			}
		}
		System.out.println(total);
		
		// 3) 구구단 6단을 출력하는 프로그램을 작성하세요.(5)
		for (int i=1; i<10; i++) {
			System.out.println("6 x " + i + " = " + 6 * i);
		}
		
		// 4) 아래 모양을 출력하는 프로그램을 작성하세요.(5)
		// *​
		// **
		// ***
		//​ ****
		for (int i=0; i<4; i++) {
			for (int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
				
		// 5) 아래 모양을 출력하는 프로그램을 작성하세요.(5)
		//​ ****
		// ***
		// **
		// *​
		for (int i=0; i<4; i++) {
			for (int j=0; j<4-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 6) 다음의 수를 오름차순으로 정렬하는 프로그램을 작성하시오.{7, 21, 8, 43, 3, 5}
		int[] arr = {7, 21, 8, 43, 3, 5};
		int tmp = 0;
		
		// 버블정렬
		for (int i=0; i<arr.length-1; i++) {
			for (int j=0; j<arr.length-1-i; j++) {
				if (arr[j] > arr[j+1]) {
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));


		
	}
}
