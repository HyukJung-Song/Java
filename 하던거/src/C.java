import java.util.Arrays;
import java.util.Random;

import 정리할것.Stu;
import 정리할것.Student;

public class C {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int[] arr = new int[10];
		for (int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(11);
		}
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}
}
