

import java.util.ArrayList;

public class Basic {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		// 배열과 다르게 사이지를 처음부터 지정할 필요가 없군!!
		// 이처럼 자료형의 갯수가 가변하는 상황에서는 List를 써야 한다.

		// add
		System.out.println(list1);	// []
		list1.add(1);
		list1.add(2);
		list1.add(0, 3);			// 한칸 밀치고 들어감. 1은 index 1로 바뀜
		// list1.add("하하");		
		System.out.println(list1);	// [3, 1, 2]			

		
		
		// get, size
		// System.out.println(list1[2]);
		System.out.println(list1.get(0)); // 3
		// System.out.println(list1.length());
		System.out.println(list1.size()); // 3

		for (int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i) + ", "); // 3, 1, 2
		}
		System.out.println();

		 
		// contains
		System.out.println(list1.contains(3)); // true
		System.out.println(list1.contains(4)); // false

		
		// remove(인덱스) -> 삭제후 삭제된거 리턴
		System.out.println(list1.remove(0)); // 3 -> [1, 2] 됨,

		// remove(객체) -> 객체에 해당되는 항복 삭제후 삭제여부 리턴. (T/F)
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("a");
		list2.add("b");
		list2.add("c");
		list2.add("b");
		System.out.println(list2.remove("b")); // true
		list2.removeAll(list2);
//		System.out.println(list2.get(2));
		System.out.println(list2.size());

	}
}
