package array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Repeated_remove {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src\\array\\input_2.txt"));
		Scanner sc = new Scanner(System.in);

		int testcase = sc.nextInt();	// 3
		for (int c = 0; c < testcase; c++) {	
			sc.nextLine();
			int cnt = sc.nextInt();		// 10
			int arr[] = new int[cnt];
			for (int i = 0; i < cnt; i++) {
				arr[i] = sc.nextInt();	// 1 3 3 4 5 2 6 7 6 7
			}
			
			System.out.println("arr 정렬전: " + Arrays.toString(arr));
			for (int i = 0; i < arr.length - 1; i++) {
				int minIdx = i;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[minIdx] > arr[j]) {
						minIdx = j;
					}
				}
				int tmp = arr[minIdx];
				arr[minIdx] = arr[i];
				arr[i] = tmp;
			}
			System.out.println("arr 정렬후: " + Arrays.toString(arr));

			System.out.print("중복값 제거후: ");
			for (int i = 0; i < arr.length; i++) {
				int cntSame = 0;
				for (int j = i - 1; j >= 0; j--) {
					if (arr[i] == arr[j]) {
						cntSame++;
					}
				}
				if (cntSame == 0) {
					System.out.print(arr[i]);
				}
			}
			System.out.println();
		}
	}
}
