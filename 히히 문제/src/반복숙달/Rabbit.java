package 반복숙달;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Rabbit {

	public static void main(String[] args) {
		
/*
 * 각 테스트 케이스를 표준 입력에서 읽어옵니다.
 * 
 *  3
	3 10 10 1 5 6 8 2 17
	4 3 3 2 1 4 2 5 3 4 5
	1 3 3 1 1
 */
		
		// System.setIn(new FileInputStream("src\\input.txt"));  //  \\input.txt는 안됨!!   \, /, 안됨. \\만 됨.
		Scanner sc = new Scanner(System.in);

		// 20x20 배열 생성 (21x21)
		// arr > map
		int[][] arr = new int[20][20];

		// 토끼 수 입력
		int rabbits = sc.nextInt();
		
		// 여우 x, y값 입력 받아서 인덱스로 써야되서 -1씩
		int fox_x = sc.nextInt();
		fox_x = fox_x - 1;
		int fox_y = sc.nextInt();
		fox_y = fox_y - 1;
		arr[fox_x][fox_y] = 7;

		// 토끼 x, y값 받아서 배열에 넣기
		for (int i = 0; i < rabbits; i++) {
			int rabbit_x = sc.nextInt();
			int rabbit_y = sc.nextInt();
			arr[rabbit_x - 1][rabbit_y - 1] = 1;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

		// 토끼 잡기 
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 1) {
					// 가로 토끼잡음
					if (i == fox_x) {
						cnt++;
					// 세로 토끼 잡음
					} else if (j == fox_y) {
						cnt++;
					// 대각선 토끼 잡음(기울기 1/-1 이용  Math.abs() 절대값. (i - fox_x) / (j - fox_y) 
					} else if (((double) (i - fox_x) / (fox_y - j) == 1) || (double) (i - fox_x) / (fox_y - j) == -1) {
						cnt++;
					}
				}
			}
		}

		// 잡은 토끼 출력
		System.out.println(cnt);

	}

}
