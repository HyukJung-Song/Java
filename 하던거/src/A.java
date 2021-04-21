import java.util.Arrays;
import java.util.Random;

public class A {
	public static void main(String[] args) {
		
		Random r = new Random();
		
		int[] arr = new int[10];
		for (int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(11);
		}
		System.out.println(Arrays.toString(arr));
		
		for (int i=0; i<arr.length-1; i++) {
			for (int j=1; j<arr.length-i; j++) {
				if(arr[j-1]>arr[j]) {
					int tmp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		// 중복값 안나오는 랜덤배열
		
		
		
	}
}
