import java.util.ArrayList;

public class C {

	public static void main(String[] args) {
		
		test(2);	// 이게 되다니...
		
		
		int num = 7;
		test2(num);
		System.out.println(test2(num));		// 107
		System.out.println(num);			// 7
		
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(1);
		test3(arrList);
		arrList.add(3);
		for (int i=0; i<arrList.size(); i++) {
			System.out.print(arrList.get(i) + " ");
		}
	}
	
	public static int test(int a) {
		return a + 1;
	}
	
	public static int test2(int a) {
		a = a + 100;
		return a;
	}
	
	public static ArrayList<Integer> test3(ArrayList<Integer> arrList) {
		arrList.add(2);
		return arrList;
	}
}

