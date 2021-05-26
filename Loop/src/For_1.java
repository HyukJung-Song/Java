

public class For_1 {
	public static void main(String[] args) {

		// 기본 형태
		for (int i = 0; i < 5; i++) {
			System.out.print("*");
		}
		System.out.println();

		// 특이한 형태
		int z = 10;
		for (System.out.println("AAAA"); z < 15; z++) {
			System.out.println("BBBB");
		}
		System.out.println();

		// 구구단 2단
		int n = 2;
		for (int i = 1; i < 10; i++) {
			System.out.println(n + " X " + i + " = " + n * i);
		}
		System.out.println();

		// 구구단 2~9단
		for (int i = 2; i < 10; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.println(i + " X " + (j + 1) + " = " + i * (j + 1));
			}
			System.out.println("=============");
		}

		// continue, break
		for (int i = 0; i < 10; i++) {
			int num = i + 1;
			if (num % 2 == 0) {
				continue; // 짝수는 넘어감
			}
			if (num == 7) {
				break;
			}
			System.out.println(num);
		}
		System.out.println();
		
		
		// 1~100 까지의 합, 홀수합, 짝수합 (if 한번만, else x, else if x)
		int sumAll = 0;
		int sumOdd = 0;
		int sumEven = 0;
		
		for(int i=0; i<100; i++) {
			int num = i + 1;
			sumAll += num;
			if (num % 2 == 1) {
				sumOdd += num;
			} 
		}
		sumEven = sumAll - sumOdd;
		System.out.println("총합 : " + sumAll);
		System.out.println("홀수합 : " + sumOdd);
		System.out.println("짝수합 : " + sumEven);
		
		
		
		
		
		
		
		
		

	}
}
