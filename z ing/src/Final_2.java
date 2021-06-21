import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Final_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		StringTokenizer stk = new StringTokenizer(str, " ");
		
		List<Integer> list = new ArrayList<Integer>();
		while(stk.hasMoreTokens()){
			list.add(Integer.parseInt(stk.nextToken()));
		}
		
		int size = list.size();
		int[] arr = new int[size];
		
		for (int j=0; j<size; j++) {
			arr[j] = list.get(j);
		}
		
		String str2 = sc.nextLine();
		StringTokenizer stk2 = new StringTokenizer(str2, " ");
		
		List<Integer> list2 = new ArrayList<Integer>();
		while(stk2.hasMoreTokens()){
			list2.add(Integer.parseInt(stk2.nextToken()));
		}
		
		size = list2.size();
		int[] arr2 = new int[size];
		
		for (int j=0; j<size; j++) {
			arr2[j] = list2.get(j);
		}

		Arrays.sort(arr);
		Arrays.sort(arr2);

		System.out.println(equals(arr, arr2));
	}
	
	static String equals(int[] arr1, int[] arr2) {
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i] != arr2[i]){
				return "F";
			}
		}
		return "T";
	}
}
