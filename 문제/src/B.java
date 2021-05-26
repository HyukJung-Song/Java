import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class B {
	
	public static void main(String[] args) {

		double[] arr = {-1.0, -1.0, 2.0, 3.0, 3.0, 3.0, 3.0};
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		// [-1.0, -1.0, 2.0, 3.0, 3.0, 3.0, 5.0]
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		int cnt = 0;
		for (int i=0; i<arr.length-1; i++) {
			if (arr[i] == arr[i+1]) {
				cnt++;
				if (i == arr.length-2) {	// 마지막
					arrList.add(cnt);
				}
			} else {
				if (cnt != 0) {					
					arrList.add(cnt);
				}
				cnt=0;
			}
		}
		
		arrList.sort(null);
		System.out.println(arrList.size());
		System.out.println(arrList.get(arrList.size()-1));
		
		System.out.println(compareCount(5));
		
		
	}
	
	static int compareCount(int i) {
		
		if (i==1) {
			return 0;
		} else {
			return i-1 + compareCount(i-1);			
		}	
		
	}
}
