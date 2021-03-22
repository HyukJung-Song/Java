package loop;

public class For_1 {
	public static void main(String[] args) {

		// �⺻ ����
		for (int i = 0; i < 5; i++) {
			System.out.print("*");
		}
		System.out.println();

		// Ư���� ����
		int z = 10;
		for (System.out.println("AAAA"); z < 15; z++) {
			System.out.println("BBBB");
		}
		System.out.println();

		// ������ 2��
		int n = 2;
		for (int i = 1; i < 10; i++) {
			System.out.println(n + " X " + i + " = " + n * i);
		}
		System.out.println();

		// ������ 2~9��
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
				continue; // ¦���� �Ѿ
			}
			if (num == 7) {
				break;
			}
			System.out.println(num);
		}
		System.out.println();
		
		
		// 1~100 ������ ��, Ȧ����, ¦���� (if�ѹ���, else x, else if x)
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
		System.out.println("���� : " + sumAll);
		System.out.println("Ȧ���� : " + sumOdd);
		System.out.println("¦���� : " + sumEven);
		
		
		
		
		
		
		
		
		

	}
}
