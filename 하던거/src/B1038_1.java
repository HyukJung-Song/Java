import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class B1038_1 {

	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int idx = Integer.parseInt(br.readLine());
		
		ArrayList<Long> downNumList = new ArrayList<>();
		
		for (int i=0; i<10; i++) {
			getDownNumber(i, downNumList);
		}
		
		Collections.sort(downNumList);
		// System.out.println(Collections.max(downNumList));
		
//		for (int i=0; i<downNumList.size(); i++) {
//			System.out.print(downNumList.get(i) + " ");
//		}
		
		if (idx > 1022) {
			System.out.println(-1);
		} 
		else {
			System.out.println(downNumList.get(idx));
		}
	
	}
	
	public static void getDownNumber(long num, ArrayList<Long> downNumList) {
		
//		if(digit > 10) {
//			return;
//		}
		
		downNumList.add(num);
		
		for(int i=0; i<10; i++) {
			if(num%10 > i) {
				getDownNumber((num*10) + i, downNumList);
			}
		}
		
	}
}
