import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Final_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		StringTokenizer stk = new StringTokenizer(str, ", ");
		
		List<Integer> list = new ArrayList<Integer>();
		while(stk.hasMoreTokens()){
			list.add(Integer.parseInt(stk.nextToken()));
		}

		int D = list.get(0);
		int size = list.size();
		int[] arr = new int[size-1];
		
		for (int i=1; i<size; i++) {
			arr[i-1] = list.get(i);
		}
		
		Arrays.sort(arr);
		
		List<Integer> list2 = new ArrayList<Integer>();
		
		for (int i : arr) {
            if(i % D == 0 && !list2.contains(i))
            	list2.add(i);
		}
		
		
		for (int i=0; i<list2.size(); i++) {
			if (i==list2.size()-1) {				
				System.out.print(list2.get(i));
			} else {				
				System.out.print(list2.get(i) + ", ");
			}
		}
		
		if (list2.size() == 0) {
			System.out.println(-1);
		}


		
	}
}
