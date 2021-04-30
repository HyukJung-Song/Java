
public class P1038 {
	
	static int decreaseNum(int a) {		
		return 0;
	}

	public static void main(String[] args) {
		
		int n = 20;
		int cnt = 0;
		
		// 한자리 감소하는수 출력
		for (int a = 0; a < 10; a++) {
			if (n == cnt) {
				System.out.print(a);
				return;
			} else {
				cnt++;
			}
		}

		// 두자리 감소하는수 출력
		for (int a = 1; a < 10; a++) {
			for (int b = 0; b < 9; b++) {
				if (a > b) {
					if (n == cnt) {
						System.out.print("" + a + b);
						return;
					} else {
						cnt++;
					}
				} else {
					break;
				}
			}
		}


		// 세자리 감소하는수 출력
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 9; j++) {
				for (int k = 0; k < 8; k++) {
					if (i > j && j > k) {
						System.out.print("" + i + j + k + " ");
					} else {
						break;
					}
				}
			}
		}
		System.out.println();

	}
}
