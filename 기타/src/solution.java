import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;


class Solution {
	static int N;
	static int AnswerN;

	public static void main(String args[]) throws Exception {
		
		System.setIn(new FileInputStream("src\\input.txt"));
 
		/*
		 * 표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
		Scanner sc = new Scanner(System.in);
		
		int T; 
		T = sc.nextInt(); // 3
		System.out.println("T: " + T);

		String EE1 = sc.nextLine();
		String EE = sc.nextLine();
		System.out.println("EE: " + EE);

//		int[] E = new int[EE.length];
//		for (int i=0; i<E.length; i++) {
//			E[i] = Integer.parseInt(EE[i]);
//		}
//		
//		System.out.println(Arrays.toString(E));
		

		
// N = sc.nextInt();

//		for (int test_case = 1; test_case <= T; test_case++) {
//			/*
//			 * 각 테스트 케이스를 표준 입력에서 읽어옵니다.
//			 * 
//			 *  3
//				3 10 10 1 5 6 8 2 17
//				4 3 3 2 1 4 2 5 3 4 5
//				1 3 3 1 1
//			 */
//			
//			
//			
//			// 20x20 배열 생성
//			int[][] arr = new int[20][20];
//
//			// 3 10 10 1 5 6 8 2 17
//			// 토끼 수 입력
//			int rabbits = sc.nextInt();
//
//			// 여우 x, y값 입력 받아서 인덱스로 써야되서 -1씩
//			int fox_x = sc.nextInt();
//			fox_x = fox_x - 1;
//			int fox_y = sc.nextInt();
//			fox_y = fox_y - 1;
//			arr[fox_x][fox_y] = 7;
//
//			// 토끼 x, y값 받아서 배열에 넣기
//			for (int i = 0; i < rabbits; i++) {
//				int rabbit_x = sc.nextInt();
//				int rabbit_y = sc.nextInt();
//				arr[rabbit_x - 1][rabbit_y - 1] = 1;
//			}
//
//			for (int i = 0; i < arr.length; i++) {
//				System.out.println(Arrays.toString(arr[i]));
//			}
//
//			// 토끼 잡기
//			int cnt = 0;
//			for (int i = 0; i < arr.length; i++) {
//				for (int j = 0; j < arr[i].length; j++) {
//					if (arr[i][j] == 1) {
//						// 가로 토끼잡음
//						if (i == fox_x) {
//							cnt++;
//							// 세로 토끼 잡음
//						} else if (j == fox_y) {
//							cnt++;
//							// 대각선 토끼 잡음(기울기 1/-1 이용)
//						} else if (((double) (i - fox_x) / (fox_y - j) == 1)
//								|| (double) (i - fox_x) / (fox_y - j) == -1) {
//							cnt++;
//						}
//					}
//				}
//			}
//			AnswerN = cnt;
//			
//			// 잡은 토끼 출력
//			System.out.println("#" + test_case + ": " + AnswerN);
//		}
	}
}

/* 
2
3 10 10 1 5 6 8 2 17
4 3 3 2 1 4 2 5 3 4 5
*/