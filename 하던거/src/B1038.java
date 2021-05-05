import java.util.ArrayList;
import java.util.Arrays;

public class B1038 {

	public static void main(String[] args) {
		
		ArrayList<Integer> downNumList = new ArrayList<>();
		
		
		getDownNumber(3, 1, downNumList);
		
		for (int i=0; i<downNumList.size(); i++) {
			System.out.print(downNumList.get(i) + " ");
		}
		
	}
	
	public static ArrayList getDownNumber(long num, int digit, ArrayList downNumList) {
		
		if(digit > 10) {
			return downNumList;
		}
		
		downNumList.add(num);
		
		for(int i=0; i<10; i++) {
			if(num%10 > i) {
				getDownNumber((num*10) + i, digit+1, downNumList);
			}
		}
		
		return downNumList;
	}
}
