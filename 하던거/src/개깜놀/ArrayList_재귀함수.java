package 개깜놀;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_재귀함수 {
	
	public static void main(String[] args) {

		test(2);	 // 이게 되다니...

		
		int num = 7;
		test2(num);
		System.out.println(test2(num)); 	// 107
		System.out.println(num); 			// 7

		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(1);
		test3(arrList);
		arrList.add(3);
		for (int i = 0; i < arrList.size(); i++) {
			System.out.print(arrList.get(i) + " "); 	// 1 2 3  WOW!!!!
		}
		System.out.println();
		
		
		int[] arr = new int[3];
		arr[0] = 1;
		test4(arr);
		System.out.println(Arrays.toString(arr));		// [1, 2, 0]  wow....
	}

	
	public static int test(int a) {
		return a + 1;
	}

	public static int test2(int a) {
		a = a + 100;
		return a;
	}

	public static void test3(ArrayList<Integer> arrList) {
		arrList.add(2);		// void 대신 ArrayList써도 되고. return arrList로 하고.
	}
	
	public static int[] test4(int[] arr) {
		arr[1] = 2;
		return arr;
	}
}
